package li.koly.staticMethodInDerivedClass;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/3/12
 * Time: 7:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class VehicleTest {
    @Test
    public void test(){
        Car.printName(new Car());
    }

}
