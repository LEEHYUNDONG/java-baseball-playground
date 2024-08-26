package v2.baseball;

import java.util.Objects;

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
public class Ball {
    private final int position;
    private final int ballNum;

    public Ball(int position, int ballNum) {
        this.position = position;
        this.ballNum = ballNum;
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        }

        if(isBallNumEqual(ball)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && ballNum == ball.ballNum;
    }

    public int getPosition() {
        return position;
    }

    public int getBallNum() {
        return ballNum;
    }


    private boolean isBallNumEqual(Ball ball) {
        return this.ballNum == ball.getBallNum();
    }

}
