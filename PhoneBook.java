package phonebook;


public class PhoneBook {                                     

	
	public static Person[] listings = new Person[0];         //Create a Person array
	
	
	public static Person[] expandListings(Person[]list, Person newPerson) {
		Person[] newArray = new Person[list.length + 1];
		for (int i = 0; i< list.length; i++) {
			newArray[i]= list[i];
		}
		newArray[newArray.length - 1] = newPerson;
		return newArray;
	}
	
	public static void addNewListing(String newListing) {
		String[] newListingArray = newListing.split(",");    //identify the different strings as separated by commas
		String fullName = newListingArray[0];
		String[] name = fullName.split(" ");
		String firstName = name[0];
		String lastName = name[name.length-1];
		String street = newListingArray[1];
		String city = newListingArray[2];
		String state = newListingArray[3];
		String zipCode = newListingArray[4];
		String telephone = newListingArray[5];
		
		Person newPerson = new Person(fullName, firstName, lastName, new Address(street, city, state, zipCode), telephone);
		listings = expandListings(listings, newPerson);
		
	}
	
	public static void deleteRecord(String number) {
		Person[] newArray = new Person[0];
		for(int i = 0; i<listings.length; i++) {
			if(!listings[i].getTelephone().equals(number)) {          //delete by not including the match in new array
				newArray=expandListings(newArray, listings[i]);
				
			}
		}
		for(Person person : newArray) {
			System.out.println(person);
		}
		
	}
	
	public static Person[] searchByTelephone(String number) {
		Person[] foundMatch = new Person[0];
		for(int i =0; i<listings.length; i++) {
			if(listings[i].getTelephone().equals(number)) {
				foundMatch=expandListings(foundMatch, listings[i]);
				
			}
		}
			for(Person person : foundMatch) {
				System.out.println(person);
			}
			return foundMatch;
		}
	
	public static Person[] searchByCityState(String entry) {
		Person[] foundMatch = new Person[0];
		for(int i =0; i<listings.length; i++) {
			if((listings[i].getAddress().getCity().equals(entry))||(listings[i].getAddress().getState().equals(entry))) {
				foundMatch=expandListings(foundMatch, listings[i]);
			}
		}
			for(Person person : foundMatch) {
				System.out.println(person);
			}
			return foundMatch;
		}
	
	public static Person[] searchByName(String name) {
		Person[] foundMatch = new Person[0];
		for(int i =0; i<listings.length; i++) {
			if((listings[i].getFirstName().equals(name))|| (listings[i].getLastName().equals(name)) || (listings[i].getFullName().equals(name))){
				foundMatch=expandListings(foundMatch, listings[i]);
			}
		}
			for(Person person : foundMatch) {
				System.out.println(person);
			}
			return foundMatch;
		}
	
	public static Person updateListing(String updateInfo) {
		for (Person person: listings) {
			if(person.getTelephone().equals(updateInfo)) {
				return person;
			}
				
		}
		return null;
	}
}
			
				
	

	
	

	
