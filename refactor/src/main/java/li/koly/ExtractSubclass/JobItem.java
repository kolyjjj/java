package li.koly.ExtractSubclass;

public class JobItem {
    private int unitPrice;
    private int quantity;
    private Employee employee;
    private boolean isLabor;

    public JobItem(int unitPrice, int quantity, Employee employee, boolean labor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
        isLabor = labor;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }


    public int getUnitPrice() {
        return isLabor ? employee.getRate() : unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Employee getEmployee() {
        return employee;
    }
}