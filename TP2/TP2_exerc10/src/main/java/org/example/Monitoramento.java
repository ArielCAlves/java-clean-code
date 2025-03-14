package org.example;

public class Monitoramento {
    private int contadorAcessos = 0;

    public int getContadorAcessos() {
        return contadorAcessos;
    }

    public void incrementarAcessos() {
        contadorAcessos++;
    }
}
