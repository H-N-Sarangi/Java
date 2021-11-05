import java.util.Scanner;

public class Evaluate {
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of x : ");
        int x = sc.nextInt();
        double sum = 1.0000;
        double d = x/1;
        for(int i = 1;;i++){
            if(sum + d == sum){
                break;
            }
            sum+= d;
            d = d*x/(i+1);
        }
        System.out.println(sum);
    }


}