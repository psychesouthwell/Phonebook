package phonebook;

import java.util.Scanner;

public abstract class Menu {
	static Scanner in = new Scanner(System.in);

	public static void showMenu() {
		boolean isEnd=false;
		
		do {
		
		System.out.println("1: Show All Records");
		System.out.println("2: Add New Record");
		System.out.println("3: Delete Record");
		System.out.println("4: Find Record By Telephone Number");
		System.out.println("5: Find Record By Name");
		System.out.println("6: Search by City or State");
		System.out.println("7: Update Record");
		System.out.println("8: Exit");
		
		String selection = in.nextLine();

		
		switch(selection) {
		case "1":
			System.out.println("Current listings in ascending order:");  
			for(int i=0; i < PhoneBook.listings.length; i++) {
				sortListings(PhoneBook.listings);      			   //Show all listings in ascending order by full name
				System.out.println(PhoneBook.listings[i]);}	
			break;                                
			
		case "2":
			System.out.println("Enter the new information, separated by commas with no space: "); 
			String newInfo = in.nextLine();
			PhoneBook.addNewListing(newInfo);
			break;
			
		case "3":
			System.out.println("Enter a phone number to delete: "); 
			String phoneNumber = in.nextLine();
			PhoneBook.deleteRecord(phoneNumber);
			break;
			
		case "4":
			System.out.println("Enter a phone number to search: "); 
			String number = in.nextLine();
			PhoneBook.searchByTelephone(number);
			break;
			
		case "5":
			System.out.println("Enter a name search: "); 
			String name = in.nextLine();
			PhoneBook.searchByName(name);
			break;
		
		case "6":
			System.out.println("Enter a city or state to search");
			String cityOrState = in.nextLine();
			PhoneBook.searchByCityState(cityOrState);
			break;
			
		case "7": 
			System.out.println("Enter the phone number for the record you'd like to update: ");
			String updateInfo = in.nextLine();
			PhoneBook.updateListing(updateInfo);
			System.out.println("What would you like to change? Enter: 1=Name, 2=Address, 3=Phone Number");
			String menuB= in.nextLine();
			switch (menuB) {
			case "1":
				System.out.println("Follow the prompts to update your name.");
				System.out.print("Enter your full name: ");
				String newName=in.nextLine();
				System.out.print("Enter your first name: ");
				String newFirstName=(in.nextLine());
				System.out.print("Enter your last name: ");
				String newLastName=in.nextLine();
				
				//Update the listing with entered information
				PhoneBook.updateListing(updateInfo).setFullName(newName);
				PhoneBook.updateListing(updateInfo).setFirstName(newFirstName);
				PhoneBook.updateListing(updateInfo).setLastName(newLastName);
				break;
			case "2":
				System.out.println("Follow the prompts to enter your new address below.");
				Address newAddress= new Address();
				System.out.print("Enter the new street: ");
				newAddress.setStreet(in.nextLine());
				System.out.print("Enter the new city: ");
				newAddress.setCity(in.nextLine());
				System.out.print("Enter the new state: ");
				newAddress.setState(in.nextLine());
				System.out.print("Enter the new zipcode: ");
				newAddress.setZipCode(in.nextLine());
				PhoneBook.updateListing(updateInfo).setAddress(newAddress);
				break;
			case "3":
				System.out.println("Enter the new telephone number:");
				String newTelephone = in.nextLine();
				PhoneBook.updateListing(updateInfo).setTelephone(newTelephone);
				break;
			}
			break;
			
		case "8":
			System.out.println("Thanks for using the phone book. Have a good day!"); 
			isEnd=true;
			break;
		}
		
		}while (isEnd!=true);
	}
	
	private static void sortListings(Person[] listings) {      //sort listings by full name only
		Person temp;
		for(int i=0; i<PhoneBook.listings.length; i++) {
			for(int j = i + 1; j<PhoneBook.listings.length; j++ ) {
				if(listings[i].getFullName().compareTo(listings[j].getFullName())>0){			
				temp = listings[i];
				listings[i] = listings[j];
				listings[j] = temp;
			}
		}
	}
	}
	}
	

