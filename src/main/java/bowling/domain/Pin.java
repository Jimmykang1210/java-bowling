package bowling.domain;

public class Pin {
    private static final int MIN_POINT_NUMBER = 0;
    private static final int MAX_POINT_NUMBER = 10;
    private static final String EXCEPTION_MESSAGE_PIN = "올바르지 않은 핀입니다.";

    private final int fallPin;
    private final int totalFallPin;

    public Pin(int fallPin) {
        this(fallPin, fallPin);
    }

    public Pin(int fallPin, int totalFallPin) {
        validatePoint(fallPin);
        this.fallPin = fallPin;
        this.totalFallPin = totalFallPin;
    }

    private void validatePoint(int point) {
        if (point < MIN_POINT_NUMBER || point > MAX_POINT_NUMBER) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_PIN);
        }
    }
}
