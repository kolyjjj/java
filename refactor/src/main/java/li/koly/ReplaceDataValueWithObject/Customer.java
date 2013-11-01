package li.koly.ReplaceDataValueWithObject;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
    final String name;
    private static Dictionary instances = new Hashtable();

    private static void loadCustomers(){
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private void store() {
        instances.put(this.name, this);
    }

    private Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // should consider the case non object is found
    public static Customer create(String name){
        return (Customer) instances.get(name);
    }
}
