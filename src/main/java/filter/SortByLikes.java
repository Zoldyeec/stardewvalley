package filter;

import java.io.IOException;
import java.util.Scanner;

import start.Browser;

public class SortByLikes extends start.Browser{

	public static void citizen() throws IOException {

		String uloves;
		uloves = ("Prismatic Shard /except Haley/ and Rabbit's Foot /except Penny/");

		String ulikes;
		ulikes = ("Maple Syrup + All Artisan Goods, All Cooking, All Flowers, All Foraged Minerals, All Fruit Tree Fruits, All Gems, All Vegetables");

		// Bachelors
		String Alex = "LIKES: eggs",
				Elliott = "LOVES: Duck Feather",
				Harvey = "LOVES: Coffee, Pickles, Wine",
				Sam = "LIKES: Joja Cola",
				Sebastian = "LOVES: Frozen Tear, Obsidian, Sashimi",
				Shane = "LOVES: Beer, Hot Pepper",
				// Bachelorettes	
				Abigail = "LOVES: Amethyst, Chocolate Cake, Pumpkin\nLIKES: Quartz",
				Emily = "LOVES: Amethyst, Aquamarine, Emerald, Jade, Ruby, Topaz, Cloth, Wool\nLIKES: Quartz",
				Haley = "LOVES: Sunflower\nLIKES: Daffodil",
				Leah = "LOVES: Goat Cheese, Wine, Salad, Truffle",
				Maru = "LOVES: Cauliflower, Strawberry, Miner's Treat, Diamond, Gold Bar",
				Penny = "LOVES: Diamond, Emerald, Melon, Poppy, Sandfish",
				//Townspeople	
				Caroline = "LOVES: Summer Spangle\nLIKES: Daffodil",
				Clint = "LOVES: Amethyst, Aquamarine, Emerald, Gold Bar, Jade, Ruby, Topaz",
				Demetrius = "LOVES: Strawberry\nLIKES: Purple Mushroom",
				Dwarf = "LOVES: Amethyst, Aquamarine, Emerald, Jade, Omni Geode, Ruby, Topaz\nLIKES: Dwarf Scrolls, Dwarf Gadget, Dwarvish Helm, Quartz",
				Evelyn = "LOVES: Diamond, Fairy Rose, Tulip\nLIKES: Daffodil",
				George = "LOVES: Leek\nLIKES: Daffodil",
				Gil = "none",
				Gunther = "none",
				Gus = "LOVES: Diamond\nLIKES: Daffodil",
				Jas = "LOVES: Fairy Rose, Plum Pudding\nLIKES: Daffodil",
				Jodi = "LOVES: Diamond, Chocolate Cake, Pancakes",
				Kent = "LOVES: Roasted Hazelnuts\nLIKES: Daffodil",
				Lewis = "LOVES: Hot Pepper\nLIKES: Blueberry, Cactus Fruit",
				Linus = "LOVES: Yam, Coconut, Cactus Fruit\nLIKES: Leek, Snow Yam, Spring Onion, Winter Root, Holly, Common Mushroom",
				Marlon = "none",
				Marnie = "LOVES: Diamond\nLIKES: Quartz",
				Morris = "none",
				Pam = "LOVES: Beer, Mead, Cactus Fruit, Pale Ale, Parsnip\nLIKES: Daffodil",
				Pierre = "LOVES: Fried Calamari\nLIKES: Daffodil",
				Robin = "LOVES: Goat Cheese, Peach, Spaghetti\nLIKES: Hardwood, Quartz",
				Vincent = "LOVES: Grape\nLIKES: Daffodil, Coconut",
				Willy = "LOVES: Diamond, Mead, Pumpkin, Sea Cucumber, Sturgeon",
				Wizard = "LOVES: Purple Mushroom, Solar Essence, Super Cucumber, Void Essence\nLIKES: Quartz";


		Scanner scan = new Scanner(System.in);

		System.out.println("The program shows the likes or loves of a citizen.\nPress 'hints' to show choices.\n"
				+ "-------------------------");
		System.out.println("1: back to home");
		System.out.println("2: exit programm");
		System.out.println("-------------------------");
		System.out.println("Choose a name:");

		//scanne solange, bis man exit drückt
		while (scan.hasNext()) {
			String person = scan.next().toLowerCase();

			// Loves and Likes
			if (person.equals("uloves")) {
				System.out.println(uloves);

			} else if (person.equals("ulikes")) {
				System.out.println(ulikes);
				// Gift Taste
			} else if (person.equals("points")) {
				System.out.println("Gift Taste Normal Santa(×5) Birthday (×8)\n"
						+ "Love	   +80	  +400	    +640\n"
						+ "Like	   +45	  +225	    +360\n"
						+ "Neutral    +20	  +100	    +160\n"
						+ "Dislike	   -20	  -100	    -160\n"
						+ "Hate	   -40	  -200	    -320\n"
						+ "-------------------------");
				// Quality	Multiplier
			} else if (person.equals("multi")) {
				System.out.println("Quality	Multiplier\n"
						+ "Normal	+0%\n"
						+ "Silver	+10%\n"
						+ "Gold	+25%\n"
						+ "Iridium	+50%\n"
						+ "-------------------------");
				// hints
			} else if (person.equals("hints")) {
				System.out.println("Choices:\n"
						+ "-------------------------\n"
						+ "uloves and ulikes\n"
						+ "points and multi\n"
						+ "Bachelors: alex, elliott, harvey, sam, sebastian, shane\n"
						+ "Bachelorettes: abigail, emily, haley, leah, maru, penny\n"
						+ "Townspeople: caroline, clint, demetrius, evelyn, george,\n gil, gunther, gus, jas, jodi, kent, lewis, linus, marlon,\n marnie, morris, pam, pierre, robin, vincent, willy\n"
						+ "-------------------------");
				// Bachelors
			} else if (person.equals("alex")) {
				System.out.println(Alex);

			} else if (person.equals("elliott")) {
				System.out.println(Elliott);

			} else if (person.equals("harvey")) {
				System.out.println(Harvey);

			} else if (person.equals("sam")) {
				System.out.println(Sam);

			} else if (person.equals("sebastian")) {
				System.out.println(Sebastian);

			} else if (person.equals("shane")) {
				System.out.println(Shane);
				//Bachelorettes
			} else if (person.equals("abigail")) {
				System.out.println(Abigail);

			} else if (person.equals("emily")) {
				System.out.println(Emily);

			} else if (person.equals("haley")) {
				System.out.println(Haley);

			} else if (person.equals("leah")) {
				System.out.println(Leah);

			} else if (person.equals("maru")) {
				System.out.println(Maru);

			} else if (person.equals("penny")) {
				System.out.println(Penny);
				//Townspeople
			} else if (person.equals("caroline")) {
				System.out.println(Caroline);

			} else if (person.equals("clint")) {
				System.out.println(Clint);

			} else if (person.equals("demetrius")) {
				System.out.println(Demetrius);
				
			} else if (person.equals("dwarf")) {
				System.out.println(Dwarf);

			} else if (person.equals("evelyn")) {
				System.out.println(Evelyn);

			} else if (person.equals("george")) {
				System.out.println(George);

			} else if (person.equals("gil")) {
				System.out.println(Gil);

			} else if (person.equals("gunther")) {
				System.out.println(Gunther);

			} else if (person.equals("gus")) {
				System.out.println(Gus);

			} else if (person.equals("jodi")) {
				System.out.println(Jodi);

			} else if (person.equals("kent")) {
				System.out.println(Kent);

			} else if (person.equals("jas")) {
				System.out.println(Jas);

			} else if (person.equals("lewis")) {
				System.out.println(Lewis);

			} else if (person.equals("linus")) {
				System.out.println(Linus);

			} else if (person.equals("marlon")) {
				System.out.println(Marlon);

			} else if (person.equals("marnie")) {
				System.out.println(Marnie);

			} else if (person.equals("morris")) {
				System.out.println(Morris);

			} else if (person.equals("pam")) {
				System.out.println(Pam);

			} else if (person.equals("pierre")) {
				System.out.println(Pierre);

			} else if (person.equals("robin")) {
				System.out.println(Robin);

			} else if (person.equals("vincent")) {
				System.out.println(Vincent);

			} else if (person.equals("willy")) {
				System.out.println(Willy);

			} else if (person.equals("wizard")) {
				System.out.println(Wizard);

			} else if (person.matches("back") || person.matches("1")) {
				System.out.println("You are back.");
				Browser.start();

			} else if (person.equals("exit") || person.equals("2")) {
				System.out.println("Program closed.");
				System.exit(0);

			} else {
				System.out.println("Please enter a valid character:");
			} 
		} scan.close();
	}
}