package li.koly.ReplaceDataValueWithObject;

public class Customer {
    final String name;

    private Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static Customer create(String name){
        return new Customer(name);
    }
}
