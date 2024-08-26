package v2.baseball;

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
        return this == STRIKE;
    }

    public boolean isNothing() {
        return this == NOTHING;
    }

    public boolean isBall(BallStatus ballStatus) {
        return this == BALL;
    }

}
