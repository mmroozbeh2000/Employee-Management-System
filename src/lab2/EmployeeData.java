package lab2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class EmployeeData {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> emp = new ArrayList<>();
	static ArrayList<Double> sal = new ArrayList<Double>();

	public static void add() {
		int choice;
         System.out.println("*****************************************");
		System.out.println("Please select position of  the new employee");
		System.out.println("1. Executive");
		System.out.println("2. Developer");
		System.out.println("3. Sales");
		choice = isUserPositionInputValid();

		switch (choice) {
		case 1:
			executive.add();
			break;
		case 2:

			developer.add();

			break;
		case 3:
			sales.add();
		}

	}

	public static void removeEmployee() {

		System.out.println("\nRemove employee\n");
		System.out.println("1. By name");
		System.out.println("2. By ID");

		int choice;
		choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			removeEmployeeByName();
			break;
		case 2:
			removeEmployeeById();
			break;
		default:
			throw new AssertionError();
		}

	}

	public static void removeEmployeeByName() {
        boolean loop = false;
        System.out.println(emp);
        System.out.println("Enter name for employee you want to remove");

 

        do {
            for (int i = emp.size() - 1; i >= 0; i--) {
                String name = sc.nextLine();
                if (emp.get(i).getName().equalsIgnoreCase(name)) {
                    emp.remove(emp.get(i));
                    System.out.println("Employee " + name + " has been removed from the system.");
                    loop = true;
                } else {
                    System.out.println("Invalid name!");
                    loop = false;
                }
            }
        } while (loop == false);

 

    }
	public static void removeEmployeeById() {
        boolean loop = false;
        System.out.println(emp);
        System.out.println("Enter Id for employee");

 

        do {
            int id = sc.nextInt();
            sc.nextLine();
            for (int i = emp.size() - 1; i >= 0; i--) {

 

                if (emp.get(i).getIdnum() == id) {
                    emp.remove(emp.get(i));
                    System.out.println("Employee with " + id + "number" + " has been removed from the system.");
                    loop = true;
                } else {
                    System.out.println("Invalid id");
                    loop = false;
                }
            }
        } while (loop == false);
    }
	public static void updateEmployee() {

		System.out.println("Employee update\nWhat do you want to update?");
		System.out.println("1. Employee name");
		System.out.println("2. Employee age");
		System.out.println("3. Employee salary");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			updateEmployeeName();
			break;
		case 2:
			updateEmployeeAge();
			break;
		case 3:
			updateEmployeeSalary();
			break;

		default:
			throw new AssertionError();
		}
	}

	public static void updateEmployeeName() {
		System.out.println(emp);
		System.out.println("Enter Id for employee:");
		int id = sc.nextInt();
		sc.nextLine();
		for (Employee employee : emp) {

			if (employee.getIdnum() == id) {
				System.out.println("Enter the new name for employee:");
				String name = sc.nextLine();
				employee.setName(name);
				System.out.println("Employee is updated");
			}
		}
	}

	public static void updateEmployeeAge() {
		System.out.println(emp);
		System.out.println("Enter Id for employee:");
		int id = sc.nextInt();
		sc.nextLine();
		for (Employee employee : emp) {

			if (employee.getIdnum() == id) {
				System.out.println("Enter the new age for employee:");
				int age = sc.nextInt();
				employee.setAge(age);
				System.out.println("Employee is updated");
			}
			}
	}

	public static void updateEmployeeSalary() {
		System.out.println(emp);
		System.out.println("Enter Id for employee:");
		int id = sc.nextInt();
		sc.nextLine();
		for (Employee employee : emp) {

			if (employee.getIdnum() == id) {
				System.out.println("Enter  the new salary for employee:");
				double salary = sc.nextDouble();
				employee.setSalary(salary);
				System.out.println("Employee is updated");
			
			}
		}
	}

	public static void SearchByName() {

		boolean loop = false;
		System.out.println("Enter name for employee:");
		do {
		String name = sc.nextLine();
		for (Employee employee : emp) {
		if (employee.getName().equalsIgnoreCase(name)) {
		System.out.println(employee.toString());
		loop = true;
		break;

		 } else {
		System.out.println("The name does not exist!");
		}

		 }
		} while (loop == false);

		 }
	

	public static void SearchById() {

		boolean loop = false;
		System.out.println("Enter id for employee:");
		do {
		int id = sc.nextInt();
		sc.nextLine();
		for (Employee employee : emp) {

		if (employee.getIdnum() == id) {
		System.out.println(employee.toString());
		loop = true;
		} else {
		System.out.println("The id does not exist!");
		}
		}
		} while (loop == false);
	}

	public static void showAllEmployees() {

		for (Employee emp : emp)
			System.out.println(emp);
		System.out.println("");

	}

	public static void averageSalary() {

		int total = 0;
		int avg = 0;
		for (int i = 0; i < sal.size(); i++) {
			total += sal.get(i);
			avg = total / sal.size();

		}
		System.out.println("The Average salary in the company is:" + avg);
	}

	public static int isUserInputValid() {
		String userInputString;
		int userInput = 0;
		boolean isInputValid;

		do {
			userInputString = sc.nextLine();
			try {
				userInput = Integer.parseInt(userInputString);
				isInputValid = true;
				if (userInput <= 0) {
					isInputValid = false;
					System.out.println("You have entered a negative number, please try again.");
				}
			} catch (Exception e) {

				System.out.println("Input not valid, try again!");
				isInputValid = false;
			}
		} while (isInputValid == false);
		return userInput;
	}

	public static void minmaxSalary() {

		System.out.println("The minimum salary in the company is " + Collections.min(sal));

		System.out.println("The maximum salary in the company is " + Collections.max(sal));

	}

	public static int isUserPositionInputValid() {
		String userInputString;
		int userInput = 0;
		boolean isInputValid;

		do {
			userInputString = sc.nextLine();
			try {
				userInput = Integer.parseInt(userInputString);
				isInputValid = true;
				if (userInput < 1 || userInput > 3) {
					isInputValid = false;
					System.out.println("Please enter 1,2 or 3");
				}
			} catch (Exception e) {

				System.out.println("Input not valid, try again!");
				isInputValid = false;
			}
		} while (isInputValid == false);
		return userInput;
	}

	public static String employeeGender() {
		int choice;
		String userInput;
		System.out.println("Please select gender of new employee");
		System.out.println("1. Female");
		System.out.println("2. Male");
		System.out.println("3. Non binary");
		choice = isUserPositionInputValid();
		// sc.nextLine();

		switch (choice) {
		case 1:
			userInput = "Female";
			break;
		case 2:
			userInput = "Male";
			break;
		case 3:
			userInput = "Non binary";
			break;
		default:
			System.out.println(("Wrong input, please choose 1, 2 or 3."));
			throw new AssertionError();
		}
		return userInput;
	}

	public static int isUserGenderInputValid() {
		String userInputString;
		int userInput = 0;
		boolean isInputValid;

		do {
			userInputString = sc.nextLine();
			try {
				userInput = Integer.parseInt(userInputString);
				isInputValid = true;
				if (userInput < 1 || userInput > 3) {
					isInputValid = false;
					System.out.println("Please enter 1,2 or 3");
				}
			} catch (Exception e) {

				System.out.println("Input not valid, try again!");
				isInputValid = false;
			}
		} while (isInputValid == false);
		return userInput;
	}

	public static void showSalaryByDepartment() {

		System.out.println("Please select a department to show sum of all salary:");
		System.out.println("1.Executive");
		System.out.println("2.Developer");
		System.out.println("3.Sales");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:

			double sum = 0;

			for (Employee employee : emp) {

				if (employee.getPosition().equalsIgnoreCase("executive")) {
					sum += employee.getSalary();

				}
			}
			System.out.println("The sum of all employees in department Executive is : " + sum);
			break;

		case 2:

			double sum1 = 0;

			for (Employee employee : emp) {

				if (employee.getPosition().equalsIgnoreCase("developer")) {
					sum1 += employee.getSalary();

				}

			}
			System.out.println("The sum of all employees in department Developer is : " + sum1);
			break;

		case 3:

			double sum2 = 0;

			for (Employee employee : emp) {

				if (employee.getPosition().equalsIgnoreCase("sales")) {
					sum2 += employee.getSalary();
				}
			}
			System.out.println("The sum of all employees in department Sales is : " + sum2);
			break;

		}

	}

	public static void showTotalBonusByDepartment() {

		System.out.println("Please select a department to show sum of all bonus:");
		System.out.println("1.Executive");
		System.out.println("2.Developer");
		System.out.println("3.Sales");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:

			double sum = 0;

			for (int i = 0; i < executive.bonus.size(); i++) {
				sum += executive.bonus.get(i);
			}

			System.out.println("The sum of all employees bonus in the department Executive is : " + sum);
			break;

		case 2:

			double sum1 = 0;

			for (int i = 0; i < developer.bonus.size(); i++) {
				sum1 += developer.bonus.get(i);

			}
			System.out.println("The sum of all employees bonus in the department Developer is : " + sum1);
			break;

		case 3:

			double sum2 = 0;

			for (int i = 0; i < sales.bonus.size(); i++) {
				sum2 += sales.bonus.get(i);

			}

			System.out.println("The sum of all employees bonus in the department Sales is : " + sum2);
			break;

		}

	}
	
	
	public static double isUserSalaryInputValid() {
		String userInputString;
		double userInput = 0;
		boolean isInputValid;

		 do {
		userInputString = sc.nextLine();
		try {
		userInput = Double.parseDouble(userInputString);
		isInputValid = true;
		if (userInput <= 0) {
		isInputValid = false;
		System.out.println("You have entered a negative number, Employees should earn at least more than 0.");
		}
		} catch (Exception e) {

		 System.out.println("Input not valid, try again!");
		isInputValid = false;
		}
		} while (isInputValid == false);
		return userInput;
		}
	
}

