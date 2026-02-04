import java.util .*;
public class ArrayDemo{

public static void main (String Cass[]){

int[]arr,x,y;
int a[], b,c;

a = new int[5];
a[0] =25;
a[1] = 10;
a[2] = 27;
a[3] = 11;
a[4] = 14;

System.out.println("Element 1: " + a[0]);
System.out.println("Element 2: " + a[1]);
System.out.println("Element 3: " + a[2]);
System.out.println("Element 4: " + a[3]);
System.out.println("Element 5: " + a[4]);

for(c=0 ; c<a.length; ++c)
{
System.out.println("Element " + c+ " "+a[c]);
}
	}
}
