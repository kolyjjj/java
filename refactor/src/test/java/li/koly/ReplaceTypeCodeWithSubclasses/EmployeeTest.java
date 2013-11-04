package li.koly.ReplaceTypeCodeWithSubclasses;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void should_use_employee(){
        Employee employee = Employee.create(0);
        People koly = new People("koly", 26, "male", employee);
        koly.upgrade();

        assertThat(koly.getOccupation() instanceof Manager, is(true));
    }
}
