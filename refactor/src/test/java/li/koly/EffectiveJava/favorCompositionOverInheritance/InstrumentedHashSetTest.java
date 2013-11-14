package li.koly.EffectiveJava.favorCompositionOverInheritance;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InstrumentedHashSetTest {
    // This wouldnt pass
    @Test
    public void should_get_add_count(){
        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        assertThat(s.getAddCount(), is(3));
    }
}
