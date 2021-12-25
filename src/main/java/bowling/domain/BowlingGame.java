package bowling.domain;

public class BowlingGame {
    private final Player player;
    private final Frames frames;

    public BowlingGame(Player player) {
        this.player = player;
        this.frames = new Frames();
    }

    public BowlingGame(Player player, Frames frames) {
        this.player = player;
        this.frames = frames;
    }

    public Frames start() {
        return frames;
    }
}
