import java.util.Scanner;

public class UserInput {
	// git test as well
	static private String temp1, temp2, temp3;

	// main function
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name:");
		temp1 = input.nextLine();	
		System.out.println("Please enter your surname:");
		temp2 = input.nextLine();
		System.out.println("Please enter your age:");
		temp3 = input.nextLine();

		printData();

	}
	// adding another comment
	// prints the user input
	public static void printData() {

		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
	}

}
