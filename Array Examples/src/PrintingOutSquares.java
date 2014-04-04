
public class PrintingOutSquares
	{
	static int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	public static void main(String[] args)
		{
		for (int i = 0; i < array.length; i++)
			{
			System.out.println("The square of " 
			+ (i + 1) + " is " + (array[i] * array[i]));
			}
		}
	}
