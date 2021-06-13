import java.util.Scanner;
import java.util.Random;
public class Rock {
@SuppressWarnings({ "null", "unused" })
public static void main(String[] args) {
	String personPlay=null;
	String computerPlay=null;
	int computerInt=0;
	@SuppressWarnings({ "unused", "resource" })
	Scanner scan = new Scanner(System.in);
	Random generator = new Random();
	switch(computerInt)
	{
	}
	if(personPlay.equals(computerPlay))
		System.out.println("It is a tie! ");
	else if(personPlay.equals("R"))
		if (computerPlay.equals("S"))
			System.out.println(" Rock crushers scissors . you win!");
		else if 
		(computerPlay.equals("P"))
			{
				if(computerPlay.equals("S"))
					System.out.println(" Scissor cuts paper. You lose!!");
				else if(personPlay.equals("S"))
				{
					if(computerPlay.equals("P"))
						System.out.println("Scissor cuts paper.You win!! ");
					else if(computerPlay.equals("R"))
						System.out.println("Rock breaks scissors.You lose!!");
				}
				else
				{
					System.out.println("Invalid user input");
					
				}
			}
		}
}



