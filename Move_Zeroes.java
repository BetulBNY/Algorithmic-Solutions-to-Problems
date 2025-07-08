/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 * Move Zeroes
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * 
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 * 
 * @author betus
 */
public class Move_Zeroes {
    
    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while(j < nums.length){     
            // Swap elements if nums[i] is 0 and nums[j] is not 0
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;   
                i++;
               // j++;
            }else if(nums[i] == 0 && nums[j] == 0){
                j++;
            }  
            // Increment both if there is no 0
            else{
                i++;
                j++;
            }
        }
        return nums;
    }
    
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};               
        int[] result = moveZeroes(nums);

        for (int num : result) {
            System.out.print(num);       
    }
}
}