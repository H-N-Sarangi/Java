import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 2 ; i <= num/2 ; i++ ){
			
			if( num%i == 0  ){
				System.out.println(num + " is composite.");
				System.exit(0);
			}else if(num == 1)
				System.out.println("Neither Prime nor Composite");
			System.out.println( num + " is prime.");
			
		}		
	}
}