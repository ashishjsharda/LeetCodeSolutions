/**
 *Rotate an array by k times to right
 * @author ashish
 */
public class RotateArr {

    public static void rotate(int[] nums, int k) {

        if(k == 0 || nums.length <= 1) {
            return;
        }

        k = k % nums.length;

        int[] copy = new int[nums.length];

        copy = nums.clone();

        //Args - source, src start, dst, dst start, no of elements
        System.arraycopy(copy, copy.length - k, nums, 0, k);
        System.arraycopy(copy, 0, nums, k, copy.length - k);
        for(int i:nums){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        rotate(arr,2);
  }
}
