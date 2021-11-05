import java.util.Scanner;

public class Factors{
	
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer : ");
		int num = sc.nextInt();
		System.out.print("Factors of " + num + " are :");
		while (num != 1){
			int fact = smallestFactor( num);
			System.out.print( fact + "*");
			num /= fact;
		}
		System.out.print("1");

	}
	public static boolean isPrime( int a){
	
		for(int i = 2 ; a/2 >= i ; i ++){
			if( a% i == 0)
				return false;
			
			
		}
		return true;
	}


	public static int smallestFactor(int A){
	
		if ( A < 0 ){
			return 0;	
		}else if ( isPrime(A) || A == 1 ){
			return A;	
		}
		for(int i = 2; i <= A ; i++){
			
			if( A%i == 0 ){
				return i;
					
			}
		}
		return 1;	
	}


}