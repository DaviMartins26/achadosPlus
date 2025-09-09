public class Protocolo {
    private int idProtocolo;
    private int status; //0-aberto 1-fehcado mesma coisa com objeto
    private String dataCriacao; // usar dado de data de verdade, aqui é so um exemplo
    private UserAbstrato userAbertura; // pessoa que abriu
    private Funcionario funFechado; //funcionario que fechou
    private String dataFechado;

    public Protocolo(int idProtocolo, int status, String dataCriacao,UserAbstrato userAbertura,Funcionario funFechado,String dataFechado){
        this.idProtocolo = idProtocolo;
        this.status = 0;
        this.dataCriacao = dataCriacao;
        this.userAbertura = userAbertura;
        this.funFechado = null;
        this.dataFechado = null;
    }

    public void fecharProtocolo(int idProtocoloMudar,String dataAtual) {
        if (idProtocolo == idProtocoloMudar) {
            status = 1;
            dataFechado = dataAtual;
        }
    }

    //Melhorar isso
    public void getResumo(){
        System.out.println("ID:"+idProtocolo+" Status:"+status+"Criado em:");
    }

}
