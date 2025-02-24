package org.example.model;

public class ValidadorDado {
    public static boolean isNotNull(String dado) {
        return dado != null;
    }

    public static boolean isNotEmpty(String dado) {
        return !dado.isEmpty();
    }

    public static boolean isTamanhoValido(String dado) {
        return dado.length() > 10;
    }
}
