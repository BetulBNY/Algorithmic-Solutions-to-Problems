/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;
import java.util.HashMap;
/**
 * First Unique Character in a String
 * 
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * 
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * 
 * 
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 * 
 * @author betus
 */


class Solution {
    public static int firstUniqChar(String s) {
       int[] freq = new int[26];
       for(int i = 0; i< s.length();  i++){   // Her karakterden kaç tane olduğunu bulduk tek 1 forda.
          freq[s.charAt(i)-'a']++; 
       }
       
       for(int i = 0 ; i<s.length(); i++){
           if(freq[s.charAt(i) - 'a'] == 1){
               return i;
           }
       }
       return -1;
    }
}

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {        
        String str = "loveleetcode";
        Solution s = new Solution();
        s.firstUniqChar(str);       
    }
}
