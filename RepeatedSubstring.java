import java.util.Collections;
import java.util.stream.IntStream;

/**
 * Repeated Substring
 * <a href>https://leetcode.com/problems/repeated-substring-pattern/ </a>
 * @author asharda
 *
 */
public class RepeatedSubstring {

	/**
	 * Repeated SubString Pattern
	 * @param s
	 * @return boolean
	 */
	public boolean repeatedSubstringPattern(String s) {

		if (s.isEmpty()) return false;
		if (s.length() == 1) return false;

		return IntStream.range(1, (s.length()/2) + 1).parallel().anyMatch(i ->
		String.join("", Collections.nCopies(s.length() / i, s.substring(0, i))).equals(s));
	}
	public static void main(String[] args) {


		RepeatedSubstring str=new RepeatedSubstring();
		System.out.println(str.repeatedSubstringPattern("abab"));
	}

}
