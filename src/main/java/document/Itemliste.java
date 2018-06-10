package document;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import filter.Items;

public class Itemliste {

	public static void main(String[] args) {

		String dateiName = "test.txt"; 
		ladeDatei(dateiName); 

		ArrayList<Items> items = new ArrayList<Items>(); 

		items.add(new Items("Test", "Abigail, Emily, Clint"));
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
		items.add(new Items("Purple Mushroom", "Demetrius"));
		items.add(new Items("Quartz", "Abigail, Emily, Marnie, Robin"));
		items.add(new Items("Roasted Hazelnuts", "Kent"));
		items.add(new Items("Ruby", "Emily, Clint"));
		items.add(new Items("Salad", "Leah"));
		items.add(new Items("Sandfish", "Penny"));
		items.add(new Items("Sashimi", "Sebastian"));
		items.add(new Items("Sea Cucumber", "Willy"));
		items.add(new Items("Spaghetti", "Robin"));
		items.add(new Items("Spring Onion", "Linus"));
		items.add(new Items("Strawberry", "Maru, Demetrius"));
		items.add(new Items("Sturgeon", "Willy"));
		items.add(new Items("Summer Spangle", "Caroline"));
		items.add(new Items("Sunflower", "Haley"));
		items.add(new Items("Topaz", "Emily, Clint"));
		items.add(new Items("Truffle", "Leah"));
		items.add(new Items("Tulip", "Evelyn"));
		items.add(new Items("Wine", "Harvey, Leah"));
		items.add(new Items("Winter Root", "Linus"));
		items.add(new Items("Wool", "Emily"));
		items.add(new Items("Yam", "Linus"));

		try {
			listInDatei(items, new File("test.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
	} 

	private static void listInDatei(ArrayList<Items> items, File datei) throws IOException { 
		PrintWriter printWriter = null; 
		try { 
			printWriter = new PrintWriter(new FileWriter(datei)); 
			Iterator<Items> iter = items.iterator(); 
			while(iter.hasNext() ) { 
				Object o = iter.next(); 
				printWriter.println(o); 
			} 
		} catch (IOException e) { 
			e.printStackTrace(); 
		} finally { 
			if(printWriter != null) printWriter.close(); 
		} 
	} 


	private static void ladeDatei(String datName) { 

		File file = new File(datName); 

		if (!file.canRead() || !file.isFile()) 
			System.exit(0); 

		BufferedReader in = null; 
		try { 
			in = new BufferedReader(new FileReader(datName)); 
			String zeile = null; 
			while ((zeile = in.readLine()) != null) { 
				//gelesene Zeile:
				System.out.println(zeile); 
			} 
		} catch (IOException e) { 
			e.printStackTrace(); 
		} finally { 
			if (in != null) 
				try { 
					in.close(); 
				} catch (IOException e) { 
				} 
		} 
	} 
}