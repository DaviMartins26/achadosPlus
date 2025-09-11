package Logs;

import Model.UserAbstrato;

public abstract class LogAbstrato {
    int idLog;
    String dataOcorrido;
    UserAbstrato usuarioResponsavel;

    public LogAbstrato(int idLog,String dataOcorrido,UserAbstrato usuarioResponsavel){
        this.idLog = idLog;
        this.dataOcorrido = dataOcorrido;
        this.usuarioResponsavel = usuarioResponsavel;
    }

    // Template Method → cada subclasse vai implementar sua versão
    public abstract void registrarLog();
}
