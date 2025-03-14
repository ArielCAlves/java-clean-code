package org.example;

import java.util.List;

public class Client {
    private final Nationality nationality;

    public Client(Nationality nationality) {
        this.nationality = nationality;
    }

    public List<Color> getFlagColors() {
        return FlagFactory.getFlag(nationality).getColors();
    }
}
