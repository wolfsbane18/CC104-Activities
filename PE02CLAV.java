/*Name: Cassandra Lian A. Villena
Section: BSIT1DG1
Description: This is a java sourve code that will accept a number and print if the number is positive, negative, or zero.*/

import java.util.Scanner;
class PE02CLAV{

public static void main(String Cass[]){

Scanner input = new Scanner(System.in);
int numr;

System.out.print("Enter an integer number: ");
numr = input.nextInt();

	if(numr>0)
	{
		System.out.println("The number is positive.");
	}
		else if (numr<0)
		{
			System.out.println("The number is negative.");
		}
			else
			{
				System.out.println("The number is zero.");
			}
	}
}