
/**
 * LongPressedName
 *<a href> https://leetcode.com/problems/long-pressed-name/ </a>
 * @author asharda
 */
public class LongPressedName {

	/**
	 * Check if a key is long pressed
	 * @param name
	 * @param typed
	 * @return
	 */
	public boolean isLongPressedName(String name, String typed) {
		if (typed.length() < name.length())
			return false;
		if (typed.length() == name.length())
			return name.equals(typed);

		int nameIdx = 0;
		for (int i = 0; i < typed.length(); i++) {
			if (nameIdx < name.length() && typed.charAt(i) == name.charAt(nameIdx))
				nameIdx++;
			else if (i > 0 && typed.charAt(i) == typed.charAt(i - 1)) {
				continue;
			} else
				return false;
		}
		if (nameIdx == name.length())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		LongPressedName name = new LongPressedName();
		System.out.println(name.isLongPressedName("alex", "aaleex"));
	}
}
