package li.koly.staticMethodInDerivedClass;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/3/12
 * Time: 7:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Car extends Vehicle {

    public static String printName(Vehicle theVehicle){
        return theVehicle.print();
    }

    @Override
    public String print() {
        return "Hello, I am A Car!";
    }
}
