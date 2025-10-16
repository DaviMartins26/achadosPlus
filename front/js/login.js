document.addEventListener("DOMContentLoaded", () => {
    document.getElementById("form1").addEventListener("submit", function(event) {
        event.preventDefault();

        const email = document.getElementById("email_id").value;
        const senha = document.getElementById("senha_id").value;

        // Envia JSON pro backend Java
        fetch("http://localhost:8080/login", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                email: email,
                senha: senha
            })
        })
        .then(response => {
            if (!response.ok) {
                throw new Error("Login falhou");
            }
            return response.text();
        })
        .then(data => {
            console.log("Usuário logado:", data);

            // Armazena o ID do usuário logado na sessionStorage (ou localStorage)
            sessionStorage.setItem("usuarioId", data.idUsuario);

            // Redireciona de acordo com o tipo
            if (data.tipoUsuario === "ADM") {
                window.location.href = "../html/index-LogadoADM.html";
            } else if (data.tipoUsuario === "FUNCIONARIO") {
                window.location.href = "../html/index-LogadoFun.html";
            } else {
                window.location.href = "../html/index-Normal.html";
            }
        })
        .catch(error => {
            alert("Credenciais inválidas ou erro no servidor.");
            console.error("Erro:", error);
        });
    });
});
