package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author : lhd
 * @packageName : study
 * @fileName : java-baseball-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-21         lhd
 */
public class CalculatorTest {
    private String[] values;
    private static final String OPERATOR = "+-/*";

    @BeforeEach
    void setUp() {
        String input = "2 + 3 * 4 / 2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        values = scanner.nextLine().split(" ");
    }


    @ParameterizedTest
    @ValueSource(strings = {"10"})
    void calculate(String actual) {
        int curr;
        String op = ""; // 연산자 저장

        int result=0;
        for (String s : values) {
            // 연산자의 경우 뒤에 숫자를 계산하기 위에 버퍼에 저장
            if(isOperator(s)) {
                op = s;
                continue;
            }
            // 숫자의 경우 연산자가 채워져 있다면 바로 계산
            curr = Integer.parseInt(s);
            switch (op) {
                case "":
                case "+":
                    result += curr;
                    break;
                case "-":
                    result -= curr;
                    break;
                case "*":
                    result *= curr;
                    break;
                case "/":
                    result /= curr;
            }
        }
        assertThat(Integer.parseInt(actual)).isEqualTo(result);
    }

    static boolean isOperator(String s) {
        return OPERATOR.contains(s);
    }

}
