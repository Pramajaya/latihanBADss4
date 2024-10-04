package entity;

public class Student extends Person {

	private double gpa;

	public Student(int no, String name, int age, String role, double gpa) {
		super(no, name, age, role);
		this.gpa = gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	public double getGPA() {
		return this.gpa;
	}

	public String roleString() {
		return "My gpa is " + getGPA() + " from 4.0";
	}

	public String toString() {
		return getNo() + ". " + "Hello, my name is " + getName() + "\n" + "I am " + getAge() + " year(s) old\n"
				+ roleString();
	}

}
