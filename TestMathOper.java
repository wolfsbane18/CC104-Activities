class TestMathOper{
public static void main(String Cass[]){

MathOper3 object1,object2;
object1 = new MathOper3();

System.out.println(object1.n1);
System.out.println(object1.n2);

object1.dispSumm();

object2 = new MathOper3(75,85);
object2.dispSumm();
	}
}