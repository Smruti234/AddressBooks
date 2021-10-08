package AddressBook;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	void print(Set<AddressBook> contactList) {
		for (AddressBook sc : contactList) {
			System.out.println(sc);
		}
	}
	static void edit(AddressBook contact) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Edit the details firstName,lastName,address,city,state,zip,phoneNumber,email ");
		contact.setFirstname(sc.nextLine());
		contact.setLastname(sc.nextLine());
		contact.setAddress(sc.nextLine());
		contact.setCity(sc.nextLine());
		contact.setStat(sc.nextLine());
		contact.setZip(sc.nextLine());
		contact.setPhoneNumber(sc.nextLine());
		contact.setEmail(sc.nextLine());
	}
	
	 static void remove(AddressBook contact) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Edit the details firstName,lastName,address,city,state,zip,phoneNumber,email ");
			contact.setFirstname(sc.nextLine());
			contact.setLastname(sc.nextLine());
			contact.setAddress(sc.nextLine());
			contact.setCity(sc.nextLine());
			contact.setStat(sc.nextLine());
			contact.setZip(sc.nextLine());
			contact.setPhoneNumber(sc.nextLine());
			contact.setEmail(sc.nextLine());
		
	}
}



