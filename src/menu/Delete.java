package menu;

import java.util.Scanner;

import entity.EntityList;

public class Delete {

	Scanner scan = new Scanner(System.in);

	boolean done;
	int index;
	int x;

	public Delete() {
		if (EntityList.sizeEntityList() <= 0) {
			System.out.println("There are no peoples in classroom!");
		} else {
			EntityList.displayEntityList();
			do {
				done = false;
				try {
					do {
						System.out.print("Input people index to delete: ");
						index = scan.nextInt();
						scan.nextLine();
						x = index - 1;
						EntityList.deleteEntityList(x);
					} while (!(x >= 0 && x <= EntityList.sizeEntityList()));

					System.out.println("People deleted successfully !!");
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);
		}
	}

}
