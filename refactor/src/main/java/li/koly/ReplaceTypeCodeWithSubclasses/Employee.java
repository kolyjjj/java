package li.koly.ReplaceTypeCodeWithSubclasses;

public abstract class Employee {
    protected static final int ENGINEER = 0;
    protected static final int SALESMAN = 1;
    protected static final int MANAGER = 2;
    protected String name;
    protected String gender;

    public static Employee create(String name, String gender, int type){

        switch (type){
            case ENGINEER:
                return new Engineer(name, gender);
            case SALESMAN:
                return new Salesman(name, gender);
            case MANAGER:
                return new Manager(name, gender);
            default:
                throw new RuntimeException("no Such Employee");
        }
    }

    public abstract int getType();

    public abstract Employee upgrade();

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
