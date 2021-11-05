import java.util.Scanner;
public class GreenBottles{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print( "Enter an integer between 0 and 9 : ");
		int numberOfBottles = sc.nextInt();
		Print( numberOfBottles );
		
	}
	public static void Print( int numberOfBottles ){
	
		if( numberOfBottles > 9 || numberOfBottles <1){
			System.exit(0);
		}
		switch (numberOfBottles){
			case 0:
				System.out.println( "Zero green bottles standing on the wall.");
				break;
			case 1:
				System.out.println( "One green bottle standing on the wall."); 
				break;
			case 2:
				System.out.println( "Two green bottles standing on the wall."); 
				break;
			case 3:
				System.out.println( "Three green bottles standing on the wall."); 
				break;
			case 4:
				System.out.println( "Four green bottles standing on the wall."); 
				break;
			case 5:
				System.out.println( "Five green bottles standing on the wall.");
				break;	
			case 6:
				System.out.println( "Six green bottles standing on the wall."); 
				break;
			case 7:
				System.out.println( "Seven green bottles standing on the wall."); 
				break;
			case 8:
				System.out.println( "Eight green bottles standing on the wall."); 
				break;
			case 9:
				System.out.println( "Nine green bottles standing on the wall."); 
				break;
						
		}
	}
}