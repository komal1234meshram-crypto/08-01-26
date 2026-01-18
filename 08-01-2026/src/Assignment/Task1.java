package Assignment;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//voter eligibility
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Age : ");
		int Age = sc.nextInt();
		
		if(Age>=18) {
			System.out.println("You are Eligible for voting");//if eligible 
		}
		else {
			System.out.println("you are not eligible"); //not eligible
		}
		
		sc.close();

	}

}
