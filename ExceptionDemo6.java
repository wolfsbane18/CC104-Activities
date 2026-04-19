import java.util.*;
class ExceptionDemo6{
    public static void main (String Lai []){
         Scanner ent= new Scanner(System.in);

  try{
        System.out.print("Enter a number: ");
        int num = ent.nextInt();
        System.out.println("You entered: " + num);
     }
  catch (Exception e)
    {
    System.out.println(e.getMessage());    
    }
}
}     