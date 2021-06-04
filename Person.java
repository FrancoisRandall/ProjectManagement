
public class Person {
	
// Attributes
// Assign datatypes to variables
	
	String name;
	String telNumber;
	String email;
	String address;
	
// Constructor
// Structure the order which the specific variables should be called
	
	public Person(String name, String telNumber, String email, String address) {
		this.name = name;
		this.telNumber = telNumber;
		this.email = email;
		this.address = address;
	}

// Methods
// Created to complete a specific function in main class
	
	public void setTelNumber(String newTelNumber) {
		this.telNumber = newTelNumber;
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
// Create method to add all the variables in a readable manner	
	
	public String toString() {
		String output = "\n\nName: " + name;
		output += "\nTelephone Number: " + telNumber;
		output += "\nEmail: "+ email;
		output += "\nAddress: " + address + "\n\n";
		
		return output;
	}
}
