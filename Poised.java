import java.util.Scanner;

public class Poised {

	public static void main(String[] args) {
				
// Declare person variable values
// Request user input
		
		System.out.print("Person Details (Contractor/Architect/Customer): \n\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Name here: \n");	
        input = new Scanner(System.in); 
		String personName = input.nextLine();
		
		System.out.print("Enter Telephone Number here: \n");	
        input = new Scanner(System.in); 
		String personTelNumber = input.nextLine();

		System.out.print("Enter email here: \n");	
        input = new Scanner(System.in); 
		String personEmail = input.nextLine();
		
		System.out.print("Enter address here: \n");	
        input = new Scanner(System.in); 
		String personAddress = input.nextLine();

// Create 'Person' objects
// User input will be stored in variables and will be stored in the below variable as follows
		
		Person contractor = new Person(personName, personTelNumber, personEmail, personAddress);
		
// Declare project variable values
// Request user input
		
		System.out.print("\nProject Details: \n\n");
		
		Scanner selection = new Scanner(System.in);

		System.out.print("Enter Project Number here: \n");	
		selection = new Scanner(System.in); 
		int projectNumber = selection.nextInt();
		
		System.out.print("Enter Project Name here: \n");	
		selection = new Scanner(System.in); 
		String projectName = selection.nextLine();
		
		System.out.print("Enter Building Type here: \n");	
		selection = new Scanner(System.in); 
		String projectBuildingType = selection.nextLine();
		
		System.out.print("Enter Project Address here: \n");	
		selection = new Scanner(System.in); 
		String projectAddress = selection.nextLine();
		
		System.out.print("Enter ERF Number here: \n");	
		selection = new Scanner(System.in); 
		int projectErfNumber = selection.nextInt();
		
		System.out.print("Enter Total Project fee here: \n");	
		selection = new Scanner(System.in); 
		float projectTotalFee = selection.nextFloat();
		
		System.out.print("Enter Paid to Date amount here: \n");	
		selection = new Scanner(System.in); 
		float projectPaidToDate = selection.nextFloat();
		
		System.out.print("Enter Deadline here: \n");	
		selection = new Scanner(System.in); 
		String projectDeadline = selection.nextLine();

		
// Create Project objects		
// User input will be stored in variables and will be stored in the below variable as follows
		
		Project house = new Project(projectNumber, projectName, projectBuildingType, projectAddress, projectErfNumber, projectTotalFee, 
						projectPaidToDate, projectDeadline, contractor);
		
// Print to user
		
		System.out.print("\nProject Details:\n\n" + house);
		
//Update Details
// Request user input
		
		Scanner updateInput = new Scanner(System.in);
		
		System.out.print("Update details (select number):\n\n"
				+ "1. Due Date\n"
				+ "2. Total Paid to Date\n"
				+ "3. Contractor's Details\n\n"
				+ "Selection: ");
		int userUpdate = updateInput.nextInt();
		
// Change due date of project		
		
		if(userUpdate == 1) {
			updateInput = new Scanner(System.in); 
			System.out.print("\nEnter new Deadline here: \n");	
			String updatedDeadline = updateInput.nextLine();
			house.setDeadline(updatedDeadline);
			System.out.print("\n\nProject Details\n\n" + house);
		}
		
// Change Paid to date		
		
		else if(userUpdate == 2) {
			System.out.print("\nEnter new Paid to Date here: \n");	
			float updatedPaidToDate = updateInput.nextFloat();
			house.setPaidToDate(updatedPaidToDate);
			System.out.print("\nProject Details\n\n" + house);
		}
		
// Change contractor's contact details		
		
		else if(userUpdate == 3) {
			updateInput = new Scanner(System.in); 
			System.out.print("\nEnter new Telephone number here: \n");	
			String updatedTelNumber = updateInput.nextLine();
			contractor.setTelNumber(updatedTelNumber);
			
			updateInput = new Scanner(System.in); 
			
			System.out.print("\nEnter new Email here: \n");	
			String updatedEmail = updateInput.nextLine();
			contractor.setEmail(updatedEmail);
			
			System.out.print("\nProject Details\n\n" + house);
			}
		else {
			System.out.print("\nYou did not choose an appropriate option.");
		}
		
		
	}

}
