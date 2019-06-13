import java.util.Scanner;

public class Ch02_prj3_RectangleCalculator {

	public static void main(String[] args) {
		// Welcome
			System.out.println("Welcome");
				
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
				
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {		
					
			// Prompt				
				System.out.print("Enter Length: ");
				double length = sc.nextDouble();
				System.out.print("Enter Width: ");
				double width = sc.nextDouble();
				
			
			//Bus Logic
				double area = width * length;
				double perimeter = 2 * width + 2 * length;
			
			//Display Results
				System.out.println("area = " + area);
				System.out.println("perimeter = "+ perimeter);
				
				System.out.println("Continue? y/n?");
				choice = sc.next();
			}
				
		// Bye
			System.out.println("Bye");	
	}
			
	
	
	
	}
