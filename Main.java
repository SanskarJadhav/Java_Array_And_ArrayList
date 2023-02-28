// Sanskar Jadhav AIML B1 PRN 21070126076

import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		// creating objects for classes in a uses-a-relationship
		EvenOrOdd eo = new EvenOrOdd();
		NearestNumbers nn = new NearestNumbers();
		ArrayAndArrayList aal = new ArrayAndArrayList();
                	int run;
	    	// do while loop: run again until a condition is no longer satisfied
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("\nMENU\n====");
			System.out.println("1. Separating Even and Odd Numbers");
			System.out.println("2. Finding Index of Nearest Numbers");
			System.out.println("3. Converting Array to ArrayList and vice-versa");
			int choice = sc.nextInt();
			// creating a switch case for each input
			switch(choice){
				case 1:
					eo.splitEvenAndOddArrays();
					break;
				case 2:
					int result = nn.findNearestNumbers();
        					System.out.printf("Index for nearest numbers is: %d\n", result);
					break;
				case 3:
					aal.arraytoArrayList();
					aal.arrayListtoArray();
					break;
				default:
					System.out.println("wrong input");
			}
			System.out.println("\nRun again? Yes - 1, No - 0");
			run = sc.nextInt();
		} while (run==1);
	}
}