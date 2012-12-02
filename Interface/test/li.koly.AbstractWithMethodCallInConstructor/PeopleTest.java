package li.koly.AbstractWithMethodCallInConstructor;

import com.sun.deploy.util.BlackList;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/3/12
 * Time: 7:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleTest {
    @Ignore
    @Test
    //using system.out.println(), cannot assert it, just see the result
    public void testDerivedMethodCalledInBaseClassConstructor(){
        People black = new Black();
        black.print();
    }
}
