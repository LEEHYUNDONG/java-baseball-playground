package v1.baseball;

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

    public String getAnswer() {
        return answer;
    }

    private void setAnswer() {}

    public Computer() {
        this.answer = String.join("", generateNumber());
    }

    public Set<String> generateNumber() {
        Set<String> result = new HashSet<>();
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        while(result.size() < 3) {
            int num = random.nextInt(8)+1;
            result.add(String.valueOf(num));
        }
        return result;
    }
}
