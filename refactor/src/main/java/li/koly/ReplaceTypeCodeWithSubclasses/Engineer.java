package li.koly.ReplaceTypeCodeWithSubclasses;

public class Engineer extends Employee {

    public int getType(){
        return Employee.ENGINEER;
    }

    @Override
    public Employee upgrade() {
        return Employee.create(2);
    }

}
