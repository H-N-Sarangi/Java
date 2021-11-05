import java.util.Scanner;
public class SquareNumber{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many lines of square numbers to print : ");
		int n = sc.nextInt()
		int j = 0;
		int diff = 1;
		for( int i = 0 ; i <n ; i++){
			
			System.out.print( j + " ");
			j += diff;
			diff+=2;
			if(j%100==0)
				System.out.println("");
		}
		
	}

}