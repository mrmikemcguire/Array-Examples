import java.util.Random;

public class PickACard
	{
	static String ranks [] = {"ace", "king", "queen", "jack", "ten",
			"nine", "eight", "seven", "six", "five", "four", "three", "two"};
	static String suits [] = {"clubs", "diamonds", "hearts", "spades"};

	public static void main(String[] args)
		{
		Random randomNumber = new Random();
		int rank = randomNumber.nextInt(13);
		int suit = randomNumber.nextInt(4);
		
		System.out.println("You drew the " + ranks[rank] + " of "
				+ suits[suit]);
		}
	}
