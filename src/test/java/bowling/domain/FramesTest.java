package bowling.domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FramesTest {

    @Test
    public void 볼링() {
        Frames frames = new Frames();
        assertThat(frames.findFrame()).isEqualTo(new NormalFrame());
    }
}
