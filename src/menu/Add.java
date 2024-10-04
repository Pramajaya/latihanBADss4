package menu;

import java.util.Scanner;

import entity.EntityList;
import entity.Lecturer;
import entity.Student;

public class Add {

	Scanner scan = new Scanner(System.in);

	int no;
	String name;
	int age;
	String role;
	double gpa;
	int salary;

	boolean done;

	public Add() {
		do {
			done = false;
			try {
				do {
					System.out.print("Input name [3 - 15 characters]: ");
					name = scan.nextLine();
				} while (!(name.length() >= 3 && name.length() <= 15));
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);

		do {
			done = false;
			try {
				do {
					System.out.print("Input age [min 16]: ");
					age = scan.nextInt();
					scan.nextLine();
				} while (!(age >= 16));
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);

		do {
			done = false;
			try {
				do {
					System.out.print("Input role ['Student', 'Lecturer']: ");
					role = scan.nextLine();
				} while (!(role.equals("Student") || role.equals("Lecturer")));
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);

		switch (role) {
		case "Student":
			do {
				done = false;
				try {
					while (true) {
						System.out.print("Input gpa [0 - 4]: ");
						gpa = scan.nextDouble();
						scan.nextLine();

						if (gpa >= 0 && gpa <= 4) {
							no = EntityList.sizeEntityList() + 1;
							EntityList.addEntityList(new Student(no, name, age, role, gpa));
							break;
						}
					}
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);
			break;
		case "Lecturer":
			do {
				done = false;
				try {
					while (true) {
						System.out.print("Input salary [min 4000000]: ");
						salary = scan.nextInt();
						scan.nextLine();

						if (salary >= 4000000) {
							no = EntityList.sizeEntityList() + 1;
							EntityList.addEntityList(new Lecturer(no, name, age, role, salary));
							break;
						}
					}
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);
			break;
		}
	}

}
