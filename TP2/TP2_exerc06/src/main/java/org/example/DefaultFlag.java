package org.example;

import java.util.Collections;
import java.util.List;

public class DefaultFlag implements Flag {
    @Override
    public List<Color> getColors() {
        return Collections.singletonList(Color.GRAY);
    }
}
