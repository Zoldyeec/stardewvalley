package document;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class SortByItems2 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader input = null;
		List<String> name = new ArrayList<String>();
		try {
			input = new BufferedReader(new FileReader("test.txt"));
			String nm;
			while ((nm = input.readLine()) != null) {
				name.add(nm);
			}
		} finally {
			if(input != null) input.close();
		}
		//zeigt ungeordnete Liste
		display(name);
		System.out.println(search(name));
		//Methode, die die Liste ordnet
		sortName(name);
		System.out.println("");
		//zeigt geordnete Liste
		display(name);
		//Methode, die in der Liste nach der Stelle im Text sucht
		
		System.out.println(search(name));
	}

	public static void display(Collection<String> L1) {
		for(String x:L1)
			System.out.println(x);
	}

	public static void sortName(List<String> L2) {
		Collections.sort(L2);
	}
	
	public static int search(List<String> L3) {
		return Collections.binarySearch(L3, "Beer");
	}
}
