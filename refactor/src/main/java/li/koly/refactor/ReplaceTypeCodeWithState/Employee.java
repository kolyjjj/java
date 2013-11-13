package li.koly.refactor.ReplaceTypeCodeWithState;

public class Employee {

    private int type;
    private final int ENGINEER = 0;
    private final int SALESMAN = 1;
    private final int MANAGER = 2;
    private int monthlySalary = 1000;
    private int commission = 1000;
    private int bonus = 2000;

    Employee(int type){
        this.type = type;
    }

    int payAmount(){
        switch (type){
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
