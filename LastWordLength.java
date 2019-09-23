/**
 * Find Length of Last Word
 * @author asharda
 * <a href >https://leetcode.com/problems/length-of-last-word/ </a>
 *
 */
public class LastWordLength {

	/**
	 * Find Length of Last Word
	 * @param s
	 * @return int
	 */
	public int lengthOfLastWord(String s) {

		String arr[]=s.split(" ");
		if(arr.length==0)
		{
			return 0;
		}
		return arr[arr.length-1].length();

	}
	public static void main(String[] args) {

		String s="Hello World";
		LastWordLength length=new LastWordLength();
		System.out.println(length.lengthOfLastWord(" "));

	}

}
