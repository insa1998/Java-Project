import java.util.Scanner;
import java.text.NumberFormat;
public class Salary {
public static void main(String[] args) {
	double currentSalary;
	double raise=0;
	double newSalary=0;
	String rating;
	Scanner scan = new Scanner(System.in);
	System.out.print(" Enter the Current salary :");
	currentSalary = scan.nextDouble();
	
	System.out.println(" Enter the performance rating (Excellent, Good, or Poor):");
	rating = scan.next();
	scan.close();
	if(rating.equalsIgnoreCase("excellent"))
	{
		raise=(currentSalary/100)*6;
	}if(rating.equalsIgnoreCase("good"))
	{
		raise=(currentSalary/100)*4;
	}if(rating.equalsIgnoreCase("poor"))
	{
		raise=(currentSalary/100)*1.5;
	}
	System.out.println("raise"+raise);
	newSalary=currentSalary+raise;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	System.out.println();
	System.out.println("Current Salary :"+money.format(currentSalary));
	System.out.println("Amount of your raise :"+money.format(raise));
	System.out.println(" your new salary : "+money.format(newSalary));
	System.out.println();
	
}
}
