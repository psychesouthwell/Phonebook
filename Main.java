package phonebook;

public class Main {                   

	public static void main(String[] args) {
		
		//Store the test cases
		Person person1 = new Person("John Doe", "John", "Doe", new Address ("114 Market St.", "St. Louis", "MO", "63403"), "(636)-643-5698");
		Person person2 = new Person("John E. Doe", "John", "Doe", new Address("324 Main St.", "St. Charles", "MO", "63303"), "(847)-539-0126");
		Person person3 = new Person("John Michael West Doe", "John", "Doe", new Address("574 Pole Ave", "St. Peters", "MO", "63333"), "(562)-859-2375");
		PhoneBook.listings = PhoneBook.expandListings(PhoneBook.listings, person1);
		PhoneBook.listings = PhoneBook.expandListings(PhoneBook.listings,person2);
		PhoneBook.listings = PhoneBook.expandListings(PhoneBook.listings,person3);

		//Calling menu method
		Menu.showMenu();
		
	

	}

}
