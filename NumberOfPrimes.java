public class NumberOfPrimes{

	public static void main( String args[]){
		
		for(int j = 37 ; j < 130 ; j++){
			
			if(isPrime(j)){
				System.out.print( j + " ");
			
			}
		}
		
	}
	public static boolean isPrime( int a){
	
		for(int i = 2 ; a/2 >= i ; i ++){
			if( a% i == 0)
				return false;
			
			
		}
		return true;
	}
	
}