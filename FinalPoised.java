import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FinalPoised {

	public static void main(String[] args) {

		// Declare person variable values
		// Request user input
		// Try-cath enabled to account for possibly not having a new line after the .nextLine() command and if the wrong datatype
		// is entered when requesting user input (String, int, float)
		
		try {
			
			// Display start menu to provide user actions
			// Request user input
			
			System.out.print("Welcome to your Project Manager\n\n");
			
			System.out.print("Choose an action below:\n\n"
					+ "1. Add new Project\n"
					+ "2. View unfinalised Projects\n"
					+ "3. View Projects past due date\n"
					+ "4. Edit or Finalise Project\n\n"
					+ "Selection: ");	
			Scanner menuScanner = new Scanner(System.in);
			int menuSelection = menuScanner.nextInt();
			
			// Add new Project
			
			if(menuSelection == 1) {
				
				// Request user input for Customer details
				
				System.out.print("\nCustomer Details: \n\n");
				
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter Name here: \n");	
		        input = new Scanner(System.in); 
				String customerName = input.nextLine();
				
				System.out.print("Enter Surname here: \n");	
		        input = new Scanner(System.in); 
				String customerSurname = input.nextLine();
								
				System.out.print("Enter Telephone Number here: \n");	
		        input = new Scanner(System.in); 
				String customerTelNumber = input.nextLine();

				System.out.print("Enter email here: \n");	
		        input = new Scanner(System.in); 
				String customerEmail = input.nextLine();
				
				System.out.print("Enter address here: \n");	
		        input = new Scanner(System.in); 
				String customerAddress = input.nextLine();

				// Create 'Customer' objects
				// User input will be stored in variables and will be stored in the below variable as follows
				
				FinalCustomer customer = new FinalCustomer(customerName, customerSurname, customerTelNumber, customerEmail, customerAddress);
				
				// Request user input for Contractor details
				
				System.out.print("\nContractor Details: \n\n");
				
				Scanner contractorInput = new Scanner(System.in);
				
				System.out.print("Enter Name here: \n");	
		        contractorInput = new Scanner(System.in); 
				String contractorName = contractorInput.nextLine();
				
				System.out.print("Enter Surname here: \n");	
		        contractorInput = new Scanner(System.in); 
				String contractorSurname = contractorInput.nextLine();
								
				System.out.print("Enter Telephone Number here: \n");	
		        contractorInput = new Scanner(System.in); 
				String contractorTelNumber = contractorInput.nextLine();

				System.out.print("Enter email here: \n");	
		        contractorInput = new Scanner(System.in); 
				String contractorEmail = contractorInput.nextLine();
				
				System.out.print("Enter address here: \n");	
		        contractorInput = new Scanner(System.in); 
				String contractorAddress = contractorInput.nextLine();

				// Create 'Contractor' objects
				
				FinalContractor contractor = new FinalContractor(contractorName, contractorSurname, contractorTelNumber, contractorEmail, contractorAddress);

				// Request user input for Architect details
				
				System.out.print("\nArchitect Details: \n\n");
				
				Scanner architectInput = new Scanner(System.in);
				
				System.out.print("Enter Name here: \n");	
		        architectInput = new Scanner(System.in); 
				String architectName = architectInput.nextLine();
				
				System.out.print("Enter Surname here: \n");	
		        architectInput = new Scanner(System.in); 
				String architectSurname = architectInput.nextLine();
								
				System.out.print("Enter Telephone Number here: \n");	
		        architectInput = new Scanner(System.in); 
				String architectTelNumber = architectInput.nextLine();

				System.out.print("Enter email here: \n");	
		        architectInput = new Scanner(System.in); 
				String architectEmail = architectInput.nextLine();
				
				System.out.print("Enter address here: \n");	
		        architectInput = new Scanner(System.in); 
				String architectAddress = architectInput.nextLine();

				// Create 'Customer' objects
				
				FinalArchitect architect = new FinalArchitect(architectName, architectSurname, architectTelNumber, architectEmail, architectAddress);
				
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
				double projectTotalFee = selection.nextDouble();
				
				System.out.print("Enter Paid to Date amount here: \n");	
				selection = new Scanner(System.in); 
				double projectPaidToDate = selection.nextDouble();
				
				//https://www.geeksforgeeks.org/java-simpledateformat-set-1/
				
				System.out.print("Enter Deadline here(eg.01/12/2021): \n");	
				selection = new Scanner(System.in); 
				String projectDeadline = selection.nextLine();
				SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
				Date newDate = formatDate.parse(projectDeadline);
												
				String finalised = "No";
				
				// If project name  is not given, then it should be named after the building type and surname of the customer
				
				if(projectName == "") {
					projectName = projectBuildingType + " " + customerSurname;
				}
	
				// Create Project objects		
				// User input will be stored in variables and will be stored in the below variable as follows
				
				FinalProject house = new FinalProject(projectNumber, projectName, projectBuildingType, projectAddress, projectErfNumber, 
														projectTotalFee, projectPaidToDate, projectDeadline, finalised);
		
				// The objects are used to print to the user
				
				System.out.print("\nThe following details have successfully been recorded:\n\nProject Details:\n\n" + house);
				System.out.print("\n\nCustomer:\n\n" + customer);
				System.out.print("Contractor:\n\n" + contractor);
				System.out.print("Architect:\n\n" + architect);
				
				// Write project details to project file
				// Only raw data is printed to the text files in order to call more efficiently
				
				try {
					
					SimpleDateFormat formatDate1 = new SimpleDateFormat("dd/MM/yyyy");
					Date currentDate = new Date();
					String curDate = formatDate.format(currentDate);
					
					double invoice = projectTotalFee - projectPaidToDate; 
					FileWriter projectWrite = new FileWriter("src\\Completed Project.txt", true);
					BufferedWriter newWrite = new BufferedWriter(projectWrite);
					newWrite.write(projectNumber + ", " + projectName + ", " + projectBuildingType + ", " + 
									projectAddress + ", " + projectErfNumber + ", " + projectTotalFee + ", " + 
									projectPaidToDate + ", " + projectDeadline + ", " + finalised + ", " + 
									customerName + " " + customerSurname + ", " + contractorName + " " + contractorSurname + ", " + 
									architectName + " " + architectSurname + ", " + curDate + ", " + invoice + "\n");		
					newWrite.close();
					
					// Write data to the customers file
					// The Project Name and Number is included for when the user needs to select a project 
					
					FileWriter customerWrite = new FileWriter("src\\Customers.txt", true);
					BufferedWriter secondWrite = new BufferedWriter(customerWrite);
					secondWrite.write(projectNumber + ", " + projectName + ", " + customerName + ", " + customerSurname + ", " + 
										customerTelNumber + ", " + customerEmail + ", " + customerAddress + "\n");
					secondWrite.close();
					
					// Write data to the contractors file
					
					FileWriter contractorWrite = new FileWriter("src\\Contractors.txt", true);
					BufferedWriter thirdWrite = new BufferedWriter(contractorWrite);
					thirdWrite.write(projectNumber + ", " + projectName + ", " + contractorName + ", " + contractorSurname + ", " + 
										contractorTelNumber + ", " + contractorEmail + ", " + contractorAddress + "\n");
					thirdWrite.close();
					
					// Write data to the architects file
					
					FileWriter architectWrite = new FileWriter("src\\Architects.txt", true);
					BufferedWriter fourthWrite = new BufferedWriter(architectWrite);
					fourthWrite.write(projectNumber + ", " + projectName + ", " + architectName + ", " + architectSurname + ", " + 
										architectTelNumber + ", " + architectEmail + ", " + architectAddress + "\n");
					fourthWrite.close();
					}
				catch(Exception e) {
					System.out.print("The new file could not be created");
					}
			}
			
			// View non-finalized projects
			
			else if(menuSelection == 2) {
				try {
					
					FileReader projectFile = new FileReader("src\\Completed Project.txt");
					BufferedReader projectReader = new BufferedReader(projectFile);
					int lines  = 0;
					
					while (projectReader.readLine() != null) {
						lines++;
						}
					projectReader.close();
					
					// Loop though the file to the amount of times that there are lines in the file
					// Split the data in order for indexing purposes
					
					FileReader projectFile2 = new FileReader("src\\Completed Project.txt");
					BufferedReader projectReader2 = new BufferedReader(projectFile2);
					for(int t = 0; t < lines; t++) {	
						
						String[] projectLine = projectReader2.readLine().strip().split(", ");
						
						int numProject = Integer.parseInt(projectLine[0]);
						String nameProject = projectLine[1];
						String typeBuilding = projectLine[2];
						String addressProject = projectLine[3];
						int numErf = Integer.parseInt(projectLine[4]);
						double amountTotal = Double.parseDouble(projectLine[5]);
						double amountPaidToDate = Double.parseDouble(projectLine[6]);
						String dateDue = projectLine[7];
						String finalized1 = projectLine[8];
						
						// Create object in order to print to user
					
						FinalProject unfinalizedProject = new FinalProject(numProject, nameProject,typeBuilding, addressProject, 
																	numErf, amountTotal,amountPaidToDate, dateDue, finalized1);
										
						// The 8'th index is the finalized field
						
						if(projectLine[8].startsWith("No")) {
							System.out.print("\n" + unfinalizedProject + "\n");
							}
					}
					projectReader2.close();
			}
				catch (FileNotFoundException fnf) {
					System.out.print("File not found!");
					} 
				catch (IOException e) {
					System.out.print("Could not read line!");
					}
			}
			
			// View all overdue projects
			
			else if(menuSelection == 3) {
				try {
					
					FileReader projectFile = new FileReader("src\\Completed Project.txt");
					BufferedReader projectReader = new BufferedReader(projectFile);
					int lines  = 0;
					
					while (projectReader.readLine() != null) {
						lines++;
						}
					projectReader.close();
					
					// Loop though the file to the amount of times that there are lines in the file
					// Split the data in order for indexing purposes
					
					FileReader projectFile2 = new FileReader("src\\Completed Project.txt");
					BufferedReader projectReader2 = new BufferedReader(projectFile2);
					for(int t = 0; t < lines; t++) {		
						String[] projectLine = projectReader2.readLine().strip().split(", ");
						
						int numProject = Integer.parseInt(projectLine[0]);
						String nameProject = projectLine[1];
						String typeBuilding = projectLine[2];
						String addressProject = projectLine[3];
						int numErf = Integer.parseInt(projectLine[4]);
						double amountTotal = Double.parseDouble(projectLine[5]);
						double amountPaidToDate = Double.parseDouble(projectLine[6]);
						String dateDue = projectLine[7];
						String finalized1 = projectLine[8];
						String dateStarted = projectLine[12];
						
						// Create object to print to the user
						
						FinalProject overdueProject = new FinalProject(numProject, nameProject,typeBuilding, addressProject, numErf, amountTotal,
								amountPaidToDate, dateDue, finalized1);
						
						// Create a variable to capture the current date
						// Format to specified date format
						
						SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
						Date currentDate = new Date();
						String curDate = formatDate.format(currentDate);

						// Format both due date and current date to preferred format
						
						Date dueDate = formatDate.parse(dateDue);
						Date currDate = formatDate.parse(curDate);
						
						// https://www.geeksforgeeks.org/compare-dates-in-java/
						// Compare the 2 dates and print the overdue projects to the user accordingly
						
						if(dueDate.compareTo(currDate) < 0) {
							System.out.print("\n" + overdueProject + "\n");
						}
					}
					projectReader2.close();
				}
				catch(FileNotFoundException fnf) {
					System.out.print("File not found!");
					} 
				catch (IOException e) {
					System.out.print("Could not read file!");
					}
				}
			
			// Edit or Finalize project
			
			else if(menuSelection == 4) {
				try {
					
					// Request user input
					
					System.out.print("\nEnter your Project Number or your Project Name.\n\n"
							+ "If entering your Project Name, please be "
							+ "sure to spell it exactly the way you entered it initially.\n\nProject Number/Name: ");	
					Scanner scnr = new Scanner(System.in);
					String editSelection = scnr.nextLine(); 
					
					FileReader projectFile = new FileReader("src\\Completed Project.txt");
					BufferedReader projectReader = new BufferedReader(projectFile);
					int lines  = 0;
					
					while (projectReader.readLine() != null) {
						lines++;
						}
					projectReader.close();
					
					// Loop though the file to the amount of times that there are lines in the file
					// Split the data in order for indexing purposes
					
					FileReader projectFile2 = new FileReader("src\\Completed Project.txt");
					BufferedReader projectReader2 = new BufferedReader(projectFile2);
					for(int t = 0; t < lines; t++) {
					
						String[] projectLine = projectReader2.readLine().strip().split(", ");
						
						int numProject = Integer.parseInt(projectLine[0]);
						String nameProject = projectLine[1];
						String typeBuilding = projectLine[2];
						String addressProject = projectLine[3];
						int numErf = Integer.parseInt(projectLine[4]);
						double amountTotal = Double.parseDouble(projectLine[5]);
						double amountPaidToDate = Double.parseDouble(projectLine[6]);
						String dateDue = projectLine[7];
						String finalized1 = projectLine[8];
						String customer = projectLine[9];
						String contractor = projectLine[10];
						String architect = projectLine[11];
						String creationDate = projectLine[12];
						Double invoice = Double.parseDouble(projectLine[13]);
					
					// Create object to print to the user
					
					FinalProject editProject = new FinalProject(numProject, nameProject,typeBuilding, addressProject, numErf, amountTotal,
							amountPaidToDate, dateDue, finalized1);
					
					// Create old data variable in order to compare to edited data later for replacement
					
					String oldData = numProject + ", " + nameProject + ", " + typeBuilding + ", " + addressProject + ", " + 
							numErf + ", " + amountTotal + ", " + amountPaidToDate + ", " + dateDue + ", " + finalized1 + ", " + customer
							 + ", " + contractor + ", " + architect + ", " + creationDate + ", " + invoice;
					
					// If the user input equals data in the Project Name or Number fields, then print said project and 
					// request next user input
					
					if(editSelection.equals(projectLine[0]) || editSelection.equals(projectLine[1])) {
						System.out.print("\n" + editProject);
						System.out.print("\n\nDo you wish to edit or finalize this project?"
								+ "\n1. Edit"
								+ "\n2. Finalize"
								+ "\n\nSelection: ");	
						Scanner scnr1 = new Scanner(System.in);
						int editChoice = scnr1.nextInt();
						
						// Edit option selected
						// Request user input
						
						if(editChoice == 1) {
							System.out.print("\nWhat would you like to edit?(select number)"
									+ "\n1. Project Number"
									+ "\n2. Project Name"
									+ "\n3. Building Type"
									+ "\n4. Project Address"
									+ "\n5. ERF number"
									+ "\n6. Total Amount"
									+ "\n7. Paid to Date Amount"
									+ "\n8. Due Date"
									+ "\n\nSelection: ");	
							Scanner scnr2 = new Scanner(System.in);
							int edit = scnr2.nextInt();
							
							// Request user input to update the option selected above
							// Updates variable value to the user's input
							
							if(edit == 1) {
								System.out.print("\nEnter new Project Number: ");	
								Scanner scnr3 = new Scanner(System.in);
								int newProjectNumber = scnr3.nextInt();
								numProject = newProjectNumber;
							}
							else if(edit == 2) {
								System.out.print("\nEnter new Project Name: ");	
								Scanner scnr4 = new Scanner(System.in);
								String newProjectName = scnr4.nextLine();
								nameProject = newProjectName;
							}
							else if(edit == 3) {
								System.out.print("\nEnter new Building Type: ");	
								Scanner scnr5 = new Scanner(System.in);
								String newBuiildingType = scnr5.nextLine();
								typeBuilding = newBuiildingType;
							}
							else if(edit == 4) {
								System.out.print("\nEnter new Project Address: ");	
								Scanner scnr6 = new Scanner(System.in);
								String newProjectAddress = scnr6.nextLine();
								addressProject = newProjectAddress;
							}
							else if(edit == 5) {
								System.out.print("\nEnter new ERF Number: ");	
								Scanner scnr7 = new Scanner(System.in);
								int newErfNumber = scnr7.nextInt();
								numErf = newErfNumber;
							}
							else if(edit == 6) {
								System.out.print("\nEnter new Total Amount: ");	
								Scanner scnr8 = new Scanner(System.in);
								double newTotalAmount = scnr8.nextDouble();
								amountTotal = newTotalAmount;
							}
							else if(edit == 7) {
								System.out.print("\nEnter new Paid to Date: ");	
								Scanner scnr9 = new Scanner(System.in);
								double newPaidToDate = scnr9.nextDouble();
								amountPaidToDate = newPaidToDate;
							}
							else if(edit == 8) {
								System.out.print("\nEnter new Due Date: ");	
								Scanner scnr10 = new Scanner(System.in);
								String newDueDate = scnr10.nextLine();
								dateDue = newDueDate;
							}
							else {
								System.out.print("You did not enter a valid option!");
							}
					}
						
						// Finalize option
						
						else if(editChoice == 2) {
							finalized1 = "Yes";
							invoice = amountTotal - amountPaidToDate;
							
							FileReader customerFile = new FileReader("src\\Customers.txt");
							BufferedReader customerReader = new BufferedReader(customerFile);
							int lines2 = 0;
							
							while (customerReader.readLine() != null) {
								lines2++;
								}
							customerReader.close();
							
							// Loop though the file to the amount of times that there are lines in the file
							// Split the data in order for indexing purposes
							
							FileReader customerFile2 = new FileReader("src\\Customers.txt");
							BufferedReader customerReader2 = new BufferedReader(customerFile2);
							for(int v = 0; v < lines2; v++) {
								
								String[] customerLine = customerReader2.readLine().split(", ");
								
								if(customerLine[0].equals(editSelection)) {
								
									String projectNumber1 = customerLine[0];
									String projectName1 = customerLine[1];
									String name = customerLine[2];
									String surname = customerLine[3];
									String telNumber = customerLine[4];
									String email = customerLine[5];
									String address = customerLine[6];
								
								// Create object to print to user
								
									FinalPerson newCustomer = new FinalCustomer(name, surname, telNumber, email, address);
								
								// Set finalized date
								
								SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
								Date currentDate = new Date();
								String curDate = formatDate.format(currentDate);
								
								// If the difference in the total amount and amount due is 0
								
								if(invoice == 0) {
									System.out.print("\nProject successfully finalised!"
											+ "\n\nCustomer:\n" + newCustomer + "Completiond date: " + 
											curDate + "\n\nAmount paid in full."
											+ "Please let us know if your require anything in the future!");
									}
								
								// Generate invoice for customer and print to user
								// Calculate the difference in total amount and amount due
								
								else {
									System.out.print("\nProject successfully finalised!\n\nCustomer:\n" + newCustomer + 
											"Completion date: " + curDate + "\n\nProject Total Fee: R" 
													+ amountTotal + "\nProject Paid to Date: R" + amountPaidToDate 
													+ "\n\nTotal Invoice: R" + invoice);
													}								
								}
							}
							customerReader2.close();
						}
					}
					
					// Edit and replace project details
					// https://www.tutorialspoint.com/how-to-overwrite-a-line-in-a-txt-file-using-java
					// The below string will create a new string with any updated data from the above requests
					
					String updatedData = numProject + ", " + nameProject + ", " + typeBuilding + ", " + addressProject + ", " + 
					numErf + ", " + amountTotal + ", " + amountPaidToDate + ", " + dateDue + ", " + finalized1 + ", " + customer
					 + ", " + contractor + ", " + architect + ", " + creationDate + ", " + invoice;
					
					// Replace the old data with the new data
					// Write to the file
					
					try {
						String filePath = "src\\Completed Project.txt";
					    Scanner sc = new Scanner(new File(filePath));
					    StringBuffer buffer = new StringBuffer();
					    while (sc.hasNextLine()) {
					         buffer.append(sc.nextLine()+System.lineSeparator());
					      }
					    String fileContents = buffer.toString();
					      sc.close();
					      String oldLine = oldData;
					      String newLine = updatedData;
					      fileContents = fileContents.replaceAll(oldLine, newLine);
					      FileWriter writer = new FileWriter(filePath);
					      writer.append(fileContents);
					      writer.flush();
				      }
					catch(Exception e) {
						System.out.print("Could not write to file");   
						}	
				}
				projectReader2.close();	
			}
				
			catch(FileNotFoundException fnf) {
				System.out.print("File not found!");
				} 
			catch (IOException e) {
				System.out.print("Could not read line!");
				}
			}
			else {
				System.out.print("\nYou did not enter a valid option!");
			}
		}
		
		// Print relevant messages to user if incorrect data was entered
		// 2 Try-Catches entered as per instructions
		
		catch(InputMismatchException i) {
			System.out.println("The input provided was not an integer");
		}
		catch(NoSuchElementException n) {
			System.out.println("No new line found");
		} 
		catch (ParseException pe) {
			System.out.print("You did not enter the date in the correct format");
		} 	
	}
}
