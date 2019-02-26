import java.util.*;

public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("What algorithm would you like to execute?");
		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		
		switch (option) {
			case "bubble": 
				System.out.println("What type of data?");
				String b_data = scan.nextLine();
				
				switch (b_data) {
				case "integers":
					System.out.println("How is it stored?");
					String b_store = scan.nextLine();
					
					switch (b_store) {
					case "array":
						System.out.println("");
						break;
					case "list":
						System.out.println("");
						break;
					default:
						System.out.println("ERROR: Choose between array or list! Closing program...");
					}
					break;
					
				case "strings":
					System.out.println("How is it stored?");
					break;
				default:
					System.out.println("ERROR: Choose between integers or strings! Closing program...");
				}
				break;
				
			case "selection":
				System.out.println("What type of data?");
				String s_data = scan.nextLine();
				
				switch (s_data) {
				case "integers":
					System.out.println("a");
					break;
					
				case "strings":
					System.out.println("b");
					break;
				default:
					System.out.println("ERROR: Choose between integers or strings! Closing program...");
				}
				break;
				
			case "insertion":
				System.out.println("What type of data?");
			
				break;
				
			case "merge":
				System.out.println("What type of data?");
			
				break;
				
			case "linear":
				System.out.println("What type of data?");
		
				break;
				
			case "binary":
				System.out.println("What type of data?");
				
				break;
				
			case "quit":
				System.out.println("Closing program...");
				scan.close();
				break;
				
			default:
				System.out.println("ERROR: Make sure that you're writing the algorithm type in lowercase! Closing program...");
				break;
		}
		
	}
}