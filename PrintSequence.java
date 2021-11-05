
import java.util.Scanner;

public class PrintSequence {

	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
		int num = sc.nextInt();
		for(int i = 1 ; i<=num ; i++){
            System.out.print( intRoot(i) + " "  );
        }
		
	}

	public static int absDiff (int A , int B){ //correct
	
		if( A-B < 0)
			return B-A;
		else
			return A-B;
	
	}
	
	public static int intRoot ( int C){
        int rootOfNearestSquare = 0;
        int diff = C*C;
        for(int i = 1 ; i <= C ; i++){
            if(absDiff(i*i, C)<= diff){
                diff = absDiff(i*i, C);
                rootOfNearestSquare  = i;
            }else
				break;

        }
        return rootOfNearestSquare;
	}
	 
	


}
