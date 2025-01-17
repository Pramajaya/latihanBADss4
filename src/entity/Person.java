package entity;

public abstract class Person {

	private int no;
	private String name;
	private int age;
	private String role;

	public Person(int no, String name, int age, String role) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public abstract String roleString();

}
