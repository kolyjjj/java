package li.koly.ExtractSuperclass;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Department {
    private final String name;
    private List<Employee> staff = new ArrayList();

    public Department(String name) {
        this.name = name;
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

    public int getHeadCount(){
        return staff.size();
    }

    public String getName() {
        return name;
    }
}
