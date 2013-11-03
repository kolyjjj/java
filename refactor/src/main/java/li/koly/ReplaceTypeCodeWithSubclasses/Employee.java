package li.koly.ReplaceTypeCodeWithSubclasses;

public abstract class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public static Employee create(int type){
        if (type == ENGINEER) return new Engineer();
        if (type == SALESMAN) return new Salesman();
        if (type == MANAGER) return new Manager();
        throw new RuntimeException("no such employee");
    }


    public abstract int getType();
}
