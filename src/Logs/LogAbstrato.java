package Logs;

import Model.UserAbstrato;

public abstract class LogAbstrato {
    protected int idLog;
    protected String dataOcorrido;
    protected UserAbstrato usuarioResponsavel;

    public LogAbstrato(int idLog, String dataOcorrido, UserAbstrato usuarioResponsavel) {
        this.idLog = idLog;
        this.dataOcorrido = dataOcorrido;
        this.usuarioResponsavel = usuarioResponsavel;
    }

    // Template Method → cada subclasse implementa sua versão
    public abstract void registrarLog();
}
