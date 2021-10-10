package AddressBook;

public class AddressBook {
	private String firstname;
	private String lastname;
	private String address;
	private String zip;
	private String email;
	private String city;
	private String state;
	private String phoneNumber;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStat() {
		return state;
	}

	public void setStat(String state) {
		this.state = state;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "AddressBook [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", zip="
				+ zip + ", email=" + email + ", city=" + city + ", state=" + state + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}

