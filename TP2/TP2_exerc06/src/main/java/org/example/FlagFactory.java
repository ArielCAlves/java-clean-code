package org.example;

import java.util.HashMap;
import java.util.Map;

public class FlagFactory {
    private static final Map<Nationality, Flag> flags = new HashMap<>();

    static {
        flags.put(Nationality.DUTCH, new DutchFlag());
        flags.put(Nationality.GERMAN, new GermanFlag());
        flags.put(Nationality.BELGIAN, new BelgianFlag());
        flags.put(Nationality.FRENCH, new FrenchFlag());
        flags.put(Nationality.ITALIAN, new ItalianFlag());
    }

    public static Flag getFlag(Nationality nationality) {
        return flags.getOrDefault(nationality, new DefaultFlag());
    }
}
