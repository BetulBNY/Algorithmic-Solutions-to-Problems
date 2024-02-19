/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 * 
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters 
 * without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * 
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * 
 * @author betus
 */

// 1) Purpose: creating empty indexes for not equally valued indexes.
// 2) While loop travelling longest string and if str1 != str2 with help of stringbuilder create empty places.
// 3) When we destroy this empty places if 2 string equal each other return true. 
public class Is_Subsequence_18 {
    
// METHOD 1:    
    public boolean isSubsequence(String s, String t) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < t.length() && j < s.length()){
            if(t.charAt(i) == s.charAt(j)){
                stringBuilder.append(t.charAt(i));
                i++;
                j++;
            }
            else{
                i++;
                }
        }       
    return stringBuilder.length() == s.length();
        }
    
// METHOD 2: (BEST)
     public boolean isSubsequence2(String s, String t) {
        if(s.isEmpty()) return true;
        if(t.length() < s.length()) return false;
        int j = 0;
        for(char ch:t.toCharArray()){
           if(ch == s.charAt(j)) j++;
           if(j == s.length()) return true;
       }
       return false;
       } 
    

// Without method and longest version :       
public static void main(String[] args) {
    String s = "ahbgdc";
    String t = "abc";
    StringBuilder stringBuilder = new StringBuilder();
    
    int i = 0;
    int j = 0;
    while(stringBuilder.length() != s.length()){
        if(s.charAt(i) == t.charAt(j)){
            stringBuilder.append(s.charAt(i));
            i++;
            j++;
        }
        else{
            stringBuilder.append(' ');
            i++;
        }
    }        
    int k = 0;
    while(k != stringBuilder.length()){
           if(stringBuilder.charAt(k) == ' '){
            stringBuilder.deleteCharAt(k);
            //k++;
        }
        else{
            k++;
    }     
    }

    System.out.println(stringBuilder);       
}}
