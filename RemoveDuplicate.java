import java.util.Scanner;
public class RemoveDuplicate{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.print("Enter the number of elements(n): ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		array = getArray(array);
		RemoveDuplicate(array);
		
	}
		
	public static int[] getArray(int[] Arr){
		System.out.print("Enter " + Arr.length + " elements : ");
		for(int i = 0 ; i < Arr.length ; i++){
			
			Arr[i] = sc.nextInt();
		}
		return Arr;
	
	}
		
	public static void printArray(int[] Arr , int lastIndex){
		for(int i = 0 ; i < lastIndex ; i++){
			
			System.out.print(Arr[i]+" ");
		}
	
	}
	
	public static void RemoveDuplicate(int[] array){
		int[] arrNew = new int[array.length];
		arrNew[0] = array[0];
		int j = 1;
		for(int i = 1 ; i <array.length;i++){
			
			if(!isDuplicate(arrNew,array[i])){
				arrNew[j] = array[i];
				j++;
			}
		}
		printArray(arrNew,j);
	}
	public static boolean isDuplicate(int[] arrNew,int A){
		
		for(int i = 0 ;  i < arrNew.length ;i++){
		
			if(arrNew[i]==A){
				return true;
			}
		}
		return false;
	}	
}