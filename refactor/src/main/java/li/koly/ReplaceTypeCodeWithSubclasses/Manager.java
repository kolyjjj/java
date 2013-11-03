package li.koly.ReplaceTypeCodeWithSubclasses;

public class Manager extends Employee {
    protected Manager() {
        super(Employee.MANAGER);
    }

    public int getType(){
        return Employee.MANAGER;
    }
}
