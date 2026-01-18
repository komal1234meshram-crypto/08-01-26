package Assignment;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

        //  positive negative or zero
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		else if( num<0 ) {
			System.out.println("Negative");
			
		}
		else if( num == 0) {
			System.out.println("Zero");
			
		}
		
		sc.close();
	}

	

}
