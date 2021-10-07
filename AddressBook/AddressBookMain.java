package AddressBook;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook Program");
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

		UserInterface user = new UserInterface();
		user.print(contactStore.getContactList());

	}
}

