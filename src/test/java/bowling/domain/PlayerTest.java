package bowling.domain;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PlayerTest {
    @Test
    public void 참가자명_생성비교() {
        Player player = new Player("KHJ");
        assertThat(player.getName()).isEqualTo("KHJ");
    }

    @ParameterizedTest(name="{displayName} | 요청값: {0}")
    @ValueSource(strings = {"i", "am", "four", "mouse"})
    void 참가자명이_3글자가_아닌_경우_IllegalArgumentException(String param) {
        assertThatThrownBy(() -> {
            new Player(param);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest(name="{displayName} | 요청값: {0}")
    @ValueSource(strings = {"한","두개", "세게네", "아나콘다"})
    void 참가자명이_영문이_아닌_경우_IllegalArgumentException(String param) {
        assertThatThrownBy(() -> {
            new Player(param);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}