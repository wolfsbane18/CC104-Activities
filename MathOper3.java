class MathOper3 {

	public MathOper3(){
	n1 = 125;
	n2 =75;
}
public MathOper3(int x, int y){

n1= x;
n2= y;
}

int n1=0;
int n2=0;

int Sum (){ return n1+n2; }
int Diff(){ return n1-n2; }
int Prod(){ return n1*n2; }
int Quo (){ return n1/n2; }
int Rem (){ return n1%n2; }

void dispSumm(){
System.out.println("Sum = " + Sum());
System.out.println("Difference = " + Diff());
System.out.println("Product = " + Prod());
System.out.println("Quotient = " + Quo());
System.out.println("Remainder = " + Rem());

	}
}