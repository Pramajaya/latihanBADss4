package entity;

import java.util.ArrayList;

public class EntityList {

	// kalo buat arraylist di package lain harus pake static, karena objek disetiap
	// kelas itu berbeda

	public static ArrayList<Person> personList = new ArrayList<Person>();

	public static void addEntityList(Person person) {
		personList.add(person);
	}

	public static int sizeEntityList() {
		return personList.size();
	}

	public static void displayEntityList() {
		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i));
		}
	}

	public static void deleteEntityList(int i) {
		for (i = 0; i < personList.size(); i++) {
			personList.remove(i);
		}
	}
}
