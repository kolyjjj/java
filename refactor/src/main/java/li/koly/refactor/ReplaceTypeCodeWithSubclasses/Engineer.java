package li.koly.refactor.ReplaceTypeCodeWithSubclasses;

public class Engineer extends Employee {

    public Engineer(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public int getType(){
        return ENGINEER;
    }

    @Override
    public Employee upgrade() {
        return create(this.name, this.gender, 2);
    }

}
