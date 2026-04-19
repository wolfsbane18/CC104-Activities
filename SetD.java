import java.util.Scanner;
class SetD{
static Scanner in = new Scanner(System.in);
	public static void main(String[]args){
		int arrnum[];
		System.out.print("How many numbers do you want to enter? ");
		int index = in.nextInt(); 
		arrnum = new int[index];

		for(int c=0;c<index;c++)
		{
			System.out.print("Enter number: ");
			arrnum[c] = in.nextInt();
		}
		int high = arrnum[0];
		int low = arrnum[0];

		for(int c=1;c<index;c++)
		{
			if(arrnum[c]>high)
			high = arrnum[c];
			else if(arrnum[c]<low)
			low = arrnum[c];
		}

		System.out.println("The highest number is " + high);
		System.out.println("The lowest number is " + low);

		}
}
/*Input -> 1..N (Series of Integer Numbers)
Display the Highest Number and Lowest Number
-> If-Else
-> Loop
-> Array*/