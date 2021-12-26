package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Frames {
    private final List<Frame> frames;

    public Frames() {
        List<Frame> frames = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            frames.add(new NormalFrame());
        }
        frames.add(new FinalFrame());
        this.frames = frames;
    }

    public Frames(List<Frame> frames) {
        this.frames = frames;
    }

    public int getFrameNumber() {
        return 1;
    }

    public boolean hasNext() {
        return true;
    }

    public List<Frame> getFrames() {
        return frames;
    }
}
