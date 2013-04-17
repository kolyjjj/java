package li.koly;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RegexTest {
    @Test
    public void should_match_a_string(){
        String a = "abcdefg";
        assertThat(a.matches("\\w+"), is(true));  //[a-zA-Z_0-9]
    }

    @Test
    public void should_replace_a_string(){
        String a = "hello world 123";
//        assertThat(a.replace(" 123", ""), is("hello world"));//replace cannot apply regex
        assertThat(a.replaceAll(".[0-9]+", ""), is("hello world"));
    }

    @Test
    public void should_split_a_string(){
        String a = "This is a beautiful morning.";
        String[] splitResult = a.split(" ");
        String stringResult = Arrays.toString(splitResult);
        assertThat(stringResult, is("This, is, a, beautiful, morning."));
    }


}
