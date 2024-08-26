package v2.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Balls {
    List<Ball> balls;

    public Balls(List<Integer> balls) {
        List<Ball> ballList = new ArrayList<>();
        ballMapping(balls, ballList);
        this.balls = ballList;
    }

    private static void ballMapping(List<Integer> balls, List<Ball> ballList) {
        for (int i = 0; i < 3; i++) {
            Ball ball = new Ball(i, balls.get(i));
            ballList.add(ball);
        }
    }

    public BallStatus play(Balls computerBalls) {
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balls balls1 = (Balls) o;
        return Objects.equals(balls, balls1.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(balls);
    }
}
