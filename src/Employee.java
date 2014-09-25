
public class Employee extends Person {
	
	public Employee(String firstName, String lastName, int salary) {
		super(firstName, lastName);
		this.salary = salary;
	}

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " salary: " + salary;
	}

}
