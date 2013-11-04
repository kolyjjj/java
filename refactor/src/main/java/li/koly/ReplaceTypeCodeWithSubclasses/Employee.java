package li.koly.ReplaceTypeCodeWithSubclasses;

public abstract class Employee {
    protected static final int ENGINEER = 0;
    protected static final int SALESMAN = 1;
    protected static final int MANAGER = 2;

    public static Employee create(int type){
        switch (type){
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new RuntimeException("no Such Employee");
        }
    }

    public abstract int getType();

    public abstract Employee upgrade();
}
