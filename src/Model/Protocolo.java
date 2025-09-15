package Model;

public class Protocolo {
    private int idProtocolo;
    private int status; // 0-aberto 1-fechado
    private String dataCriacao;
    private UserAbstrato userAbertura;
    private Funcionario funFechado;
    private String dataFechado;

    public Protocolo(int idProtocolo, int status, String dataCriacao,
                     UserAbstrato userAbertura, Funcionario funFechado, String dataFechado) {
        this.idProtocolo = idProtocolo;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.userAbertura = userAbertura;
        this.funFechado = funFechado;
        this.dataFechado = dataFechado;
    }

    public int getIdProtocolo() {
        return idProtocolo;
    }

    public int getStatus() {
        return status;
    }

    public void fecharProtocolo(int idProtocoloMudar, String dataAtual) {
        if (idProtocolo == idProtocoloMudar) {
            status = 1;
            dataFechado = dataAtual;
        }
    }

    public String getResumo() {
        return "ID:" + idProtocolo + " Status:" + status + " Criado em:" + dataCriacao;
    }
}
