public abstract class LogAbstrato {
    int idLog;
    String dataOcorrido;
    UserAbstrato usuarioResponsavel;

    public LogAbstrato(int idLog,String dataOcorrido,UserAbstrato usuarioResponsavel){
        this.idLog = idLog;
        this.dataOcorrido = dataOcorrido;
        this.usuarioResponsavel = usuarioResponsavel;
    }

    void registrarLog(){

    }

}
