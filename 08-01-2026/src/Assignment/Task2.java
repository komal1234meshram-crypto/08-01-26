package Assignment;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//minimum balance check
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your balance : ");
		double Balance =sc.nextDouble(); 
		
		if(Balance>=1000) {
			System.out.println("Balance Ok ");//if greater than or equal to 1000 print balance ok
		}
		else {
			System.out.println("Low Balance"); //if not then low balance print
		}
		
		sc.close();
	}

}
