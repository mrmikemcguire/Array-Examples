import java.util.Arrays;
import java.util.Scanner;

public class SentenceWordAlphabetizer
	{

	public static void main(String[] args)
		{
		System.out.println("Please enter your sentence.");
		Scanner userInput = new Scanner(System.in);
		String originalText = userInput.nextLine();
		
		String [] inputDividedIntoWords = originalText.split(" ");
		
		Arrays.sort(inputDividedIntoWords);
		
		for (String sortedWords : inputDividedIntoWords)
			{
			System.out.println(sortedWords);
			}
		}
	}
