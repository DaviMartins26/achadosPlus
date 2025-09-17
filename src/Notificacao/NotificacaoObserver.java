package Notificacao;

import Model.Protocolo;
// aqui precisamos do protocolo pra saber das informações que seão enviadas

public interface NotificacaoObserver {
    void update(Protocolo protocolo, String mensagem);
}
