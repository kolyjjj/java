package li.koly.refactor.ExtractSubclass;

public class LaborItem extends JobItem {
    private Employee employee;

    public LaborItem(int quantity, Employee employee) {
        super(0, quantity, employee);
        this.employee = employee;
    }


    public Employee getEmployee() {
        return employee;
    }

    public int getUnitPrice(){
        return employee.getRate();
    }
}
