import java.util.Scanner;

public class Grades {
public static void main(String[] args) {
	double grade;
	double sumofGrades;
	int numStudents;
	int numPass;
	int numFail;
	Scanner scan = new Scanner(System.in);
	System.out.println("\nGrade Proceesing Program\n");
	sumofGrades=0;
	numStudents=0;
	numPass=0;
	numFail=0;
	System.out.println(" Enter the First student's grade :");
	grade = scan.nextDouble();
	while (grade>=0)
	{
		sumofGrades = sumofGrades + grade;
		numStudents = numStudents +1;
		if (grade < 60)
			numFail = numFail + 1;
		else
			numPass = numPass +1;
		System.out.println(" Enter the next Grades ( a negative to quit) :");
		grade = scan.nextDouble();
	}
	if(numStudents>0)
	{
		System.out.println(" \nGrade Summary");
		System.out.println(" Class Average :"+ sumofGrades/numStudents);
		System.out.println(" Number of Passing Grades : "+numPass);
		System.out.println(" Number of failing Grades :"+numFail);
	}
	else
		System.out.println(" No grades processed.");
	
	}
		
}

