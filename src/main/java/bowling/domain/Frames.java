package bowling.domain;

import java.util.ArrayList;
import java.util.List;

public class Frames {
    private static final int BOWLING_START_FRAME_INDEX = 1;
    private static final int BOWLING_END_NORMAL_FRAME_INDEX = 9;
    private static final int BOWLING_END_FRAME = 10;

    private final List<Frame> frames;
    private final FrameIndex frameIndex;

    public Frames() {
        List<Frame> frames = new ArrayList<>();
//        for (int i = BOWLING_START_FRAME_INDEX; i <= BOWLING_END_NORMAL_FRAME_INDEX; i++) {
//            frames.add(new NormalFrame());
//        }
//        frames.add(new FinalFrame());
        this.frames = frames;
        this.frameIndex = new FrameIndex(BOWLING_END_FRAME - 1);
    }

    private Frames(List<Frame> frames, FrameIndex frameIndex) {
        this.frames = frames;
        this.frameIndex = frameIndex;
    }

    public Frame findFrame() {
        if (frames.isEmpty()) {
            NormalFrame frame = new NormalFrame();
            frames.add(frame);
            return frame;
        }
        return findBeforeFrame();
    }

    private Frame findBeforeFrame() {
        return frames.get(frameIndex.getNowIndex() - 1);
    }

    public boolean isLastBowl() {
        // 지금 마지막 프레임 + 마지막 투구이면 false
        if (isFinalFrame() && isLastBowlInFrame()) {
            return false;
        }
        return true;
    }

    private boolean isFinalFrame() {
        return frameIndex.isFinalFrame();
    }

    private boolean isLastBowlInFrame() {

        return true;
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public FrameIndex getFrameIndex() {
        return frameIndex;
    }
}
