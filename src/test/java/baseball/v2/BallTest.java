package baseball.v2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : lhd
 * @packageName : baseball.v2
 * @fileName : java-baseball-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-23         lhd
 */
public class BallTest {

    @Test
    void nothing() {
        Ball ball = new Ball(1, 1);
        assertThat(ball.play(1, 3)).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        Ball ball = new Ball(2,1);
        assertThat(ball.play(3, 1).isBall(BallStatus.BALL)).isTrue(); // 이게 맞는지 한번 고민해보자
    }

    @Test
    void strike() {
        Ball ball = new Ball(1, 3);
        assertThat(ball.play(1, 3)).isEqualTo(BallStatus.STRIKE);
    }
}
