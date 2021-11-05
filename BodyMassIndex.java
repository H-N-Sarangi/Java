import java.util.Scanner;

public class BodyMassIndex {

	public static void main ( String args[]){
	
		Scanner sc = new Scanner ( System.in);
		System.out.print("Enter your body mass : ");
		double bodyMass = sc.nextDouble();
		System.out.print("In lbs or kg( 1 = lbs , 2 = kg) : ");
		int weightType = sc.nextInt();
		System.out.print("Enter your height : ");
		double bodyHeight = sc.nextDouble();
		System.out.print("In in or m( 1 = in , 2 = m) : ");
		int heightType = sc.nextInt();
		
		BMIcalculator(bodyMass , weightType , bodyHeight ,heightType);
	
	
	}
	
	public static void BMIcalculator( double bodyMass , int weightType  , double bodyHeight , int heightType ){
		
		double mass = 0.0d; 
		double height = 0.0d;
		if (weightType == 1)
			mass = bodyMass * 2.2046;
		else if( weightType == 2)
			mass = bodyMass;
		else{
			System.out.print("Invaild Input");
			System.exit(0);
		}	
		if( heightType == 1)
			height = bodyHeight * 0.0254;
		else if (heightType == 2 )
			height = bodyHeight;
		else{
			System.out.print("Invaild Input");
			System.exit(0);
		}
		double bmi = mass/(height*height);
		System.out.println("Your BMI is " +(bmi));
		if( (bmi) > 25)
			System.out.print("You are overweight");
		else if((bmi) >= 20)
			System.out.print("You are healthy");
		else
			System.out.print("You are underweight");
		
	}
	
	

}