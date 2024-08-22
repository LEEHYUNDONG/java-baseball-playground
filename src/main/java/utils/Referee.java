package utils;


/**
 * @author : lhd
 * @packageName : baseball
 * @fileName : java-baseball-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-22         lhd
 */
public class Referee {


    public static Pair<Integer, Integer> compare(String computerValue, String playerValue) {
        int strike = 0;
        int ball = 0;

        // strike
        for (int i = 0; i < 3; i++) {
            if (computerValue.charAt(i) == playerValue.charAt(i)) {
                strike++;
            } else if(computerValue.contains(String.valueOf(playerValue.charAt(i)))) {
                ball++;
            }
        }
        return new Pair<>(strike, ball);
    }

    public static String printScore(int strike, int ball) {
        if(strike > 0 && ball > 0) {
            return String.format("%d볼 %d스트라이크",ball, strike);
        } else if(strike > 0) {
            return String.format("%d스트라이크", strike);
        } else if(ball > 0) {
            return String.format("%d볼", ball);
        }
        return "낫싱";
    }

    public static void print(int strike, int ball) {
        System.out.println(printScore(strike, ball));
    }
}
