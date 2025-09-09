public abstract class UserAbstrato {
    int id;
    String name;
    String email; //fazer um verificador de email?
    String senha; //fazer uma classe pra senha por segurança?
    // User tipoUsuario; // posso estar errado aqui mas a logica vai ser aplicada

    // precisa dessse construtor?
    public UserAbstrato(int id, String name, String email, String senha) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public abstract void login();

    public abstract void logout();

    public abstract void viewProtocolo();

    public abstract void gerarProtocolo();

    public abstract void exibirMenu();

}
