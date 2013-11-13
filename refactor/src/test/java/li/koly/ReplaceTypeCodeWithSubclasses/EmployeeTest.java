package li.koly.ReplaceTypeCodeWithSubclasses;


import li.koly.refactor.ReplaceTypeCodeWithSubclasses.Employee;
import li.koly.refactor.ReplaceTypeCodeWithSubclasses.Manager;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void should_use_employee(){
        Employee employee = Employee.create("koly", "male", 0);
        employee = employee.upgrade();

        assertThat(employee instanceof Manager, is(true));
        assertThat(employee.getName(), is("koly"));
        assertThat(employee.getGender(), is("male"));
    }
}
