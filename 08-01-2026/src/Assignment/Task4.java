package Assignment;
import java.util.Scanner;


public class Task4 {

	public static void main(String[] args) {
		// Electricity Bill Category
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Units Consumed : ");
		int units = sc.nextInt();
		
		if(units<=100){
			System.out.println("Low Usage");
		}
		else if(units<=100 && units >=300) { 
			
			System.out.println("Medium Usage");
		}
		else if(units>300) {
			System.out.println("High Usage");
			
		}
		
		sc.close();
	}

}
