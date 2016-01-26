package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfoUsingComparator {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps, final SortMethod method) {

		if (method == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		} else if (method == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeSalaryComparator());
		}

	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfoUsingComparator ei = new EmployeeInfoUsingComparator();
		ei.sort(emps, EmployeeInfoUsingComparator.SortMethod.BYNAME);
		System.out.println(emps);
		// same instance
		ei.sort(emps, EmployeeInfoUsingComparator.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
