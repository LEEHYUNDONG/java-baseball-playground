package baseball.v2;

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

    public BallStatus play(int position, int ballNum) {
        if(isPosEqual(position) && isBallNumEqual(ballNum)) {
            return BallStatus.STRIKE;
        }

        if(isBallNumEqual(ballNum)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isPosEqual(int position) {
        return this.position == position;
    }

    private boolean isBallNumEqual(int num) {
        return this.ballNum == num;
    }

}
