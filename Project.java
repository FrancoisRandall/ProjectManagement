
public class Project {
	
// Attributes
// Assign datatypes to variables
	
	int projectNumber;
	String projectName;
	String buildingType;
	String address;
	int erfNumber;
	float totalFee;
	float paidToDate;
	String deadline;
	Person jobTitle;
	
// Constructor
// Structure the order which the specific variables should be called
	
	public Project(int projectNumber, String projectName, String buildingType, String address, int erfNumber, float totalFee, 
					float paidToDate, String deadline, Person jobTitle) {
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.address = address;
		this.erfNumber = erfNumber;
		this.totalFee = totalFee;
		this.paidToDate = paidToDate;
		this.deadline = deadline;
		this.jobTitle = jobTitle;
	}
	
// Methods
// Created to complete a specific function in main class

	public void setDeadline(String newDeadLine) {
		this.deadline = newDeadLine;
	}
	
	public void setPaidToDate(float newPaidToDate) {
		this.paidToDate = newPaidToDate;
	}
	
// Create function to add all the variables in a readable manner		
	
	public String toString() {
		String output = "Project Number: "+ projectNumber;
		output += "\nProject Name: " + projectName;
		output += "\nBuilding Type: " + buildingType;
		output += "\nAddress: " + address; 
		output += "\nERF Number: " + erfNumber; 
		output += "\nTotal Fee: " + "R " + totalFee; 
		output += "\nPaid To Date: " + "R " + paidToDate; 
		output += "\nDeadline: " + deadline; 
		output += "\n\nPerson on site (contractor): " + jobTitle; 
		
		return output;
	}

}
