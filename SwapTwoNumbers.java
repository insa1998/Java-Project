
public class SwapTwoNumbers {
public static void main(String[] args) {
	int first = 120, second = 220;
	System.out.println("--Before Swap--");
	System.out.println("First number = "+first);
	System.out.println("Second number="+second);
	int temp = first;
	first = second;
	second = temp;
	System.out.println(" --After swap--");
	System.out.println("First number = "+first);
	System.out.println("Second number="+second);
}
}
