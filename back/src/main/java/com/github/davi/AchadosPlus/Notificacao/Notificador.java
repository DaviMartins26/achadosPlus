// package com.github.davi.AchadosPlus.Notificacao;

// public class Notificador {
//     private NotificacaoStrategy strategy;

//     // Permite mudar a estratégia em tempo de execução
//     public void setStrategy(NotificacaoStrategy strategy) {
//         this.strategy = strategy;
//     }

//     public void notificar(String mensagem, String destinatario) {
//         if (strategy == null) {
//             throw new IllegalStateException("Nenhuma estratégia de notificação definida!");
//         }
//         strategy.enviarNotificacao(mensagem, destinatario);
//     }
// }

