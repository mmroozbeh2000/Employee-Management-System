package lab2;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		startMenu();
	}

	public static void startMenu() {
		boolean loop = true;
		while (loop) {
			System.out.println("\n\nWelcome to Fixon AB Employee Management System");
			System.out.println("***********************");
			System.out.println("\nWhat do you want to do?"); 
			System.out.println("***********************");
			
			System.out.println("1. Employee Management");
			System.out.println("2. Employee Statistics");
			System.out.println("0. Exit Program");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				userChoseManagement(employeeManagementMenu());
				break;
			default:
			case 2:
				EmployeeStatistic(EmployeeStatisticsMenu());
				break;
			case 0:
				loop = false;
				System.out.println("Good bye, have a nice day!!");
				break;
			}

		}

	}

	public static void userChoseManagement(int choice) {

		switch (choice) {
		case 1:
			EmployeeData.add();

			break;
		case 2:
			EmployeeData.removeEmployee();
			break;
		case 3:
			EmployeeData.updateEmployee();
			break;
		case 4:
			EmployeeData.SearchByName();
			break;
		case 5:
			EmployeeData.SearchById();
			break;
		case 6:
			EmployeeData.showAllEmployees();
			break;
		case 0:
			startMenu();
			break;
		default:
			throw new AssertionError();
		}
	}

	public static int employeeManagementMenu() {
		int choice;

		System.out.println("Welcome to Employee Management");
		System.out.println("What do you want to do?\n\n");
		System.out.println("1.  Register new employee");
		System.out.println("2.  Remove Employee");
		System.out.println("3.  Update employee");
		System.out.println("4.  Search employee by name");
		System.out.println("5.  Search employee by ID");
		System.out.println("6.  Display all employees");
		System.out.println("0.  Back to Main Menu");

		choice = sc.nextInt();
		sc.nextLine();

		return choice;
	}

	public static int EmployeeStatisticsMenu() {

		int choice;

		System.out.println("Which information do you want?!");

		System.out.println("1.Average salary in the company");
		System.out.println("2.Minimum and maximum salary in the company");
		System.out.println("3.Show sum of salary by department");
		System.out.println("4.Show sum of bonus by department");

		choice = sc.nextInt();
		sc.nextLine();

		return choice;

	}

	public static void EmployeeStatistic(int choice) {

		switch (choice) {
		case 1:
			EmployeeData.averageSalary();
			break;
		case 2:
			EmployeeData.minmaxSalary();
			break;
		case 3:
			EmployeeData.showSalaryByDepartment();
		case 4:

			EmployeeData.showTotalBonusByDepartment();

		}

	}
}
