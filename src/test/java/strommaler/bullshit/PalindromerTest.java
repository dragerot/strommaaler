package strommaler.bullshit;


import org.junit.Test;
import strommaaler.litttesting.Palindromer;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PalindromerTest {
    static final String VALUE_TO_TEST="regninger";

    @Test
    public void ok() {
        assertThat(Palindromer.palindromer("abc0cba")).isEqualTo(true);
    }

    @Test
    public void notOk() {
        assertThat(Palindromer.palindromer("abc0cbc")).isEqualTo(false);
    }

    @Test
    public void isEmpty() {
        assertThat(Palindromer.palindromer("")).isEqualTo(false);
    }
}
