package Assignment;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// employee bonus eligibility
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Your Salary : ");
		int Salary = sc.nextInt();
		
		System.out.print("Enter Your Experiance : ");
		int Experiance = sc.nextInt();
		
		if(Salary>=30000 && Experiance>=3) {
			System.out.println("Bonus Eligible ");
		}
		else {
			System.out.println("Not Eligible For Bonus");
		}
		
		sc.close();

	}

}
