package datastructure;

/**
 * https://leetcode.com/problems/valid-number/
 * @author asharda
 *
 */
public class Numeric {
	
	/**
	 * Validate if a String is a decimal number
	 * @param s
	 * @return boolean
	 */
	public boolean isNumber(String s) {
		boolean flag=false;
		try
		{
			if(!Character.isLetter(s.charAt(s.length()-1)))
			{
				double d=Double.parseDouble(s);
				flag=true;
			}
		}
		catch(Exception e)
		{
			return false;
		}

		return flag;

	}
	public static void main(String[] args) {

		Numeric num=new Numeric();
		String str="-95a54e53";
		System.out.println(num.isNumber(str));

	}

}
