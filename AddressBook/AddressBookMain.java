package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	private static final AddressBook newContact = null;

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
			
			
			ContactStore contactStore = new ContactStore();
			contactStore.add(addressbook);
			
			
			 UserInterface userinterface = new  UserInterface();
			userinterface.print(contactStore.getContactList());
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number of users");
			int n=sc.nextInt();
			for(int i = 1; i <= n; i++)
			{
			AddressBook newContact = new AddressBook();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter  you details ");
			System.out.println("Enter first name ");
			newContact.setFirstname(sc1.nextLine());
			System.out.println("enter last name ");
			newContact.setLastname(sc1.nextLine());
			System.out.println("enter address ");
			newContact.setAddress(sc1.nextLine());
			System.out.println("enter city ");
			newContact.setCity(sc1.nextLine());
			System.out.println("enter state ");
			newContact.setStat(sc1.nextLine());
			System.out.println("enter zip ");
			newContact.setZip(sc1.nextLine());
			System.out.println("enter phone number ");
			newContact.setPhoneNumber(sc1.nextLine());
			System.out.println("enter email ");
			newContact.setEmail(sc1.nextLine());
			contactStore.add(newContact);
			userinterface.print(contactStore.getContactList());
			}
		}
	}
			

