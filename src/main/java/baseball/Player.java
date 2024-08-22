package baseball;

import java.util.Scanner;

/**
 * @author : lhd
 * @packageName : baseball
 * @fileName : java-baseball-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-21         lhd
 */
public class Player {
    private String number;

    public Player() {
        number = "1";
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(Scanner scanner) {
        this.number = scanner.nextLine();
    }
}
