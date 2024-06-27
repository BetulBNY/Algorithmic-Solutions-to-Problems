/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 1207. Unique Number of Occurrences
 *
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 * 
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 * 
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 * 
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 * 
 * Constraints:
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 * 
 */
public class Unique_Number_of_Occurrences_25 {
    
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        int[] freq = new int[2000]; 
       
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] + 1000]++; 
        }
     
        Set<Integer> uniqueFrequencies = new HashSet<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                if (!uniqueFrequencies.add(freq[i])) {
                    System.out.println("eşit maalesef");
                    return;
                }
            }
        }
        System.out.println("boyle bir eşitlik yok");
    }
    
    
    class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2000];
        // Frekansları hesaplıyoruz.
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] + 1000]++; //// Negatif indekslemeyi önlemek için her sayıya 1000 ekliyoruz.
        }

        // Frekansların benzerliğinin kontrolü
        Set<Integer> uniqueFrequencies = new HashSet<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                if (!uniqueFrequencies.add(freq[i])) {
                    return false;
                }
            }
        }
        return true;

    }
}
    
    
    
    
    
    
    
    
    
    
}
