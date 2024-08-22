package baseball.v1;




import utils.Pair;
import utils.Referee;

import java.util.Scanner;

/**
 * @author : lhd
 * @packageName : PACKAGE_NAME
 * @fileName : java-baseball-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-21         lhd
 */
public class BaseballGame {
    private final Scanner scanner;

    public BaseballGame() {
        scanner = new Scanner(System.in);
    }


    /**
     *
     * @author easttwave
     * @date 2024-08-22
     * @param computer
     * @param player
     *
     * 3개의 숫자를 모두 맞히셨습니다! 게임 종료
     * 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
     * 1
     */
    public void play(Computer computer, Player player) {
        Pair<Integer, Integer> score = new Pair<>(0, 0);
        while(!win(score.getKey())) {
            System.out.print("숫자를 입력해 주세요 : ");
            player.setNumber(scanner);
            score = Referee.compare(computer.getAnswer(), player.getNumber());
            Referee.print(score.getKey(), score.getValue());
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    private boolean win(int strike) {
        return strike == 3;
    }


    private boolean end(Player player) {
        return player.getNumber().length() == 1 && player.getNumber().equals("2");
    }

    public void start(Computer computer, Player player) {
        while(!end(player)) {
            play(computer, player);
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            player.setNumber(scanner);
        }
    }
}
