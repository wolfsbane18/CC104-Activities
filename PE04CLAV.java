/*Name: Cassandra Lian A. Villena
Section: BSITIDG1
Description: This is a java sourve code that will accept three integers and display the highest among the three numbers.*/

import java.util.Scanner;
class PE04CLAV{

public static void main(String Cass[]){

Scanner input = new Scanner(System.in);
int N1, N2, N3;

System.out.print("Enter first number: ");
N1 = input.nextInt();
System.out.print("Enter second number: ");
N2= input.nextInt();
System.out.print("Enter third number: ");
N3 = input.nextInt();

if(N1>N2 && N1>N3)
{
System.out.println("The first number is the largest among the three numbers.");
}

else if (N2>N3 && N2>N3)
{
System.out.println("The second number is The largest among the three numbers.");
}

else if (N3>N1 && N3>N2)
{
System.out.println("The third number is the largest among the three numbers.");
}

	}
}