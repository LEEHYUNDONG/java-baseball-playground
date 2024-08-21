package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항 1")
    void split() {
        String[] actual1 = "1,2".split(",");
        String[] actual2 = "1,".split(",");
        assertThat(actual1).contains("1", "2");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    @DisplayName("요구사항 2")
    void subString(){
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항 3")
    void chatAt() {
        assertThatThrownBy(() -> {
            int actual = "abc".charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
