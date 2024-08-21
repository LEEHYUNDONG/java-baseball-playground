package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

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
class BaseballGameTest {

    private Computer computer;
    private Player player;
    private Scanner scanner;

    @BeforeEach
    void setup() {
        computer = new Computer();
        player = new Player();
        // input 테스트를 위한 인라인
        System.setIn(new ByteArrayInputStream("123".getBytes()));
        scanner = new Scanner(System.in);

    }

    @Test
    @DisplayName("3자리 랜덤 숫자 생성, 정답발생")
    void setAnswer() {
        //set은 중복이 발생하지 않기 때문에 길이로 검증한다.
        assertThat(computer.generateNumber().size()).isEqualTo(3);
    }

    /**
     * 숫자가 존재하나 다른 위치에 있으면 볼
     * 숫자가 같은 위치 같은 숫자면 스트라이크
     * 위에 해당하는게 아예 없다면 낫싱
     * @author easttwave
     * @date 2024-08-21
     */
    @Test
    @DisplayName("3자리 숫자 중에 맞추는 갯수별로 메시지를 정상적으로 출력하는지 확인")
    void getMessage() {
        String actual = "123";
        assertThat(actual).isEqualTo(player.inputNumber(scanner));
    }
    
    @Test
    @DisplayName("컴퓨터와 플레이어가 가지고 있는 값을 비교")
    void compare() {

    }


}