package li.koly.ExtractSubclass;

public class LaborItem extends JobItem {
    private Employee employee;

    public LaborItem(int quantity, Employee employee) {
        super(0, quantity, employee, true);
    }


    public Employee getEmployee() {
        return employee;
    }
}
