package li.koly.ReplaceTypeCodeWithSubclasses;

public class Engineer extends Employee {

    protected Engineer() {
        super(Employee.ENGINEER);
    }

    int getType(){
        return Employee.ENGINEER;
    }

}
