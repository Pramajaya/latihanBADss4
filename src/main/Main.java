package main;

import java.util.Scanner;

import menu.Add;
import menu.Delete;
import menu.Exit;
import menu.View;

public class Main {
	Scanner scan = new Scanner(System.in);

	boolean done;
	int home = 0;

	public Main() {
		do {
			done = false;
			try {
				while (true) {
					System.out.println("1. Add people");
					System.out.println("2. View people");
					System.out.println("3. Remove people");
					System.out.println("4. Exit");
					System.out.print(">> ");
					home = scan.nextInt();
					scan.nextLine();
					switch (home) {
					case 1:
						new Add();
						break;
					case 2:
						new View();
						break;
					case 3:
						new Delete();
						break;
					case 4:
						new Exit();
						break;
					}

					if (home == 4) {
						break;
					}
				}
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);
	}

	public static void main(String[] args) {
		new Main();

	}

}
