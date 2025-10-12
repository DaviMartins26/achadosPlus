// package com.github.davi.AchadosPlus.Notificacao;


// import com.github.davi.AchadosPlus.Model.Entity.Protocolo;

// public class NotificacaoStrategyObserver implements NotificacaoObserver {
//     private Notificador notificador;

//     public NotificacaoStrategyObserver(Notificador notificador) {
//         this.notificador = notificador;
//     }

//     @Override
//     public void update(Protocolo protocolo, String mensagem) {
//         String destinatario = protocolo.getUserAbertura().getEmail();
//         notificador.notificar(mensagem, destinatario);
//     }
// }
