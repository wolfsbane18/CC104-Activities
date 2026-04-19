import java.util.Scanner;
public class SetC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many pairs of numbers? ");
        int n = sc.nextInt();

        int[] n1 = new int[n];
        int[] n2 = new int[n];
int i=0;
        //for (int i = 0; i < n; i++) 
do{
            System.out.print("Enter N1: ");
            n1[i] = sc.nextInt();
            System.out.print("Enter N2: ");
            n2[i] = sc.nextInt();

		if (n1[i] > n2[i]) {
                System.out.println("The 1st number is greater than the 2nd number.");
            	}
                else if (n1[i] < n2[i]) {
                    System.out.println("The 2nd number is greater than the 1st number.");
                } 
		else {
                    System.out.println("The 1st number and second number are equal.");
}

        i++;}while(i < n);

    }
}
