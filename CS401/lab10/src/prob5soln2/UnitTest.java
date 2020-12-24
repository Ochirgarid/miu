package prob5soln2;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import prob5soln2.Main;
import prob5soln2.Employee;

public class UnitTest {
    @Test
    public void testSalaryGreaterThan100000() {
        Employee emps = new Employee("Joe", "Davis", 120000);
        assertTrue(Main.salaryGreaterThan100000(emps));
    }
    
    @Test
    public void testSalaryLowerThan100000() {
        Employee emps = new Employee("Joe", "Davis", 90000);
        assertFalse(Main.salaryGreaterThan100000(emps));
    }

    @Test
    public void testLastNameAfterM() {
        Employee emps = new Employee("Alice", "Richards", 60000);
        assertTrue(Main.lastNameAfterM(emps));
    }
    
    @Test
    public void testLastNameBeforeM() {
        Employee emps = new Employee("Joe", "Davis", 90000);
        assertFalse(Main.lastNameAfterM(emps));
    }

    @Test
    public void testFullName() {
        Employee emps = new Employee("Joe", "Davis", 90000);
        String result = Main.fullName(emps);
        assertEquals("Joe Davis", result);
    }

    @Test
    public void testLastNameOnly() {
        Employee emps = new Employee("", "Davis", 90000);
        String result = Main.fullName(emps);
        assertEquals(" Davis", result);
    }

    @Test
    public void testFirstNameOnly() {
        Employee emps = new Employee("Joe", "", 90000);
        String result = Main.fullName(emps);
        assertEquals("Joe ", result);
    }
}
