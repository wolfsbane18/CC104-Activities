import java.util.*;

public class SGCalcEH{

public static void main (String Lai []){
  Scanner s = new Scanner (System.in);
  double avg = 1;

do{
  try {
  System.out.print ("Student Name: ");
  String name = s.nextLine();
  System.out.print ("First Grade: ");
  double fg = s.nextDouble();
  System.out.print ("Second Grade: ");
  double sg = s.nextDouble();
  System.out.print ("Third Grade: ");
  double tg = s.nextDouble();

    avg = fg + sg + tg / 3;

    if (avg > 0){
      System.out.print ("Average Grade: " + avg);
    }
  } catch (Exception e){
      System.out.println ("Invalid grade input.");
  }
} while (avg > 0);
}
}