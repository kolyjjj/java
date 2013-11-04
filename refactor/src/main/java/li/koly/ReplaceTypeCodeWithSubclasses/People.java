package li.koly.ReplaceTypeCodeWithSubclasses;

public class People {
    private final String name;
    private final int age;
    private final String gender;
    private Employee occupation;

    public People(String name, int age, String gender, Employee employee) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation= employee;
    }

    public void upgrade() {
        occupation = occupation.upgrade();
    }

    public Employee getOccupation() {
        return occupation;
    }
}
