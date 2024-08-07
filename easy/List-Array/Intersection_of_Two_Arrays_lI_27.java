/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.ArrayList;
import java.util.List;


/**
 * 350. Intersection of Two Arrays II
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * 
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 *
 * Constraints:
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * 
 */
public class Intersection_of_Two_Arrays_lI_27 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] freq = new int[1005]; 
        
        List<Integer> intersectionList = new ArrayList<>();

        for(int num: nums1){
            freq[num]++;
        }

        for(int num: nums2){
            if(freq[num] > 0){
                intersectionList.add(num);
                freq[num]--;
            }
        }
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionArray.length; i++) {
            intersectionArray[i] = intersectionList.get(i);
        }
        
        for(int i = 0; i < intersectionArray.length; i++){
            System.out.println(intersectionArray[i]);
        }
    }
    
    
      public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1005];

        List<Integer> intersectionList = new ArrayList<>();

        for (int num : nums1) {
            freq[num]++;
        }

        for (int num : nums2) {
            if (freq[num] > 0) {
                intersectionList.add(num);
                freq[num]--;
            }
        }
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionArray.length; i++) {
            intersectionArray[i] = intersectionList.get(i);
        }

        return intersectionArray;
    }
    
}
