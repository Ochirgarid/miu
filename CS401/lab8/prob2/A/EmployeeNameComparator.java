package prob2.A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		int c1 = e1.name.compareTo(e2.name);

		if (c1 != 0)
			return c1;

		if (e1.salary == e2.salary)
			return 0;

		return e1.salary > e2.salary ? 1 : -1;
	}
}
