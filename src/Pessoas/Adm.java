package Pessoas;

public class Adm extends Funcionario {
    protected int id;
    protected String name;
    protected String email;
    protected String senha;
    // User tipoUsuario = Pessoas.Adm; // se ta errado em fun aqui tambem vai ta


    public Adm(int id, String name, String email, String senha) {
        super(id, name, email, senha);
    }

    @Override
    public void exibirMenu(){

    }

    public void gerenciarFun(){

    }

    public void verLogs(){

    }

}
