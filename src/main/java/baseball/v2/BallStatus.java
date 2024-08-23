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
public enum BallStatus {
    NOTHING, BALL, STRIKE;

    public boolean isStrike(BallStatus ballStatus){
        return ballStatus == STRIKE;
    }

    public boolean isNothing(BallStatus ballStatus) {
        return ballStatus == NOTHING;
    }

    public boolean isBall(BallStatus ballStatus) {
        return ballStatus == BALL;
    }
}
