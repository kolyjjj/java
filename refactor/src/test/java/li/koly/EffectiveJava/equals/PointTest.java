package li.koly.EffectiveJava.equals;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void should_equal_with_self(){
        Point point = new Point(1, 2);

        assertThat(point, is(point));
    }

    @Test
    public void should_equal_given_same_points(){
        Point point = new Point(1, 2);
        Point point1 = new Point(1, 2);

        assertThat(point, is(point1));
    }
}
