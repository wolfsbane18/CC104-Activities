import java.util.Scanner;
class SetB{
static Scanner in = new Scanner(System.in);
static int pctr=0,nctr=0,zctr=0;

	public static void main(String[]args) {
	int arrnum[];

	System.out.print("Enter how many numbers you will input: ");
	int index = in.nextInt();
	arrnum = new int[index]; 

	for(int c=0; c<index;++c)
	{
		System.out.print("Enter number: ");
		arrnum[c] = in.nextInt();

		System.out.println(pnz(arrnum[c]));
	}
	
	System.out.println("The total positive numbers is: " + pctr);
	System.out.println("The total negative numbers is: " + nctr);
	System.out.println("The total zero numbers is: " + zctr);
}
	static String pnz(int x)
	{
		if(x>0)
			{pctr++;
			return "Positive";}
		else if(x<0)
			{nctr++;
			return "Negative";}
		else
			{zctr++;
			return "Zero";}
	}

}