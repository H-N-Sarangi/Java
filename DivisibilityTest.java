import java.util.Scanner;

public class DivisibilityTest {

	public static void main( String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for integer M : ");
		int M = sc.nextInt();
		System.out.print("Enter value for integer N (>M) : ");
		int N = sc.nextInt();
		if(N<M){
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int sum = 0;
		for( int i = M ; i <= N ; i++){
			if( i%15==0){
				System.out.println(i);
				sum += i;
			}
			
		}
		System.out.println("Sum of all integers b/w " + M + "and " + N + " that are divisible by both 3 and 5 : " +sum);	
	}
}