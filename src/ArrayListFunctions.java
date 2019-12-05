

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListFunctions {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;

		// TODO Auto-generated method stub
		ArrayList<String> list = createArrayList();
		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = s.nextInt();
			s.nextLine();

			switch (choice) {
			case 1:
				printArrayList(list);
				break;
			case 2:
				iterateArrayList(list);
				break;
			case 3:
				insertElement(list);
				break;
			case 4:
				retrieveElement(list);
				break;
			case 5:
				updateSpecificElement(list);
				break;
			case 6:
				removeThirdElement(list);

			case 7:
				searchElement(list);
				break;
			case 8:
				sortArrayList(list);
				break;
			case 9:
				copyArrayList(list);
				break;
			case 10:
				shuffleElement(list);
				break;
			case 11:
				reverseElement(list);

			case 12:
				extractFromArrayList(list);

			case 13:
				quit = true;
				break;
			}
		}
	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 1 - Create a new array list.");
		System.out.println("\t 2 - To iterate through all elements.");
		System.out.println("\t 3 - To insert an element into the array list.");
		System.out.println("\t 4 - To retrieve an element (at a specified index).");
		System.out.println("\t 5 - To update specific array element.");
		System.out.println("\t 6 - To remove the third element.");
		System.out.println("\t 7 - To search an element in a array list.");
		System.out.println("\t 8 - To sort a given array list..");
		System.out.println("\t 9 - To copy one array list into another.");
		System.out.println("\t 10 - To shuffle elements in a array list.");
		System.out.println("\t 11 - To reverse elements in a array list.");
		System.out.println("\t 12- To extract a portion of a array list.");
		System.out.println("\t 13- Quit");

	}

	// create array list
	public static ArrayList<String> createArrayList() {
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Violet");
		colorList.add("Yellow");
		colorList.add("Orange");

		return colorList;
	}

	public static void printArrayList(ArrayList<String> list) {
		System.out.println("List of colors" + "\n" + list);

	}

	// iterate all elements

	public static void iterateArrayList(ArrayList<String> list) {
		createArrayList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	// insert element at first position
	public static void insertElement(ArrayList<String> list) {
		list.add(0, "Pink");
		System.out.println("List of colors" + "\n" + list);
	}

	// retrieve an element (at a specified index)
	public static void retrieveElement(ArrayList<String> list) {
		System.out.println("Enter position : ");
		int position = s.nextInt();
		System.out.println(list.get(position - 1));
	}

	// update specific array element
	public static void updateSpecificElement(ArrayList<String> list) {
		System.out.println("Enter the position to update: ");
		int position = s.nextInt();

		System.out.println("Enter the updated value:  ");
		String newColor = s.next();

		System.out.println(list.set(position - 1, newColor));

		System.out.println("List of updated colors" + "\n" + list);
	}

	// remove the third element
	public static void removeThirdElement(ArrayList<String> list) {
		list.remove(2);
		System.out.println("List of updatedcolors" + "\n" + list);
	}

	// search an element
	public static void searchElement(ArrayList<String> list) {
		System.out.println("Enter the color to be searched ");
		String searchItem = s.next();

		if (list.contains(searchItem)) {
			System.out.println("Color Found!!");
		} else {
			System.out.println("No Color Found!!");
		}
	}

	// program to sort
	public static void sortArrayList(ArrayList<String> list) {
		Collections.sort(list);
		System.out.println("Sorted color list" + "\n" + list);
	}

	// copy one array list into another
	public static void copyArrayList(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("A");
		newList.add("B");
		newList.add("C");
		newList.add("D");
		newList.add("E");
		newList.add("F");
		newList.add("G");

		System.out.println("\nCurrent ColorList B : " + "\n" + list);

		Collections.copy(newList, list);

		System.out.println("\nUpdated ColorList : " + "\n" + newList);
	}

	// shuffle elements in a array list.
	public static void shuffleElement(ArrayList<String> list) {
		Collections.shuffle(list);
		System.out.println("After shuffling:\n" + list);
	}

	// reverse elements in a array list
	public static void reverseElement(ArrayList<String> list) {
		Collections.reverse(list);
		System.out.println("Reverse List:\n" + list);
	}

	// extract a portion of a array list
	public static void extractFromArrayList(ArrayList<String> list) {
		ArrayList<String> sub_List = (ArrayList<String>) list.subList(0, 3);
		System.out.println("List of first three elements: " + sub_List);
	}

	// compare two array lists
	/*
	 * public static void compareTwoArray(ArrayList<String> list1) {
	 * 
	 * ArrayList<String> list2 = new ArrayList<String>(); list2.add("Blue");
	 * list2.add("Blue"); list2.add("Green"); list2.add("Violet");
	 * list2.add("Yellow"); list2.add("Orange");
	 * 
	 * }
	 */

}
