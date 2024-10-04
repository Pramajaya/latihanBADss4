package menu;

import entity.EntityList;

public class View {

	public View() {
		if (EntityList.sizeEntityList() <= 0) {
			System.out.println("There are no peoples in classroom!");
		} else {
			EntityList.displayEntityList();
		}
	}

}
