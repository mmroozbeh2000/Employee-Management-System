package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class executive extends Employee {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Double> bonus = new ArrayList<Double>();

	public executive(String employeeGender, String employeeName, int employeeAge, double employeeSalary,
			String employeePosition) {
		super(employeeGender, employeeName, employeeAge, employeeSalary, employeePosition);
	}

	@Override
	public double bonus(double salary) {
		double bonus = salary * 5 / 100;

		return bonus;

	}

	public static void add() {
		System.out.println("Please enter name of employee:");
		String N = sc.nextLine();
		System.out.println("Please enter salary of employee:");
		double SA = EmployeeData.isUserSalaryInputValid();
		System.out.println("Please enter age of employee:");
		int A = EmployeeData.isUserInputValid();

		String G = EmployeeData.employeeGender();
		String P = "executive";

		Employee S = new executive(G, N, A, SA, P);
		EmployeeData.emp.add(S);
		EmployeeData.sal.add(SA);
		System.out.println("Done!The new employee has been created!");

		bonus.add(S.bonus(SA));
	}

}
