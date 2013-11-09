package li.koly.ExtractSuperclass;

import java.util.ArrayList;
import java.util.List;

public class Department extends Party{
    private List<Employee> staff = new ArrayList();

    public Department(String name) {
        super(name);
    }

    public int getTotalAnnualCost() {
        List<Employee> e = getStaff();
        int result = 0;
        for (Employee employee : e) {
            result += employee.getAnnualCost();
        }
        return result;
    }

    public List getStaff() {
        return staff;
    }

    public int getHeadCount() {
        return staff.size();
    }

}
