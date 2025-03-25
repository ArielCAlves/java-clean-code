package org.example.util;

import java.time.LocalDate;

public class ValidacaoDatas {
    public static boolean datasValidas(LocalDate inicio, LocalDate fim) {
        return inicio != null && fim != null && !fim.isBefore(inicio);
    }
}
