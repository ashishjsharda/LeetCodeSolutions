/**
 * ReverseLetters
 * @author asharda
 * <a href> https://leetcode.com/problems/reverse-only-letters/ </a>
 *
 */
public class ReverseLetters {

	/**
	 * Reverse Only Letters
	 * @param S 
	 * @return String
	 */
	public String reverseOnlyLetters(String S) {

		char [] result = new char[S.length()];

		int count = 0;

		for(int i = 0; i < S.length(); i++)
		{            
			if(!Character.isLetter(S.charAt(i)))
			{
				result[i] = S.charAt(i);
			}
			else
			{
				char temp2 = S.charAt(S.length() - 1 - count++);

				if(Character.isLetter(temp2))
				{
					result[i] = temp2; 
				}
				else
				{
					i--;
				}  
			}
		}

		return new String (result);
	}
	public static void main(String[] args) {

		ReverseLetters letter=new ReverseLetters();
		System.out.println(letter.reverseOnlyLetters("Test1ng-Leet=code-Q!"));

	}

}
