import java.util.*;

class MathOper2 {

    public static void main(String Cass[]) {
        Scanner input = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        System.out.print("Enter first number: ");
        n1 = input.nextInt();

        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        System.out.println("Sum = " + Sum(n1, n2));
        System.out.println("Difference = " + Diff(n1, n2));
        System.out.println("Product = " + Prod(n1, n2));
        System.out.println("Quotient = " + Quo(n1, n2));
        System.out.println("Remainder = " + Rem(n1, n2));
    } 
    static int Sum(int c, int v) {
        return c + v;
    }

    static int Diff(int c, int v) {
        return c - v;
    }

    static int Prod(int c, int v) {
        return c * v;
    }

    static int Quo(int c, int v) {
        return c / v;
    }

    static int Rem(int c, int v) {
        return c % v;
    }
}

