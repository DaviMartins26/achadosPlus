//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Notificacao.Notificador;
import Notificacao.NotificacaoEmail;
import Notificacao.NotificacaoSMS;
import Notificacao.NotificacaoPush;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Notificador notificador = new Notificador();

        String mensagem = "Seu objeto perdido foi encontrado!";
        String usuario = "usuario@exemplo.com";

        // Notificação por e-mail
        notificador.setStrategy(new NotificacaoEmail());
        notificador.notificar(mensagem, usuario);

        // Troca para SMS
        notificador.setStrategy(new NotificacaoSMS());
        notificador.notificar(mensagem, "+55 11 99999-0000");

        // Troca para Push
        notificador.setStrategy(new NotificacaoPush());
        notificador.notificar(mensagem, "ID_Dispositivo_123");
    }
}