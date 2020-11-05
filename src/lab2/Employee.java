package lab2;

public abstract class Employee {

	private String name, gender, position;
	private double salary;
	private int age;
	int idnum = 10;
	static int count = 1;

	public Employee(String employeeGender, String employeeName, int employeeAge, double employeeSalary,
			String employeePosition) {
		name = employeeName;
		age = employeeAge;
		gender = employeeGender;
		idnum = count++;
		salary = employeeSalary;
		position = employeePosition;

	}
	
	public abstract double bonus(double salary);    //Abstract method  to override in subclasses

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIdnum() {
		return idnum;
	}

	public void setIdnum(int idnum) {
		this.idnum = idnum;

	}

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", position=" + position + ", salary=" + salary
				+ ", age=" + age + ", idnum=" + idnum + "]";
	}

}
