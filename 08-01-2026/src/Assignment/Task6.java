package Assignment;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// loan approval 
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Enter Your Age : ");
		int Age = scanner.nextInt();
		
		System.out.print("Enter Your Salary : ");
		double Salary = scanner.nextDouble();
		
		System.out.print("Enter Your Credit Score : ");
		int CreditScore = scanner.nextInt();
		
		if(Age>=21 && Salary>=25000 && CreditScore>=700) {
			System.out.println("Loan Approved");
		}
		else {
			System.out.println("Loan Rejected");
		}
		

		scanner.close();
	}

}
