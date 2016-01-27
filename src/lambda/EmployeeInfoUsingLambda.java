package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfoUsingLambda {
	SortMethod method;

	public EmployeeInfoUsingLambda(SortMethod method) {
		this.method = method;
	}

	static enum SortMethod {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps) {

		Collections.sort(emps, (e1, e2) -> {
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
		});

	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfoUsingLambda ei = new EmployeeInfoUsingLambda(EmployeeInfoUsingLambda.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		ei = new EmployeeInfoUsingLambda(EmployeeInfoUsingLambda.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);
	}

}
