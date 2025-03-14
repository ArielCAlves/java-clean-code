package org.example;

public class Main {
    public static void main(String[] args) {
        NotificacaoService notificacaoService = new NotificacaoService();

        notificacaoService.enviarNotificacao(TipoNotificacao.EMAIL);
        notificacaoService.enviarNotificacao(TipoNotificacao.SMS);
        notificacaoService.enviarNotificacao(TipoNotificacao.PUSH);
    }
}
