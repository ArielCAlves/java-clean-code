package org.example;

import java.util.Arrays;
import java.util.List;

public class ItalianFlag implements Flag {
    @Override
    public List<Color> getColors() {
        return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
    }
}
