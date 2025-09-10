package Notificacao;

public class NotificacaoEmail implements NotificacaoStrategy {
    @Override
    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Enviando E-MAIL para " + destinatario + ": " + mensagem);
        // Aqui poderia ir a lógica real de envio de e-mail
    }
}

