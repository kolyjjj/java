package li.koly.ReplaceTypeCodeWithSubclasses;

public class Salesman extends Employee {

    public int getType(){
        return Employee.SALESMAN;
    }

    @Override
    public Employee upgrade() {
        return Employee.create(2);
    }
}
