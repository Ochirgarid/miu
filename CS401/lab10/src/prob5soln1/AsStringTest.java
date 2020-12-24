package prob5soln1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import prob5.Main;
import prob5.Employee;

public class AsStringTest {
    @Test
    public void testSingleEmployee() {
        List <Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000));
        String result = Main.asString(emps);
        assertEquals("Joe Davis", result);
    }
    
    @Test
    public void testMultipleEmployee() {
        List <Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000));
        String result = Main.asString(emps);
        assertEquals("Joe Davis, John Sims", result);

    }   
}
