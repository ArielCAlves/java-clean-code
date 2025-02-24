package org.example.repository;

import org.example.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private final List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }
}
