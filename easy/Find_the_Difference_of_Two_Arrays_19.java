/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/** Find the Difference of Two Arrays
 * 
 * #Array  #Hash Table
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 * 
 * Example 1:
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
 * Output: [[1,3],[4,6]]
 * 
 * Example 2:
 * Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
 * Output: [[3],[]]
 * 
 * @author betus
 */
public class Find_the_Difference_of_Two_Arrays_19 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> findDifference = new ArrayList<>();
       findDifference.add(new ArrayList<>()); // Adding an empty list to findDifference
       findDifference.add(new ArrayList<>()); // Adding another empty list to findDifference  
             
        // Creating HashMaps
        HashSet<Integer> hashle1 = new HashSet<>();
        HashSet<Integer> hashle2 = new HashSet<>();
        
         // Adding values in HashMap.
        for(int num: nums1){
            hashle1.add(num);
        }
        for(int num: nums2){
            hashle2.add(num);
        }
        
        // Check for common elements and remove them
        HashSet<Integer> copy1 = new HashSet<>(hashle1);
        HashSet<Integer> copy2 = new HashSet<>(hashle2);
        
        
        for(int num: copy2){
            if(copy1.contains(num)){
                hashle1.remove(num);  // if num1/hashle1 includes hashle2's num remove it.
                hashle2.remove(num);
            }
            else if(!hashle1.contains(num)){
               findDifference.get(1).add(num); 
            }             
        }
         findDifference.get(0).addAll(hashle1);
         return findDifference;
    }
    
    
 public static void main(String[] args) {          
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
            
      var  x = findDifference(nums1, nums2);
        System.out.println(x);
    }
}
