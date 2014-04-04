import java.util.Scanner;

public class WordLocationFinder
	{

	public static void main(String[] args)
		{
		System.out.println("Please enter your sentence.");
		Scanner userInput = new Scanner(System.in);
		String originalText = userInput.nextLine();
		
		String [] inputDividedIntoWords = originalText.split(" ");
		
		for (String words : inputDividedIntoWords)
			System.out.println(words);
		
		System.out.println("What is the location of the word you wish me to print?");
		int wordLocation = userInput.nextInt();
		
		System.out.println("The word is: " + inputDividedIntoWords[wordLocation - 1]);

		
		
		
		

		}

	}
