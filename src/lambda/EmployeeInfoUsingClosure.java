package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfoUsingClosure {
	SortMethod method;

	public EmployeeInfoUsingClosure(SortMethod method) {
		this.method = method;
	}

	static enum SortMethod {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps) {
		
		Collections.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if (method == SortMethod.BYNAME) {
					return e1.name.compareTo(e2.name);
				} else {
					if (e1.salary == e2.salary)
						return 0;
					else if (e1.salary < e2.salary)
						return -1;
					else
						return 1;
				}
			}
		} );
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfoUsingClosure ei = new EmployeeInfoUsingClosure(EmployeeInfoUsingClosure.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		ei = new EmployeeInfoUsingClosure(EmployeeInfoUsingClosure.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);
	}

}
