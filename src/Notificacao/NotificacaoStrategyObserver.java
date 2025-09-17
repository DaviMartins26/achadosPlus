package Notificacao;

import Model.Protocolo;
import Model.UserAbstrato;

public class NotificacaoStrategyObserver implements NotificacaoObserver {
    private Notificador notificador;

    public NotificacaoStrategyObserver(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void update(Protocolo protocolo, String mensagem) {
        String destinatario = protocolo.getUserAbertura().getEmail();
        notificador.notificar(mensagem, destinatario);
    }
}
