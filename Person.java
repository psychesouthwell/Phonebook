package phonebook;

public class Person {
									   
	private String fullName;
	private String firstName;
	private String lastName;           
	private Address address;  
	private String telephone;   
	
	
	public Person() {} //default constructor
	
	
	//Parameterized Constructors 
	public Person(String firstName, String lastName, Address address, String telephone) {  
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.telephone=telephone;
	
	} 
	public Person(String fullName, String firstName, String lastName, Address address, String telephone) {  
		this.fullName=fullName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.telephone=telephone;
	
	} 
	
	public Person(String fullName, Address address, String telephone) {  
		this.fullName=fullName;
		this.address=address;
		this.telephone=telephone;
	
	} 
	
	// Getters and Setters
	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	
	public String getFirstName() {   
		return this.firstName;          
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;                   //Sets the private variable firstName to the argument firstName
	}
	
	
	public String getLastName() {
		return this.lastName;
}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	
	
	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}
	
	public String toString()             //Formatted output
	{
		return "Full Name: " +fullName+ "\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Address: " + address.toString() + "\n" + 
	"Phone Number: " + telephone + "\n";
	}
	
	
}
