package easy;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** 169. Majority Element
 *
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element 
 * always exists in the array.
 * 
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 *  
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 * 
 * @author betus
 */

// 1) Sort all elements in the array. 
// 2) Middle element of array gives majority element.

// 1st Way Time 5ms - Beats 56.64% // Space 53.66MB - Beats 5.24%
public class P_169_Majority_Element_22 {
        public static int majorityElement(int[] nums) {
            Arrays.sort(nums);           
        return nums[nums.length/2];
    }
        
// 2nd Way Time 1ms - Beats 99.69% // Space 53.42MB - Beats 5.24%
public static int majorityElement2(int[] nums) {
        int counter = 0;
        int majoel = 0;
            
        for(int num : nums){
                if(counter == 0){
                    majoel = num;
                    counter++;
                }
                else if(num == majoel){
                    counter++;
                }
                else{
                    counter--;
                }
            }
            return majoel;
}
        
        public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}
