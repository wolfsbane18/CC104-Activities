import java.util.Scanner;
class GradeAnalyzer{

public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the humber of grades you want to input: ");
int size = input.nextInt();
int [] grades = new int [size];

for (int i=0;i<size; i++)
{
System.out.print("Grade: ");
grades[i] = input.nextInt();
}

int sum = 0;
int highest = grades [0];

for (int grade:grades)
{
sum+=grade;
	if(grade>highest)
	{
	highest=grade;
	}
}

double average = (double) sum/grades.length;
System.out.println("Average Grade: " + average) ;
System.out.println("Highest Grade:" + highest);

	}
}