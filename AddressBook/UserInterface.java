package AddressBook;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	public void print(Set<AddressBook> contactList) {
		for (AddressBook i : contactList) {
			System.out.println(i);
		}
	}
	public void edit(AddressBook contact) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Editted details firstname,last name,address,city,state,zip,phone number,email");
		contact.setFirstname(sc.nextLine());
		contact.setFirstname(sc.nextLine());
		contact.setAddress(sc.nextLine());
		contact.setCity(sc.nextLine());
		contact.setStat(sc.nextLine());
		contact.setZip(sc.nextLine());
		contact.setPhoneNumber(sc.nextLine());
		contact.setEmail(sc.nextLine());
	}
}