package bowling.domain;

public class Pin {
    private static final int MIN_PIN_NUMBER = 0;
    private static final int MAX_PIN_NUMBER = 10;
    private static final String EXCEPTION_MESSAGE_PIN = "올바르지 않은 핀입니다.";

    private final int pin;

    public Pin(int pin) {
        validatePin(pin);
        this.pin = pin;
    }

    private void validatePin(int pin) {
        if (pin < MIN_PIN_NUMBER || pin > MAX_PIN_NUMBER) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_PIN);
        }
    }
}
