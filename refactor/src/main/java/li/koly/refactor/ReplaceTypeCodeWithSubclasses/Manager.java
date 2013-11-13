package li.koly.refactor.ReplaceTypeCodeWithSubclasses;

public class Manager extends Employee {

    public Manager(String name, String gender) {
        this.name = name;
        this.gender = gender;

    }

    public int getType(){
        return Employee.MANAGER;
    }

    @Override
    public Employee upgrade() {
        return Employee.create(name, gender, 2);
    }
}
