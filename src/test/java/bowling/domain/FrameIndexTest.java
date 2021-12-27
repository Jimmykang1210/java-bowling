package bowling.domain;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class FrameIndexTest {

    @ParameterizedTest(name="{displayName} | 요청값: {0}")
    @ValueSource(ints = {0,1,2,5,7,9})
    public void init(int param) {
        FrameIndex frameIndex = new FrameIndex(param);
        assertThat(frameIndex.getIndex()).isEqualTo(param);
    }

    @ParameterizedTest(name="{displayName} | 요청값: {0}")
    @ValueSource(ints = {-1, 10, 15})
    public void 인덱스가_비정상인경우_IllegalArgumentException(int param) {
        assertThatThrownBy(() -> {
            new FrameIndex(param);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 마지막_프레임() {
        FrameIndex frameIndex = new FrameIndex(9);
        IntStream.range(0, 9)
                .forEach(m -> frameIndex.nextFrame());
        assertThat(frameIndex.isFinalFrame()).isTrue();
    }

    @ParameterizedTest(name="{displayName} | 요청값: {0}")
    @ValueSource(ints = {1,2,5,7})
    public void 마지막_프레임_아님(int param) {
        FrameIndex frameIndex = new FrameIndex(9);
        IntStream.range(0, param)
                        .forEach(m -> frameIndex.nextFrame());
        assertThat(frameIndex.isFinalFrame()).isFalse();
    }

    @Test
    public void 다음프레임_이동전() {
        FrameIndex frameIndex = new FrameIndex(9);
        assertThat(frameIndex.getNowIndex()).isEqualTo(0);
    }

    @Test
    public void 다음프레임_이동() {
        FrameIndex frameIndex = new FrameIndex(9);
        frameIndex.nextFrame();
        assertThat(frameIndex.getNowIndex()).isEqualTo(1);
    }
}
