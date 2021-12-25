package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Frames {
    private final List<Frame> frames;

    public Frames() {
        this.frames = new ArrayList<>();
    }

    public Frames(List<Frame> frames) {
        this.frames = frames;
    }
}
