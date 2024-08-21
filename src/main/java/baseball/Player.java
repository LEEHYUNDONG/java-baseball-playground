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
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    public String inputNumber(Scanner scanner) {
        this.number = this.scanner.nextLine();
        return number;
    }
}
