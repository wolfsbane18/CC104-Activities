import java.util.*;
class HelloDOS {
	

static int N1,N2;
static Scanner input = new Scanner(System.in);
static int Sum(int y,int x)
{
return x+y;
}
	public static void main(String Cass []) {

		System.out.println("Welcome to Java!");
		System.out.print("Enter first number: ");
		N1 = input.nextInt();
		System.out.print("Enter second number: ");
		N2 = input.nextInt();
		System.out.print("Sum = " + Sum(N1,N2));

	}
}