package Java12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
  * Find Duplicates
  * @author asharda
  *
  */
public class Duplicates {

  /**
    * Find Duplicates in an Array
    * @param nums
    * @return
    */

  public List<Integer> findDuplicates(int[] nums) {

    int [] arr = new int[nums.length+1];
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i=0;i<nums.length;i++){
      arr[nums[i]]++;
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]==2){
        list.add(i);
      }
    }
    return list;
  }
  public static void main(String[] args) {

    Duplicates d=new Duplicates();
    int nums[]= {4,3,2,7,8,2,3,1};
    List<Integer> list=d.findDuplicates(nums);
    for(int i:list)
    {
      System.out.println(i);
    }

  }

}
