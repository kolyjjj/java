package li.koly.packageaccess.anotherpackage;

import li.koly.packageaccess.onepackage.A;
//import li.koly.packageaccess.onepackage.B;
import li.koly.packageaccess.onepackage.HiddenC;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CTest {
    @Ignore
    @Test
    public void cannot_get_the_type_information_of_class_B() {
        //A a = new B();  //this line will not compile, because it's not in the same package while class B is not declared as public
    }

    @Ignore
    @Test
    public void you_can_not_use_B_even_you_can_make_one_with_HiddenC() {
        A a = HiddenC.makeA();
//        if (a instanceof B){       //this will not compile, because you still do not have the access to get class B
//            ((B)a).doAnotherThing();
//        }
    }

    //Even if you can access the private method using reflection, don't use it, because if a method is declared as private
    //it's reasonable to change it, so if the author changed the method, you have no right to complain
    @Test
    public void should_get_the_B_privage_methods_use_reflection() throws Exception {
        A a = HiddenC.makeA();
        assertThat((String) callMethod(a, "doSomething"), is("I am B!"));
        assertThat((String) callMethod(a, "doAnotherThing"), is("I am doing another thing!"));//here we call the private method
    }

    private Object callMethod(Object o, String methodName) throws Exception{
        Method m = o.getClass().getDeclaredMethod(methodName);
        m.setAccessible(true);
        return m.invoke(o);
    }
}
