package bowling.domain;

import java.util.List;

public class Results {
    private final List<Pins> pins;

    public Results(List<Pins> pins) {
        this.pins = pins;
    }
}
