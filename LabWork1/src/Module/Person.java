package Module;

public class Person {
	private int NUID;
	private String firstName;
	private String lastName;
	private String collegeName;
	private Contact contactInfo = new Contact();
	private Address address = new Address();
	
	public int getNUID() {
		return NUID;
	}
	public void setNUID(int nUID) {
		NUID = nUID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Contact getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String phone, String email) {
		this.contactInfo.setPhone(phone);
		this.contactInfo.setE_mail(email);
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(String streetName, String aptNo, String state, String zipCode) {
		this.address.setAptNo(aptNo);
		this.address.setState(state);
		this.address.setStreetName(streetName);
		this.address.setZipCode(zipCode);
	}
	
}
