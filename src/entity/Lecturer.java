package entity;

public class Lecturer extends Person {

	private int salary;

	public Lecturer(int no, String name, int age, String role, int salary) {
		super(no, name, age, role);
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public String roleString() {
		return "My salary is " + getSalary();
	}

	public String toString() {
		return getNo() + ". " + "Hello, my name is " + getName() + "\n" + "I am " + getAge() + " year(s) old\n"
				+ roleString();
	}

}
