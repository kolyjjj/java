package li.koly.ReplaceTypeCodeWithSubclasses;

public class Engineer extends Employee {

    public Engineer(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public int getType(){
        return Employee.ENGINEER;
    }

    @Override
    public Employee upgrade() {
        return Employee.create(this.name, this.gender, 2);
    }

}
