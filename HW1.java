import java.util.Scanner;

public class HW1 {
	
	public static final int YEAR = 2024;
	
		public static void main(String[] args) {
			
			Scanner key= new Scanner(System.in);
			
				// Collecting user input 

				 System.out.println("Enter your First Name: "); 

				 String firstName = key.nextLine(); 

				 System.out.println("Enter your Last Name: "); 

				 String lastName = key.nextLine(); 

				 System.out.println("Enter your Age (in years): "); 

				 int age = key.nextInt(); 

				 key.nextLine(); 
				 
				 // Consume newline 

				 System.out.println("Enter your Phone (without any dashes/parenthesis): "); 

				 String phone = key.nextLine(); 

				 System.out.println("Enter your Major: "); 

				 String major = key.nextLine(); 

				 System.out.println("Enter your Year (Freshman, Sophomore, Junior, Senior): "); 

				 String year = key.nextLine(); 

				 System.out.println("Enter Today’s Date (mm/dd/yyyy): "); 

				 String todayDateStr = key.nextLine(); 

				 // Additional questions 

				 System.out.println("What is your favorite hobby? "); 

				 String hobby = key.nextLine(); 

				 System.out.println("What is your dream destination? "); 

				 String dreamDestination = key.nextLine(); 

				 System.out.println("Do you have a pet? (yes/no): "); 

				 String hasPet = key.nextLine(); 

				 // Calculate birth year 

				 int birthYear = YEAR - age; 

		 

				 	// Convert date format
				 	// Format the date to European format 

	
				 
				 // Format phone number 

				 String formattedPhone = String.format("(xxx)xxx-xxxx", phone.substring(0, 3), phone.substring(3, 6), phone.substring(6)); 
				 
				 // Display the intro 

				 System.out.println("\nHere’s a bit about me:"); 

				 System.out.println("Hello! My name is " + firstName + " " + lastName + ". I am " + age + " years old."); 

				 System.out.println("I am majoring in " + major + " and currently a " + year + ". I was born in " + birthYear + "."); 

				 	
				 
				 	//System.out.println("Today’s date is " + formattedDate + "."); 
				 
				 

				 System.out.println("You can reach me at " + formattedPhone + "."); 

				 System.out.println("In my free time, I enjoy " + hobby + "."); 

				 System.out.println("My dream destination is " + dreamDestination + "."); 

				 System.out.println("Do I have a pet? " + (hasPet.equalsIgnoreCase("yes") ? "Yes" : "No") + "."); 

		 

	}

}
