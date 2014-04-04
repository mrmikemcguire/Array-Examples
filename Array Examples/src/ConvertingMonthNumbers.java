import java.util.Scanner;

public class ConvertingMonthNumbers
	{
	static String monthNames [] = {"January", "February", "March", "April",
			"May", "June", "July", "August", "September",
			"October", "November", "December"};
	
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Tell me the number of the month you're looking for.");
		int monthNumber = userInput.nextInt();
		System.out.println("That's the month of " + monthNames[monthNumber - 1]);
		}
	}

	
