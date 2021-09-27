package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBooks {

	static HashMap<String, AddressBook> addressBooks = new HashMap<>();

	public static void printAddressBooks() {
		addressBooks.entrySet().forEach(entry -> {
			System.out.print(entry.getKey() + ", ");
		});
	}

	private static void setAddressBooks(String adbsName) {
		if (addressBooks.containsKey(adbsName)) {
			AddressBook addressBook = addressBooks.get(adbsName);
			addressBook.repeat();
		} else {
			System.out.println(adbsName + " AddressBook is not found");
		}
	}

	public static void main(String[] args) {

		boolean continueLoop = true;

		while (continueLoop) {
			System.out.println(
					"\nEnter 1 To Create AddressBook\nEnter 2 To Go Into AddressBook\nEnter 3 To Print AddressBooks\nEnter 0 To Exit");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter AddressBook Name : ");
				String abName = sc.next();
				AddressBook addressBook = new AddressBook();
				addressBooks.put(abName, addressBook);
				break;
			case 2:
				System.out.print("Enter Name of AddressBook : ");
				String adbsName = sc.next();
				setAddressBooks(adbsName);
				break;
			case 3:
				printAddressBooks();
				break;
			case 0:
				System.out.println("Exit");
				continueLoop = false;
				break;
			default:
				break;
			}
		}
	}
}
