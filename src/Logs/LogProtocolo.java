package Logs;

import Model.Objeto;
import Model.UserAbstrato;

public class LogProtocolo extends LogAbstrato {
    private Objeto objetoRelacionado;
    private int oldStatus; // tem como pegar o status direto do objeto? tipo private Objeto objeto.status ou algo assim?
    private int newStatus;

    public LogProtocolo(int idLog,String dataOcorrido,UserAbstrato usuarioResponsavel,
                        Objeto objetoRelacionado, int oldStatus, int newStatus){
        super(idLog,dataOcorrido,usuarioResponsavel);
        this.objetoRelacionado = objetoRelacionado;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
    }

    @Override
    public void registrarLog() {
        System.out.println("[LOG PROTOCOLO] " +
                "ID: " + idLog +
                ", Data: " + dataOcorrido +
                ", Usuário: " + usuarioResponsavel +
                ", Objeto: " + objetoRelacionado +
                ", Status antigo: " + oldStatus +
                ", Status novo: " + newStatus);
    }

}
