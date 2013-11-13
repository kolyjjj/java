package li.koly.refactor.ExtractSubclass;

public class JobItem {
    private int unitPrice;
    private int quantity;
    private Employee employee;

    public JobItem(int unitPrice, Employee employee){
        this.unitPrice = unitPrice;
        this.employee = employee;
    }

    protected JobItem(int unitPrice, int quantity, Employee employee) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }

    // here isLabor is a type code
    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Employee getEmployee() {
        return employee;
    }

}
