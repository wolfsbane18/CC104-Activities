/*Name: Cassandra Lian A. Villena
Section: BSIT1DG1
Description: This is a java sourve code that will accept a number and print if the N1 is greater than, less than, or equal to N2.*/

import java.util.Scanner;
class PE03CLAV{

public static void main(String Cass[]){

Scanner input = new Scanner(System.in);
int N1, N2;

System.out.print("Enter first number: ");
N1 = input.nextInt();
System.out.print("Enter second number: ");
N2= input.nextInt();

if(N1>N2)
{
	System.out.println("Nl is greater than N2.");
}

	else if (N1<N2)
	{
		System.out.println("Nl is less than N2.");
	}
		else
		{
			System.out.println("NI is equal to N2.");
		}
	}
}