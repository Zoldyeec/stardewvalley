package start;

/** author: Minh Tu Nguyen
 * Stardew Valley, game by Chucklefish Ltd.
 * supported games
 */

import java.io.IOException;
import java.util.Scanner;

import filter.SortByLikes;
import filter.SortByItems;
import filter.SortByBirthday;

public class Browser {

	static Scanner main = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		start();	
	}

	public static void start() throws IOException {
		
		System.out.println("This program has been developped to help u being organized in the game."+ System.lineSeparator());
		System.out.println("1: Browse By Likes");
		System.out.println("2: Browse By Item");
		System.out.println("3: Browse By Birthday");
		System.out.printf("4: Exit program" + System.lineSeparator()

		+ "-------------------------" + System.lineSeparator());
		System.out.println("Choose a number:");
		
		String option = null;
		do {
			option = main.nextLine();
			option.toLowerCase();

			if (option.matches("1")) {
				SortByLikes.citizen();
				
			} else if (option.matches("2")) {
				SortByItems.filterItems();
				
			} else if (option.matches("3")) {	
				SortByBirthday.filterBirthday();
				
			} else if (option.matches("exit") || option.matches("4")) {
				System.exit(0);
				
			} else {
				option = null;
			}
		} while (option == null);
	}
}
