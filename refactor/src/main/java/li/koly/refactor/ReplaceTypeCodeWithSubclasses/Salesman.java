package li.koly.refactor.ReplaceTypeCodeWithSubclasses;

public class Salesman extends Employee {

    public Salesman(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public int getType(){
        return Employee.SALESMAN;
    }

    @Override
    public Employee upgrade() {
        return Employee.create(name, gender, 2);
    }
}
