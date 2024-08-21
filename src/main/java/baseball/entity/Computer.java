package baseball.entity;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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
public class Computer {
    private String answer;

    public Set<String> generateNumber() {
        Random random = new Random();
        Set<String> result = new HashSet<>();

        random.setSeed(System.currentTimeMillis());
        while(result.size() < 3) {
            int num = random.nextInt(8)+1;
            result.add(String.valueOf(num));
        }

        return result;
    }
}
