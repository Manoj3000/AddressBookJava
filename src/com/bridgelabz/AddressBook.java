package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
	
		ArrayList<AddessBookData> contact = new ArrayList<>();
	
		contact.add(new AddessBookData("Manoj","Gaikwad","8412824420","manoj@gmail.com","Kranti Nagar","Udgir","Maharashtra",413517));
		contact.add(new AddessBookData("Ram","Roy","1234567890","ram@gmail.com","ram Nagar","Udgir","Maharashtra",413517));
		contact.add(new AddessBookData("Sai","Lal","7894561230","sai@gmail.com","sai Nagar","Udgir","Maharashtra",413517));
		 
		for (int i = 0; i < contact.size(); i++) {
			System.out.println("Number: " + contact.get(i).getFirst_name() + " " + contact.get(i).getLast_name());
		}	
	}
	
}
