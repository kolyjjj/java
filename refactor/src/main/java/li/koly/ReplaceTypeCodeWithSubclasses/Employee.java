package li.koly.ReplaceTypeCodeWithSubclasses;

public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public static Employee create(int type){
        return new Employee(type);
    }

    private Employee(int type){
        this.type = type;
    }

    int getType(){
        return this.type;
    }
}
