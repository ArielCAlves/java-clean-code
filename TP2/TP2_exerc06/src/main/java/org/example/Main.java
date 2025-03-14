package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(Nationality.DUTCH);
        Client client2 = new Client(Nationality.GERMAN);
        Client client3 = new Client(Nationality.UNCLASSIFIED);

        System.out.println("Cores da bandeira do Cliente 1: " + client1.getFlagColors());
        System.out.println("Cores da bandeira do Cliente 2: " + client2.getFlagColors());
        System.out.println("Cores da bandeira do Cliente 3: " + client3.getFlagColors());
    }
}
