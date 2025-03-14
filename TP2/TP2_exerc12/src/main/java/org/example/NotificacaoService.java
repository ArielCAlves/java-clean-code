package org.example;

public class NotificacaoService {
    public void enviarNotificacao(TipoNotificacao tipo) {
        switch (tipo) {
            case EMAIL -> System.out.println("Enviando e-mail...");
            case SMS -> System.out.println("Enviando SMS...");
            case PUSH -> System.out.println("Enviando notificação push...");
        }
    }
}
