package Logs;

import Model.UserAbstrato;
import Pessoas.Funcionario;

public class LogFun extends LogAbstrato {
    private Funcionario funcionarioModificado;
    private String mudanca;

    public LogFun(int idLog, String dataOcorrido, UserAbstrato usuarioResponsavel,
                  Funcionario funcionarioModificado, String mudanca) {
        super(idLog, dataOcorrido, usuarioResponsavel);
        this.funcionarioModificado = funcionarioModificado;
        this.mudanca = mudanca;
    }
    @Override
    public void registrarLog() {
        System.out.println("[LOG FUNCIONÁRIO] " +
                "ID: " + idLog +
                ", Data: " + dataOcorrido +
                ", Usuário: " + usuarioResponsavel +
                ", Funcionário alterado: " + funcionarioModificado +
                ", Mudança: " + mudanca);
    }
}