
import java.util.Arrays;

/**
 * <ahref=https://leetcode.com/problems/two-sum/> Two Sum</a>
 * @author ashish
 */
public class TwoSum {
    /**
     * Compute Target Array
     * @param nums
     * @param target
     * @return int[]
     */
    public int[] twoSum(int[] nums, int target) {

        int sol[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    sol[0] = i;
                    sol[1] = j;
                }
            }
        }
        return sol;
    }
    public static void main(String[] args) {

        TwoSum twoSum=new TwoSum();
        int nums[]={2,17,7,15};
        int []sol=twoSum.twoSum(nums,9);
        Arrays.stream(sol).forEach(e-> System.out.println(e));

    }
}
