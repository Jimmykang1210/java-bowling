package bowling.domain;

import java.util.Objects;
import java.util.regex.Pattern;

public class Player {
    private static final int PLAYER_NAME_LENGTH = 3;
    private static final String EXCEPTION_MESSAGE_PLAYER_NAME = "플레이어명을 입력하세요.";
    private static final String EXCEPTION_MESSAGE_PLAYER_NAME_LENGTH = "3글자를 초과하였습니다.";
    private static final String EXCEPTION_MESSAGE_PLAYER_ENGLISH_NAME = "플레이어명을 입력하세요.";

    private final String name;

    public Player(String name) {
        validateMember(name);
        this.name = name;
    }

    private void validateMember(String name) {
        if (Objects.isNull(name) || name.length() == 0) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_PLAYER_NAME);
        }

        if (name.length() != PLAYER_NAME_LENGTH) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_PLAYER_NAME_LENGTH);
        }

        if (!Pattern.matches("^[a-zA-Z]*$", name)) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_PLAYER_ENGLISH_NAME);
        }
    }

    public String getName() {
        return name;
    }
}
