/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 *  
 * Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true
    *  
Example 2:
    Input: s = "rat", t = "car"
    Output: false
    * 
 * @author betus
 */
import java.util.List;
import java.util.ArrayList;
public class valid_anagram {
    
public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> charList = new ArrayList<>();

        for (char c : s.toCharArray()) { // Adds the characters in the first string to the List.
            charList.add(c);
        }

        int counter = 0;

        for (char character : t.toCharArray()) {
            if (charList.contains(character)) {
                charList.remove((Character) character); 
            // If the character is in the List, it is removed from the List and counter increased.
                counter++;
            }
        }

        return (s.length() == counter);
    }
    
    
    
    public static void main(String[] args){
        valid_anagram instance = new valid_anagram(); // create sample from valid_anagram class
        String a = "aacc";
        String b = "ccac";
        boolean result = instance.isAnagram(a, b);
        System.out.println("Is Anagram: " + result); 
        
        
    }
    
}
