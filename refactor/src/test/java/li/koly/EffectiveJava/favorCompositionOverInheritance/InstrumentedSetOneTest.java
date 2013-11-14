package li.koly.EffectiveJava.favorCompositionOverInheritance;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InstrumentedSetOneTest {
    //this will pass
    @Test
    public void should_get_add_count(){
        InstrumentedSetOne<String> s = new InstrumentedSetOne<String>(new HashSet<String>());
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        assertThat(s.getAddCount(), is(3));
    }
}
