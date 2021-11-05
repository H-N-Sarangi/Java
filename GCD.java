import java.util.Scanner;

public class GCD {

	public static void main( String args[]){
	
		Scanner sc = new Scanner( System.in);
		System.out.print("Enter two positive integers : "); 
		int number = sc.nextInt();
		int number2 = sc.nextInt();
		int j = number<number2?number:number2;
		int gcd = 1;
		for(int i = 2 ; i < j ; i++){
			
			if( number%i == 0 && number2%i == 0){
				gcd = i;
			}
			
		}
		System.out.println( "Greatest Common Divisor of " + number + " and " + number2 + " is : " + gcd);
	}


}
