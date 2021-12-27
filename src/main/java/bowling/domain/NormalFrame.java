package bowling.domain;

public class NormalFrame implements Frame {
    private final Pins pins;

    public NormalFrame() {
        this.pins = new Pins();
    }

    public NormalFrame(Pins pins) {
        this.pins = pins;
    }


}
