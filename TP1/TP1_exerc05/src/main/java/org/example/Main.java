package org.example;

import org.example.repository.BancoRepository;
import org.example.service.BancoService;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BancoRepository bancoRepository = new BancoRepository();
        BancoService bancoService = new BancoService(bancoRepository);

        bancoService.criarConta("João", new BigDecimal("5000.72"));
        bancoService.criarConta("Maria", new BigDecimal("2005.37"));

        bancoService.transferir("João", "Maria", new BigDecimal("1000.00"));
        bancoService.transferir("João", "Maria", new BigDecimal("5000.00"));
        bancoService.transferir("Maria", "João", new BigDecimal("3000.00"));
        bancoService.transferir("João", "", new BigDecimal("1000.00"));
    }
}
