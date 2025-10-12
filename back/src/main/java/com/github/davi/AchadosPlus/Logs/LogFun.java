// package com.github.davi.AchadosPlus.Logs;

// import com.github.davi.AchadosPlus.Model.Entity.UserAbstrato;
// import com.github.davi.AchadosPlus.Pessoas.Funcionario;


// public class LogFun extends LogAbstrato {
//     private Funcionario funcionarioModificado;
//     private String mudanca;

//     public LogFun(int idLog, String dataOcorrido, UserAbstrato usuarioResponsavel,
//                   Funcionario funcionarioModificado, String mudanca) {
//         super(idLog, dataOcorrido, usuarioResponsavel);
//         this.funcionarioModificado = funcionarioModificado;
//         this.mudanca = mudanca;
//     }
//     @Override
//     public void registrarLog() {
//         System.out.println("[LOG FUNCIONÁRIO] " +
//                 "ID: " + idLog +
//                 ", Data: " + dataOcorrido +
//                 ", Usuário: " + usuarioResponsavel +
//                 ", Funcionário alterado: " + funcionarioModificado +
//                 ", Mudança: " + mudanca);
//     }
// }