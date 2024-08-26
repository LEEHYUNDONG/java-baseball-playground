package v2.baseball;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class BallsTest {
    @Test
    void ballsNothing() {

        Balls computerBalls = new Balls(new ArrayList<>(Arrays.asList(1, 2, 3)));
        Balls playerBalls = new Balls(new ArrayList<>(Arrays.asList(1, 2, 3)));


        assertThat(playerBalls.play(computerBalls).isNothing()).isTrue();

    }
}
