package li.koly.nullobject;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StaffTest {
    @Test
    public void should_return_position_available() {
        Staff staff = new Staff("IM");
        assertThat(staff.positionAvailable("IM"), is(true));
    }

    @Test
    public void should_return_position_not_available() {
        Staff staff = new Staff("IM", new Person("koly", "li", "ChengDu"));
        assertThat(staff.positionAvailable("IM"), is(false));
    }


    //use two assertion in just one test, remember you need to check two places to ensure the test is passed
    @Test
    public void should_fill_a_position_with_a_person() {
        Staff staff = new Staff("IM");
        assertThat(staff.positionAvailable("IM"), is(true));
        staff.fillPosition("IM", new Person("bbjjk", "shan", "ChengDu"));
        assertThat(staff.positionAvailable("IM"), is(false));
    }
}
