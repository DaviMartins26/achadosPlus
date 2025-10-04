package servlets;

import Pessoas.UserNormal;
import bd.ConexaoBanco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("cadastroUsuario")
public class CadastroUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Pegar os dados do formulário
        String nome = request.getParameter("txtNome");
        String email = request.getParameter("email");
        String cpf = request.getParameter("txtCPF");
        String senha = request.getParameter("txtSenha");
        String confirmar = request.getParameter("txtConfirmar");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Validação simples
        if (!senha.equals(confirmar)) {
            out.println("<h3>Erro: As senhas não conferem!</h3>");
            return;
        }

        try (Connection conn = ConexaoBanco.getConnection()) {
            String sql = "INSERT INTO usuarios (nome, email, cpf, senha) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, cpf);
            stmt.setString(4, senha);

            int linhas = stmt.executeUpdate();

            if (linhas > 0) {
                out.println("<h3>Usuário cadastrado com sucesso!</h3>");
                out.println("<a href='index.html'>Voltar para o início</a>");
            } else {
                out.println("<h3>Erro ao cadastrar usuário.</h3>");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<h3>Erro no banco: " + e.getMessage() + "</h3>");
        }
    }
}
