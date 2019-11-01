
/**
 * N-th Tribonacci Number
 * @author asharda
 * <a href>https://leetcode.com/problems/n-th-tribonacci-number/</a>
 *
 */
public class Tribonacci {


	int []term = new int [10000]; 

	/**
	 * Return nth tribonacci Number
	 * @param n
	 * @return int
	 */

	public int tribonacci(int n) {
		if(n==0)
		{
			term[0]=0;
			return 0;
		}
		else if(n==1)
		{
			term[0]=1;
			return 1;
		}
		else if(n==2)
		{
			term[0]=2;
			return 1;
		}
		else if(term[n]!=0)
			return term[n];
		else
		{
			term[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
			return term[n];
		}
	}
	public static void main(String[] args) {

		Tribonacci t=new Tribonacci();
		System.out.println(t.tribonacci(25));

	}

}
