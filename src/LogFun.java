public class LogFun extends  LogProtocolo{
    private int idLog;
    private String dataOcorrido;
    private UserAbstrato usuarioResponsavel;
    private UserAbstrato idModificado;
    private String Mudanca; // melhorar isso no futuro

    public LogFun(int idLog,String dataOcorrido,UserAbstrato usuarioResponsavel){
        super(idLog,dataOcorrido,usuarioResponsavel);
        this.idModificado = idModificado;
        this.Mudanca = Mudanca;
    }

    void registrarLog(){

    }

}