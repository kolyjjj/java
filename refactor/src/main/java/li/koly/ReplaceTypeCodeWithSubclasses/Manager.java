package li.koly.ReplaceTypeCodeWithSubclasses;

public class Manager extends Employee {

    public int getType(){
        return Employee.MANAGER;
    }

    @Override
    public Employee upgrade() {
        return Employee.create(2);
    }
}
