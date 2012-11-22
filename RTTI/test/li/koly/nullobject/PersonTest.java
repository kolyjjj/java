package li.koly.nullobject;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {
    @Test
    public void should_print_common_person() {
        Person person = new Person("koly", "li", "ChengDu");
        assertThat(person.toString(), is("Person: koly li ChengDu"));
    }

    @Test
    public void should_print_null_person() {
        assertThat(Person.NULL.toString(), is("NullPerson"));
    }

    @Test
    public void can_use_instance_of_to_detect_NULL_obejct() {
        assertThat(Person.NULL instanceof Null, is(true));
    }
}
