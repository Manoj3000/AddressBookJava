package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	static ArrayList<AddessBookData> contact = new ArrayList<>();

	public static void setData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String firstName, lastName, phoneNumber, email, address, city, state;
		int zipCode;
		System.out.println("----- Please fill below fields -----");
		System.out.print("Enter first name : ");
		firstName = sc.nextLine();
		System.out.print("Enter last name : ");
		lastName = sc.nextLine();
		System.out.print("Enter phone number : ");
		phoneNumber = sc.nextLine();
		System.out.print("Enter email : ");
		email = sc.nextLine();
		System.out.print("Enter address : ");
		address = sc.nextLine();
		System.out.print("Enter city : ");
		city = sc.nextLine();
		System.out.print("Enter state : ");
		state = sc.nextLine();
		System.out.print("Enter zip code : ");
		zipCode = sc.nextInt();

		contact.add(new AddessBookData(firstName, lastName, phoneNumber, email, address, city, state, zipCode));
	}

	public static void showAllContacts() {
		for (int i = 0; i < contact.size(); i++) {
			System.out.println("Contact of " + contact.get(i).getFirst_name() + " is " + contact.get(i).getPhoneNumber() + " and mail is " + contact.get(i).getEmail());
		}
	}

	public static void repeat() {
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("press 1 to create contact :");
		System.out.println("press 0 to exit program :");
		int res = sc1.nextInt();
		switch (res) {
		case 1:
			setData();
			repeat();
			break;
		case 0:
			System.out.println("Exit");
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		repeat();
		showAllContacts();
	}

}
