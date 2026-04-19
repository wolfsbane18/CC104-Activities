class ExceptionDemo1 {

public static void main (String Lai []){

int a=10;
int b=0;

try {
    int result = a/b;
    System.out.println(result);
}
catch (ArithmeticException e) {
    System.out.println("Cannot divide zero");
} 
    System.out.println("Program continues");

}



}