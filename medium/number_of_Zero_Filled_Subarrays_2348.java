/*
Number of Zero-Filled Subarrays
Given an integer array nums, return the number of subarrays filled with 0.
A subarray is a contiguous non-empty sequence of elements within an array.
 
Example 1:
Input: nums = [1,3,0,0,2,0,0,4]
Output: 6
Explanation: 
There are 4 occurrences of [0] as a subarray.
There are 2 occurrences of [0,0] as a subarray.
There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.
*/
package medium;

public class number_of_Zero_Filled_Subarrays_2348 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 7, 9,8, 0, 9, 0, 0};
        int i;
        int subarray=0;
        int counter = 0;
        for (i=0; i< arr.length ; i++){
            if(arr[i]==0){
                counter++;
            }               
            else if(arr[i]!=0){
                subarray+=(counter*(counter+1)/2);       
                counter=0;           
            }
          }
           if(arr[arr.length-1]==0){
                subarray+=(counter*(counter+1)/2);                                         
            }           
    }
}
