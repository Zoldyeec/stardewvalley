package filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortByItems extends start.Browser {

	private static boolean itemlist;

	public SortByItems(boolean itemlist) {
		SortByItems.setItemlist(false);
	}

	public static boolean isItemlist() {
		return itemlist;
	}

	public static void setItemlist(boolean itemlist) {
		SortByItems.itemlist = itemlist;
	}

	public static void filterItems() throws IOException {

		if (isItemlist() == true) {

			System.out.println("The program shows the names of the citizen, which item they like.\nPress a letter or type in the item.\n"
					+ "-------------------------");
			System.out.println("1: back to home");
			System.out.println("2: exit programm");
			System.out.println("3: show all items");
			System.out.printf("-------------------------" + System.lineSeparator());
			System.out.println("Choose an item:");

			Scanner scan = new Scanner(System.in);

			while (scan.hasNext()) {
				String iteems = scan.next().toLowerCase();

				if (iteems.matches("back") || iteems.matches("1")) {
					System.out.println("You are back.");
					start.Browser.start();

				} else if (iteems.matches("exit") || iteems.matches("2")) {
					System.out.println("Program closed.");
					System.exit(0);

				} else if (iteems.matches("all")|| iteems.matches("show all") || iteems.matches("items") || iteems.matches("3")) {
					for (int i = 0; i < items.size(); i++){
						System.out.println(items.get(i));
					}
				}

				for (int i = 0; i <= items.size() - 1; i++) {
//					String data = new String(); ist dasselbe wie:
//					String data = "";
//					data = items.get(i).toString();
					String data = items.get(i).toString();
					String dataCut = data.substring(0, iteems.length());
					if (dataCut.equalsIgnoreCase(iteems)) {
						System.out.println(items.get(i));
					}
				}
			} scan.close();

		} else {
			setItemlist(true);
			Itemliste();
			filterItems();
		}
	}

	public static ArrayList<Items> items = new ArrayList<Items>();

	public static void Itemliste() {

		items.add(new Items("Amethyst", "Abigail, Emily, Clint"));
		items.add(new Items("Aquamarine", "Emily, Clint"));
		items.add(new Items("Beer", "Shane, Pam"));
		items.add(new Items("Blueberry", "Lewis"));
		items.add(new Items("Cactus Fruit", "Lewis, Linus, Pam"));
		items.add(new Items("Cauliflower", "Maru"));
		items.add(new Items("Chocolate Cake", "Abigail, Jodi"));
		items.add(new Items("Cloth", "Emily"));
		items.add(new Items("Coconut", "Linus, Vincent"));
		items.add(new Items("Coffee", "Harvey"));
		items.add(new Items("Common Mushroom", "Linus"));
		items.add(new Items("Daffodil", "Haley, Caroline, Evelyn, George, Gus, Jas, Kent, Pam, Pierre, Vincent"));
		items.add(new Items("Diamond", "Maru, Penny, Evelyn, Gus, Jodi, Marnie, Willy"));
		items.add(new Items("Duck Feather", "Elliott"));
		items.add(new Items("Eggs", "Alex"));
		items.add(new Items("Emerald", "Emily, Penny, Clint"));
		items.add(new Items("Fairy Rose", "Evelyn, Jas"));
		items.add(new Items("Fried Calamari", "Pierre"));
		items.add(new Items("Frozen Tear", "Sebastian"));
		items.add(new Items("Goat Cheese", "Leah, Robin"));
		items.add(new Items("Gold Bar", "Maru, Clint"));
		items.add(new Items("Grape", "Vincent"));
		items.add(new Items("Hardwood", "Robin"));
		items.add(new Items("Holly", "Linus"));
		items.add(new Items("Hot Pepper", "Shane, Lewis"));
		items.add(new Items("Jade", "Emily, Clint"));
		items.add(new Items("Joja Cola", "Sam"));
		items.add(new Items("Leek", "George, Linus"));
		items.add(new Items("Mead", "Pam, Willy"));
		items.add(new Items("Melon", "Penny"));
		items.add(new Items("Miner's Treat", "Maru"));
		items.add(new Items("Obsidian", "Sebastian"));
		items.add(new Items("Pale Ale", "Pam"));
		items.add(new Items("Pancakes", "Jodi"));
		items.add(new Items("Parsnip", "Pam"));
		items.add(new Items("Peach", "Robin"));
		items.add(new Items("Pickles", "Harvey"));
		items.add(new Items("Plum Pudding", "Jas"));
		items.add(new Items("Poppy", "Penny"));
		items.add(new Items("Pumpkin", "Abigail, Willy"));
		items.add(new Items("Purple Mushroom", "Demetrius, Wizard"));
		items.add(new Items("Quartz", "Abigail, Emily, Marnie, Robin, Wizard"));
		items.add(new Items("Roasted Hazelnuts", "Kent"));
		items.add(new Items("Ruby", "Emily, Clint"));
		items.add(new Items("Salad", "Leah"));
		items.add(new Items("Sandfish", "Penny"));
		items.add(new Items("Sashimi", "Sebastian"));
		items.add(new Items("Sea Cucumber", "Willy"));
		items.add(new Items("Solar Essence", "Wizard"));
		items.add(new Items("Spaghetti", "Robin"));
		items.add(new Items("Spring Onion", "Linus"));
		items.add(new Items("Strawberry", "Maru, Demetrius"));
		items.add(new Items("Sturgeon", "Willy"));
		items.add(new Items("Summer Spangle", "Caroline"));
		items.add(new Items("Sunflower", "Haley"));
		items.add(new Items("Super Cucumber", "Wizard"));
		items.add(new Items("Topaz", "Emily, Clint"));
		items.add(new Items("Truffle", "Leah"));
		items.add(new Items("Tulip", "Evelyn"));
		items.add(new Items("Void Essence", "Wizard"));
		items.add(new Items("Wine", "Harvey, Leah"));
		items.add(new Items("Winter Root", "Linus"));
		items.add(new Items("Wool", "Emily"));
		items.add(new Items("Yam", "Linus"));
		
		Collections.sort(items);
	}
}