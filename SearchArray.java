import java.util.Scanner;
public class SearchArray{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter the number of elements(n): ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		array = getArray(array);
		System.out.print("Enter the element to search : ");
		int x = sc.nextInt();
		searchElement(array,x);
		
	}
	public static int[] getArray(int[] Arr){
		System.out.print("Enter " + Arr.length + " elements : ");
		for(int i = 0 ; i < Arr.length ; i++){
			
			Arr[i] = sc.nextInt();
		}
		return Arr;
	
	}

	public static void searchElement(int[] array, int x){
		
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] ==  x){
				System.out.println("Element "+x+" found at index "+i );	
				System.exit(0);
			}
			
		}
		System.out.println("Element not found");	
	}
}