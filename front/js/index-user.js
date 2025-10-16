document.addEventListener("DOMContentLoaded", () => {
    fetch("http://localhost:8080/login/usuario-logado", {
        method: "GET",
        credentials: "include" // importante: envia o cookie da sessão!
    })
    .then(response => {
        if (!response.ok) throw new Error("Usuário não logado");
        return response.json();
    })
    .then(usuario => {
        document.getElementById("login_sem_cadastro").textContent = usuario.nome;
    })
    .catch(() => {
        // Se não estiver logado, mostra o link normal
        document.getElementById("login_sem_cadastro").textContent = "Login";
    });
});
