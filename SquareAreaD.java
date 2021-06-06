import java.util.Scanner;
class SquareAreaD {
public static void main(String[] args) {
	System.out.println(" Enter side of Square :");
	Scanner scanner = new Scanner(System.in);
	double side = scanner.nextDouble();
	double area = side*side;
	System.out.println("Area of square is :"+area);
	
}
}
