package org.example;

import java.util.Arrays;
import java.util.List;

public class FrenchFlag implements Flag {
    @Override
    public List<Color> getColors() {
        return Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
    }
}
