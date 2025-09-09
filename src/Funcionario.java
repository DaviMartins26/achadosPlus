public class Funcionario extends UserAbstrato {
    protected int id;
    protected String name;
    protected String email;
    protected String senha;
    // User tipoUsuario = Funcionario; // isso aqui deve estar errado


    public Funcionario(int id, String name, String email, String senha) {
        super(id, name, email, senha);
    }

    public void login(){

    }

    public void logout(){

    }

    public void viewProtocolo(){

    }

    public void gerarProtocolo(){

    }

    @Override
    public void exibirMenu(){

    }

    public void registrarObjeto(){

    }

}
