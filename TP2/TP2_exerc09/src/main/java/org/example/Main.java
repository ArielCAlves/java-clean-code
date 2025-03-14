package org.example;

public class Main {
    public static void main(String[] args) {
        FilaMensagens fila = new FilaMensagens();

        fila.adicionarMensagem("Teste 1");
        fila.adicionarMensagem("Teste 2");

        System.out.println("Próxima mensagem: " + fila.visualizarProximaMensagem());
        System.out.println("Obtendo e removendo mensagem: " + fila.obterProximaMensagem());
        System.out.println("Próxima mensagem: " + fila.visualizarProximaMensagem());
        System.out.println("Obtendo e removendo mensagem: " + fila.obterProximaMensagem());
    }
}
