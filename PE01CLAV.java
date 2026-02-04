/*Name: Cassandra Lian A. Villena
Section: BSIT1DG1
Description: This is a java source code that will accept a number and print if the number is even or odd.*/

import java.util.Scanner;
class PE01CLAV{

public static void main(String Cass[])
{
Scanner input = new Scanner(System.in);
int numr;

System.out.print("Enter an integer number: ");
numr = input.nextInt();

if (numr%2 == 0)
	{
	System.out.println("The number is even.");
	}

else if (numr%2 != 0)
{
System.out.println("The number is odd.");
}

	}
}