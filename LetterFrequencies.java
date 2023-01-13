/*
 * Activity 2.4.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";
		

		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */


	for (int i = 0; i <= letters.length(); i++)
	{
		String alphaBet = letters.substring(i, i+1);
		int count = 0;

		for (int n = 0; n < phrase.length(); n++){
			
			String phraseLet = phrase.substring(n, n+1);

			
			if (alphaBet.equals (phraseLet)){
				count += 1;
			}
		}
		System.out.println(alphaBet + " appears " + count + " times");

	}
	}
}
