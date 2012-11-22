package li.koly.nullobject;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PositionTest {
    @Test
    public void should_create_a_common_position() {
        Position position = new Position("manager", new Person("koly", "li", "ChengDu"));
        assertThat(position.toString(), is("Position: manager Person: koly li ChengDu"));
    }

    @Test
    public void should_create_a_position_with_null_person() {
        Position availablePosition = new Position("IM", Person.NULL);
        assertThat(availablePosition.toString(), is("Position: IM NullPerson"));
    }

    @Test
    public void should_create_a_position_with_null() {
        Position availablePosition = new Position("IM", null);
        assertThat(availablePosition.toString(), is("Position: IM NullPerson"));
    }

    @Test
    public void should_set_a_null_to_Position() {
        Position position = new Position("IM", new Person("koly", "li", "ChengDu"));
        position.setPerson(null);
        assertThat(position.toString(), is("Position: IM NullPerson"));
    }
}
