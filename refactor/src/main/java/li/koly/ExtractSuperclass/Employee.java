package li.koly.ExtractSuperclass;

public class Employee extends Party{

    private final String id;
    private final int annualCost;

    public Employee(String name, String id, int annualCost) {
        super(name);
        this.id = id;
        this.annualCost = annualCost;
    }

    public String getId() {
        return id;
    }

    public int getAnnualCost() {
        return annualCost;
    }
}
