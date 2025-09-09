public class LogProtocolo extends LogAbstrato{
    private int idLog;
    private String dataOcorrido;
    private UserAbstrato usuarioResponsavel;
    private Objeto idObjeto;
    private int oldStatus;
    private int newStatus;

    public LogProtocolo(int idLog,String dataOcorrido,UserAbstrato usuarioResponsavel){
        super(idLog,dataOcorrido,usuarioResponsavel);
        this.idObjeto = idObjeto;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
    }

    void registrarLog(){

    }

}
