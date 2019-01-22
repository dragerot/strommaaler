package strommaler;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamExamples {
    static final List<String> words = Arrays.asList("GFG", "Geeks", "for",
            "GeeksQuiz", "GeeksforGeeks");

    @Test
    public void Reducing () {
        Optional<String> longestString =
                words.
                stream().
                reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);
        assertThat(1).isEqualTo(1);
    }

    @Test
    public void sum () {

    }
}
