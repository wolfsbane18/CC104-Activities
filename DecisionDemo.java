import java.util.*;
public class DecisionDemo{

	public static void main(String Cass[]){

	Scanner input = new Scanner(System.in);
	System.out.print( "Grade: ");
	double grd=input.nextDouble();
		
		if (grd>74.4)
		System.out.println("You passed!");

			else
			System.out.println("You Failed!");

		if (grd>89)
		System.out.println("EXCELLENT");

			else if(grd>79)
			System.out.println("VERY GOOD");

				else if(grd>74)
				System.out.println("G00D");

					else
					System.out.println("POOR");
int day;

System.out.print( "Enter a number (1-7): ");
day = input.nextInt();

switch(day) {
case 1: System.out.println("Sunday");
break;

case 2: System.out.println("Monday");
break;

case 3: System.out.println("Tuesday");
break;

case 4: System.out.println("Wednesday");
break;

case 5: System.out.println("Thursday");
break;

case 6: System.out.println("Friday");
break;

case 7: System.out.println("Saturday");
break;
	}
}
}


