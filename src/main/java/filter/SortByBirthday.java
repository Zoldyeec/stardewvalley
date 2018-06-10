package filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortByBirthday extends start.Browser {

	private static boolean birthdaylist;

	public SortByBirthday(boolean birthday) {
		SortByBirthday.setBirthday(false);
	}

	public static boolean isBirthday() {
		return birthdaylist;
	}

	public static void setBirthday(boolean birthday) {
		SortByBirthday.birthdaylist = birthday;
	}

	public static void filterBirthday() throws IOException {

		if (isBirthday() == true) {

			System.out.println("The program shows the birthday of the citizen or events\nPress a letter or type in the item.\n"
					+ "-------------------------");
			System.out.println("1: filter by name");
			System.out.println("2: filter by month");
			System.out.println("3: back to home");
			System.out.println("4: exit programm");
			System.out.printf("5: show calendar" + System.lineSeparator());
			System.out.println("-------------------------");
			System.out.println("Choose an option:");

			Scanner scan = new Scanner(System.in);

			while (scan.hasNext()) {
				String birthday = scan.next().toLowerCase();

				if (birthday.matches("name") || birthday.matches("1")) {
					System.out.println("Choose a letter or name:");
					birthday = scan.next().toLowerCase();

					for (int i = 0; i <= name.size() - 1; i++) {
						String data = "";
						data = name.get(i).toString();
						String dataCut = data.substring(0, birthday.length());
						if (dataCut.equalsIgnoreCase(birthday)) {
							System.out.println(name.get(i));
						} 							
					}
					System.out.println();
					System.out.println("Choose an option again:");

				} else if (birthday.matches("month") || birthday.matches("2")) {
					System.out.println("Choose a letter or month:");
					birthday = scan.next().toLowerCase();

					for (int i = 0; i <= season.size() - 1; i++) {
						String data = "";
						data = season.get(i).toString();
						String dataCut = data.substring(0, birthday.length());
						if (dataCut.equalsIgnoreCase(birthday)) {
							System.out.println(season.get(i));
						}
					}
					System.out.println();
					System.out.println("Choose an option again:");

				} else if (birthday.matches("back") || birthday.matches("3")) {
					System.out.println("You are back.");
					start.Browser.start();

				} else if (birthday.matches("exit") || birthday.matches("4")) {
					System.out.println("Program closed.");
					System.exit(0);

				} else if (birthday.matches("all")|| birthday.matches("season") || birthday.matches("calendar") || birthday.matches("5")) {
					//shows all season
					for(Birthday temp: season){
						System.out.println(temp);
					}
				}
			} scan.close();
		} else {
			setBirthday(true);
			Namelist();
			Birthdaylist();
			filterBirthday();
		}
	}

	public static ArrayList<Birthday> name = new ArrayList<Birthday>();

	public static void Namelist() {
		//geordnet nach Name
		name.add(new Birthday("Alex", "Summer 13", 13));
		name.add(new Birthday("Elliott", "Fall 05" , 05));
		name.add(new Birthday("Harvey", "Winter 14", 14));
		name.add(new Birthday("Sam", "Summer 17", 17));
		name.add(new Birthday("Sebastian", "Winter 10" , 10));
		name.add(new Birthday("Shane", "Spring 20", 20));
		name.add(new Birthday("Abigail", "Fall 13" , 13));
		name.add(new Birthday("Emily", "Spring 27", 27));
		name.add(new Birthday("Haley", "Spring 14", 14));
		name.add(new Birthday("Leah", "Winter 23", 23));
		name.add(new Birthday("Maru", "Summer 10", 10));
		name.add(new Birthday("Penny", "Fall 02" , 02));
		name.add(new Birthday("Caroline", "Winter 07" , 07));
		name.add(new Birthday("Clint", "Winter 26", 26));
		name.add(new Birthday("Demetrius", "Summer 19", 19));
		name.add(new Birthday("Evelyn", "Winter 20" , 20));
		name.add(new Birthday("George", "Fall 24", 24));
		name.add(new Birthday("Gil", "unknown", 0));
		name.add(new Birthday("Gunther", "unknown", 0));
		name.add(new Birthday("Gus", "Summer 08", 8));
		name.add(new Birthday("Jas", "Summer 04", 04));
		name.add(new Birthday("Jodi", "Fall 11", 11));
		name.add(new Birthday("Kent", "Spring 04", 04));
		name.add(new Birthday("Lewis", "Spring 07", 07));
		name.add(new Birthday("Linus", "Winter 03" , 03));
		name.add(new Birthday("Marlon", "unknown" , 0));
		name.add(new Birthday("Marnie", "Fall 18" , 18));
		name.add(new Birthday("Morris", "unknown" , 0));
		name.add(new Birthday("Pam", "Spring 28", 28));
		name.add(new Birthday("Pierre", "Spring 26", 26));
		name.add(new Birthday("Robin", "Fall 21", 21));
		name.add(new Birthday("Vincent", "Spring 10", 10));
		name.add(new Birthday("Willy", "Summer 24", 24));
		name.add(new Birthday("Dwarf", "Summer 22", 22));
		name.add(new Birthday("Sandy", "Fall 15", 15));
		name.add(new Birthday("Krobus", "Winter 01", 01));
		name.add(new Birthday("Wizard", "Winter 17", 17));
		//Festivals
		name.add(new Birthday("Egg Festival", "Spring 13", 13));
		name.add(new Birthday("Flower Dance", "Spring 24", 24));
		name.add(new Birthday("Luau", "Summer 11", 11));
		name.add(new Birthday("Dance of the Moonlight Jellies", "Summer 28", 28));
		name.add(new Birthday("Stardew Valley Fair", "Fall 16", 16));
		name.add(new Birthday("Spirit's Eve", "Fall 27", 27));
		name.add(new Birthday("Festival of Ice", "Winter 08", 8));
		name.add(new Birthday("Feast of the Winter Star", "Winter 25", 25));

		Collections.sort(name);
	}


	public static ArrayList<Birthday> spring = new ArrayList<Birthday>();
	public static ArrayList<Birthday> summer = new ArrayList<Birthday>();
	public static ArrayList<Birthday> fall = new ArrayList<Birthday>();
	public static ArrayList<Birthday> winter = new ArrayList<Birthday>();
	public static ArrayList<Birthday> season= new ArrayList<Birthday>();


	//geordnet nach Monat
	public static void Birthdaylist() {
		//Spring
		spring.add(new Birthday("Spring 20", "Shane", 20));
		spring.add(new Birthday("Spring 27", "Emily", 27));
		spring.add(new Birthday("Spring 14", "Haley", 14));
		spring.add(new Birthday("Spring 04", "Kent", 04));
		spring.add(new Birthday("Spring 07", "Lewis", 07));
		spring.add(new Birthday("Spring 28", "Pam", 28));
		spring.add(new Birthday("Spring 26", "Pierre", 26));
		spring.add(new Birthday("Spring 10", "Vincent", 10));
		//Summer
		summer.add(new Birthday("Summer 13", "Alex", 13));
		summer.add(new Birthday("Summer 17", "Sam", 17));
		summer.add(new Birthday("Summer 10", "Maru", 10));
		summer.add(new Birthday("Summer 19", "Demetrius", 19));
		summer.add(new Birthday("Summer 08", "Gus", 8));
		summer.add(new Birthday("Summer 04", "Jas", 04));
		summer.add(new Birthday("Summer 24", "Willy", 24));
		summer.add(new Birthday("Summer 22", "Dwarf", 22));
		//Fall
		fall.add(new Birthday("Fall 05" , "Elliott", 05));
		fall.add(new Birthday("Fall 13" , "Abigail", 13));
		fall.add(new Birthday("Fall 02" , "Penny", 02));
		fall.add(new Birthday("Fall 24", "George", 24));
		fall.add(new Birthday("Fall 11", "Jodi", 11));
		fall.add(new Birthday("Fall 18" , "Marnie", 18));
		fall.add(new Birthday("Fall 21", "Robin", 21));
		fall.add(new Birthday("Fall 15", "Sandy", 15));
		//Winter
		winter.add(new Birthday("Winter 14", "Harvey", 14));
		winter.add(new Birthday("Winter 10", "Sebastian", 10));
		winter.add(new Birthday("Winter 23", "Leah", 23));
		winter.add(new Birthday("Winter 07" , "Caroline", 07));
		winter.add(new Birthday("Winter 26", "Clint", 26));
		winter.add(new Birthday("Winter 20" , "Evelyn", 20));
		winter.add(new Birthday("Winter 03" , "Linus", 03));
		winter.add(new Birthday("Winter 01", "Krobus", 01));
		winter.add(new Birthday("Winter 17", "Wizard", 17));
		//Festivals
		spring.add(new Birthday("Spring 13", "Egg Festival", 13));
		spring.add(new Birthday("Spring 24", "Flower Dance", 24));
		summer.add(new Birthday("Summer 11", "Luau", 11));
		summer.add(new Birthday("Summer 28", "Dance of the Moonlight Jellies", 28));
		fall.add(new Birthday("Fall 16", "Stardew Valley Fair", 16));
		fall.add(new Birthday("Fall 27", "Spirit's Eve", 27));
		winter.add(new Birthday("Winter 08", "Festival of Ice", 8));
		winter.add(new Birthday("Winter 25", "Feast of the Winter Star", 25));
		//sorteren nach richtiger Reihenfolge (Datum)
		Collections.sort(spring);
		Collections.sort(summer);
		Collections.sort(fall);
		Collections.sort(winter);
		//New ArrayList
		season.addAll(spring);
		season.addAll(summer);
		season.addAll(fall);
		season.addAll(winter);
	}
}
