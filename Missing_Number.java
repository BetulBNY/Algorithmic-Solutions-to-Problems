/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * @author betus
 */

// 1) Find number of elements in array.
// 2) Sum of elements
// 3) n*(n+1)/2
import java.util.Arrays;
public class Missing_Number {
    
    public static int missingNumber(int[] nums){
      int sum = Arrays.stream(nums).sum();
      int n = nums.length ;
      int missing_num =  n*(n+1)/2 - sum;
      return missing_num;
    }
     
    public static void main(String[] args){
        int [] arr = {9,6,4,2,3,5,7,0,1};
        int x = missingNumber(arr);
        System.out.println(x);
    }
}
