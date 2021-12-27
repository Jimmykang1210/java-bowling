package bowling.domain;

import java.util.List;

public class BowlingGame {
    private final Player player;
    private final Frames frames;

    public BowlingGame(String player) {
        this(new Player(player));
    }

    public BowlingGame(Player player) {
        this.player = player;
        this.frames = new Frames();
    }

    public BowlingGame(Player player, Frames frames) {
        this.player = player;
        this.frames = frames;
    }

    public void start(int fallPinCount) {
        // 지금 몇 프레임?
        // 지금 몇번째 투구?



        // 첫번째 피치인 경우, pin 점수 저장, 10점이면 frame 종료
        // 두번째 피치인 경우, pin 점수 저장, 종료
        // 마지막 frame인 경우, 첫번째 피치에서 10점이어도 2번의 pitch 더 제공
        // 마지막 frame인 경우, 두번째 피치에서 10점이여도 1번의 pitch 더 제공
        // 마지막 frame인 경우, 두번째 피치에서 10점이 아니도 종료
        new Pin(fallPinCount);
    }

    public Frames getResults() {
        return frames;
    }

    public boolean hasNext() {
        return frames.isLastBowl();
    }

    public FrameIndex getFrameIndex() {
        return frames.getFrameIndex();
    }

    public String getPlayer() {
        return player.getName();
    }

    public List<Frame> getFrames() {
        return frames.getFrames();
    }
}
