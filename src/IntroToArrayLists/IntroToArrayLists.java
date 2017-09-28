package IntroToArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class IntroToArrayLists {
	public static void main(String[] args) {

		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class

		ArrayList<String> list = new ArrayList<String>();

		// 2. Add five Strings to your list

		list.add(" A");// 0
		list.add(" B");// 1
		list.add(" C");// 2
		list.add(" D");// 3
		list.add(" E");// 4

		// 3. Print all the Strings using a standard for-loop

		for (int i = 0; i < list.size(); i++) {

			String l = list.get(i);

			System.out.println(l);

		}
		System.out.println("\n");
		// 4. Print all the Strings using a for-each loop

		for (String l : list) {

			System.out.println(l);

		}

		System.out.println("\n");
		// 5. Print only the even numbered elements in the list.

		for (int i = 0; i < list.size(); i += 2) {

			String l = list.get(i);

			System.out.println(l);

		}

		System.out.println("\n");
		// 6. Print all the Strings in reverse order.

		for (int i = list.size() - 1; i > -1; i--) {

			String l = list.get(i);

			System.out.println(l);

		}

		// 7. Print only the Strings that have the letter 'e' in them.

	}
}
