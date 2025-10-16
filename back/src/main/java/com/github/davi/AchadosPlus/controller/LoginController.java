    package com.github.davi.AchadosPlus.controller;

    import com.github.davi.AchadosPlus.dto.UsuarioDTO;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import jakarta.servlet.http.HttpSession;
    import com.github.davi.AchadosPlus.Model.Entity.Usuario;
    import com.github.davi.AchadosPlus.service.LoginService;

    @RestController
    @RequestMapping("/login")
    @CrossOrigin( // isso ta tendando fazer o back e front se comunicar pra mandar o nome do usuario logado
            origins = "http://127.0.0.1:5500", // se deixar * não abre o server
            allowCredentials = "true"
    )
    public class LoginController {

        private final LoginService loginService;

        public LoginController(LoginService loginService) {
            this.loginService = loginService;
        }

        @PostMapping
        public String login(@RequestBody Usuario usuario, HttpSession session) {
            Usuario autenticado = loginService.autenticar(usuario.getEmail(), usuario.getSenha());
            if (autenticado != null) {
                session.setAttribute("usuarioId", autenticado.getIdUsuario());
                return "Login realizado com sucesso!";
            }
            return "Credenciais inválidas!";
        }

        //@GetMapping("/me")
        //public Integer getUsuarioLogado(HttpSession session) {
          //  return (Integer) session.getAttribute("usuarioId");
        //}

        @PostMapping("/logout")
        public String logout(HttpSession session) {
            session.invalidate();
            return "Sessão encerrada!";
        }

        // rota para pegar o usuário logado
        @GetMapping("/usuario-logado")
        public ResponseEntity<?> getUsuarioLogado(HttpSession session) {
            Usuario usuario = (Usuario) session.getAttribute("usuarioLogado");
            if (usuario != null) {
                UsuarioDTO dto = new UsuarioDTO(usuario.getIdUsuario(), usuario.getNome());
                return ResponseEntity.ok(dto);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Nenhum usuário logado");
            }
        }


    }
