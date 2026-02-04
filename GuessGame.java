import java.util .*;
public class GuessGame{

static Scanner input = new Scanner(System.in);
static Random N = new Random();
static int Secret = N.nextInt(101)+1;
static int Guess = 0;
static String ans = "";

public static void main (String Cass[]) {

do{
	Secret = N.nextInt(100)+1;
	Guess = 0;
do{
System.out.print("Enter your guess (1-100): ");
Guess = input.nextInt();

if(Guess>Secret)
{
	System.out.println("Your guess is too high");
}

else if(Guess<Secret)
{
	System.out.println("Your guess is too low");
}

else
{
System.out.println("Congrats!");
}

}while (Guess != Secret);

System.out.print("Play again? (Y/N)");
ans = input.next();

} while(!ans.equalsIgnoreCase("N"));
	System.out.println("Good bye!");	
	}
}