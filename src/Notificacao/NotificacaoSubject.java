package Notificacao;

import Model.Protocolo;
import java.util.ArrayList;
import java.util.List;

public class NotificacaoSubject {
    private List<NotificacaoObserver> observers = new ArrayList<>();

    public void addObserver(NotificacaoObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NotificacaoObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Protocolo protocolo, String mensagem) {
        for (NotificacaoObserver obs : observers) {
            obs.update(protocolo, mensagem);
        }
    }
}
