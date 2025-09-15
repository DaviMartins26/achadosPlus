import Notificacao.Notificador;
import Notificacao.NotificacaoEmail;
import Notificacao.NotificacaoSMS;
import Notificacao.NotificacaoPush;
import Logs.LogProtocolo;
import Model.Objeto;
import Model.UserAbstrato;

public class Main {
    public static void main(String[] args) {
        try {
            // Criando um objeto perdido
            Objeto objeto = new Objeto(1, "Carteira Preta", null, "Carteira de couro", null, 1);
            UserAbstrato usuario = new UserAbstrato("João", "joao@exemplo.com"); // supondo que UserAbstrato tenha esse construtor

            // Criando notificador
            Notificador notificador = new Notificador();

            String mensagem = "Seu objeto perdido foi encontrado!";
            String usuarioDestino = "usuario@exemplo.com";

            // =========================
            // Teste com diferentes estratégias
            // =========================

            // Notificação por E-mail
            notificador.setStrategy(new NotificacaoEmail());
            notificador.notificar(mensagem, usuarioDestino);

            // Notificação por SMS
            notificador.setStrategy(new NotificacaoSMS());
            notificador.notificar(mensagem, "+55 11 99999-0000");

            // Notificação por Push
            notificador.setStrategy(new NotificacaoPush());
            notificador.notificar(mensagem, "ID_Dispositivo_123");

            // =========================
            // Registro de Log de mudança de status
            // =========================
            int oldStatus = objeto.getStatus(); // status atual (1 = perdido)
            objeto.setStatus(2); // muda para encontrado
            int newStatus = objeto.getStatus();

            LogProtocolo log = new LogProtocolo(
                    1,
                    "2025-09-15",
                    usuario,
                    objeto,
                    oldStatus,
                    newStatus
            );

            log.registrarLog();

        } catch (Exception e) {
            System.err.println("Erro ao executar o sistema: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
