package li.koly.ReplaceTypeCodeWithSubclasses;

public class Salesman extends Employee {
    protected Salesman() {
        super(Employee.SALESMAN);
    }

    public int getType(){
        return Employee.SALESMAN;
    }
}
