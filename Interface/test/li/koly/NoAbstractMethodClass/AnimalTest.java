package li.koly.NoAbstractMethodClass;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/3/12
 * Time: 6:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class AnimalTest {
    @Test
    public void shouldImplementedNoMethod(){
        //Animal animal = new Animal(); You can not do this, how to test it? how to test that one class is abstract?
        Animal dog = new Dog();
        assertThat(dog.run(), is("I'm running!"));
    }
}
