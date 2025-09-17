package Pessoas;

import Model.UserAbstrato;

public class UserNormal extends UserAbstrato {
    protected int id;
    protected String name;
    protected String email;
    protected String senha;
    // User tipoUsuario = Pessoas.UserNormal; // se ta errado em fun aqui tambem vai ta


    public UserNormal(int id, String name, String email, String senha) {
        super(id, name, email, senha);
    }

    public void login(){

    }

    public void logout(){

    }
    // aqui deveria ser meus Protocolos
    public void viewProtocolo(){

    }

    public void gerarProtocolo(){

    }

    @Override
    public void exibirMenu(){

    }

    @Override
    public String getEmail() {
        return email;
    }
}
