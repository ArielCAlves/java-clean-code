package org.example.service;

import org.example.interfaces.ProcessadorInterface;
import org.example.model.ValidadorDado;

public class ProcessadorService implements ProcessadorInterface {
    @Override
    public void processar(String dado) {
        if (!ValidadorDado.isNotNull(dado) || !ValidadorDado.isNotEmpty(dado)) {
            System.out.println("Dado inválido.");
            return;
        }

        if (ValidadorDado.isTamanhoValido(dado)) {
            System.out.println("Dado válido: " + dado);
        } else {
            System.out.println("Dado muito curto.");
        }
    }
}
