import java.util.Scanner;
class SetA{
static Scanner in = new Scanner(System.in);
static int ectr = 0, octr = 0;	
	public static void main (String[]args){
		int input;
		int arrnum[];
		
	System.out.print("Enter how many numbers you want to input: ");
	input = in.nextInt();
	arrnum = new int [input];

	for (int c=1;c<=input;++c)
	{
		System.out.print("Enter number -> ");
		int num = in.nextInt();

		System.out.println(eveodd(num));
	}

	System.out.println("The even numbers are: " + ectr);
	System.out.println("The odd numbers are: " + octr);

		}

	static String eveodd(int n)
{
	if(n%2==0)
		{
		ectr++;
		return "Even";}
	else
		{
		octr = octr+1;
		return "Odd";}
}
}