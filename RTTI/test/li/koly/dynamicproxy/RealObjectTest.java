package li.koly.dynamicproxy;

import org.junit.Test;

import java.net.InterfaceAddress;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RealObjectTest {
    //Do we need to test whether a class is an implementation of an interface???
//    @Test
//    public void should_implement_interface() {
//        RealObject realObject = new RealObject();
//        assertThat(realObject instanceof Interface, is(true));
//    }

    @Test
    public void should_return_do_somet_thing() {
        RealObject realObject = new RealObject();
        assertThat(realObject.doSomething(), is("do something!"));
    }

    @Test
    public void should_return_do_another_thing() {
        RealObject realObject = new RealObject();
        assertThat(realObject.doAnotherThing(), is("do another thing!"));
    }
}
