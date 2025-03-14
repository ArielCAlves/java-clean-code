package org.example;

import java.util.Arrays;
import java.util.List;

public class GermanFlag implements Flag {
    @Override
    public List<Color> getColors() {
        return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
    }
}
