package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		  AddressBook addressbook = new AddressBook();

			addressbook.setFirstname("smruti");
			addressbook.setLastname("lenka");
			addressbook.setZip("746046");
			addressbook.setAddress("barapur");
			addressbook.setStat("bhadrak");
			addressbook.setCity("Basudevpur");
			addressbook.setEmail("slenka132@gmail.com");
			addressbook.setPhoneNumber("7504614661");
			
			AddressBook addressbook1 = new AddressBook();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter details  new person firstName,lastName,address,city,state,zip,phoneNumber,Email ");
			addressbook1.setFirstname(sc.nextLine());
			addressbook1.setLastname(sc.nextLine());
			addressbook1.setAddress(sc.nextLine());
			addressbook1.setCity(sc.nextLine());
			addressbook1.setStat(sc.nextLine());
			addressbook1.setZip(sc.nextLine());
			addressbook1.setPhoneNumber(sc.nextLine());
			addressbook1.setEmail(sc.nextLine());
			
			ContactStore contactStore = new ContactStore();
			contactStore.add(addressbook);
			contactStore.add(addressbook1);

			UserInterface user = new UserInterface();
			user.print(contactStore.getContactList());
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter name of contact you want to edit");
			String name = s.nextLine();
			if(addressbook.getFirstname().equalsIgnoreCase(name) == false)
				addressbook.setFirstname(name);
				UserInterface.edit(addressbook);
			 if(addressbook1.getFirstname().equalsIgnoreCase(name) == false)
				 UserInterface.edit(addressbook1);
					System.out.println("Contact List after edit");
			user.print(contactStore.getContactList());

		}
	}



