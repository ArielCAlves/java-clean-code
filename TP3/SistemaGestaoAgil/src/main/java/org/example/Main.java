package org.example;

import org.example.model.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("Maria", "maria@empresa.com", "Dev");
        Task task = new Task("Criar API", "Desenvolver endpoints REST");
        task.atribuirResponsavel(user);
        task.alterarStatus(Status.IN_PROGRESS);

        Sprint sprint = new Sprint("Sprint 1", LocalDate.now(), LocalDate.now().plusDays(14));
        sprint.adicionarTarefa(task);

        Project project = new Project("Sistema de Gestão", "Projeto para equipes ágeis");
        project.adicionarSprint(sprint);

        task.exibirDetalhes();

        Item item1 = new Item("PROD001", 2, new BigDecimal("25.00"));
        Item item2 = new Item("PROD002", 1, new BigDecimal("40.00"));

        Transacao transacao = new Transacao(List.of(item1, item2), Status.TODO);
        System.out.println("Transação criada com total: R$ " + transacao.getValorTotal());
        System.out.println("Itens da transação:");
        transacao.getItens().forEach(i -> System.out.println(i.getCodigo() + " - Qtde: " + i.getQuantidade() + " - Unitário: R$ " + i.getValorUnitario()));

        RegistroOperacao registro = new RegistroOperacao("REG123", TipoOperacao.VENDA, new BigDecimal("99.90"), 3, LocalDateTime.now());
        System.out.println("Registro de Operação - ID: " + registro.getId() + ", Tipo: " + registro.getTipo() + ", Valor: R$ " + registro.getValor() + ", Quantidade: " + registro.getQuantidade());
    }
}
