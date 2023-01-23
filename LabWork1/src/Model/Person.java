package Model;

public class Person {
	private int NUID;
	private String firstName;
	private String lastName;
	private String collegeName;
	private Contact contactInfo_official = new Contact();
	private Contact contactInfo_personal = new Contact();
	private Address address_permanent = new Address();
	private Address address_current = new Address();
	
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
	public Contact getContactInfo_official() {
		return contactInfo_official;
	}
	public void setContactInfo_official(String phone, String email) {
		this.contactInfo_official.setPhone(phone);
		this.contactInfo_official.setE_mail(email);
	}
	public Address getAddress_permanent() {
		return address_permanent;
	}
	public void setAddress_permanent(String streetName, String aptNo, String state, String zipCode) {
		this.address_permanent.setAptNo(aptNo);
		this.address_permanent.setState(state);
		this.address_permanent.setStreetName(streetName);
		this.address_permanent.setZipCode(zipCode);
	}
	public Contact getContactInfo_personal() {
		return contactInfo_personal;
	}
	public void setContactInfo_personal(String phone, String email) {
		this.contactInfo_personal.setPhone(phone);
		this.contactInfo_personal.setE_mail(email);
	}
	public Address getAddress_current() {
		return address_current;
	}
	public void setAddress_current(String streetName, String aptNo, String state, String zipCode) {
		this.address_current.setAptNo(aptNo);
		this.address_current.setState(state);
		this.address_current.setStreetName(streetName);
		this.address_current.setZipCode(zipCode);
	}
	
}
