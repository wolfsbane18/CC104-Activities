public class LoopDemo{

public static void main(String Cass[]){

for (int i=1; i <= 10;++i)
System.out.println(i);
int i=1;
while (i <= 10){
System.out.println(i);
i++;

i=1;
do {
System.out.println(i);
++i;
} while (i <= 10);

for (int x=1; x <= 5; ++x){
	for (int y=1; y <= x; ++y)
	System.out.print("*");
	System.out.println();
}
System.out.println();

for (int x=5; x>=1; -- x) {
for (int y=1; y <= x; ++y)
System.out.print("*");
System.out.println();

}
	}
}
}