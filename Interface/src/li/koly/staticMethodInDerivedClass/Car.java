package li.koly.staticMethodInDerivedClass;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/3/12
 * Time: 7:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Car extends Vehicle {

    public static void printName(Vehicle theVehicle){
        ((Car)theVehicle).print();
    }

    private void print() {
        System.out.println("Hello, my name is car");
    }
}
