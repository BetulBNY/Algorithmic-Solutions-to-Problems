/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Reverse Vowels of a String
 * 
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * 
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"
 * 
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 * 
 * 
 * @author betus
 */
public class Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');
        
        char[] characters = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        
        while(i<j){  // increase the counters if we didn't encounter any vowel
            while(i<j && !vowels.contains(characters[i])){
                i++;
            }
            while(i<j && !vowels.contains(characters[j])){
                j--;
            }
            // if we encountered any vowel:
            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;
        }
        return String.valueOf(characters);
        
    }
    
    public static void main(String[] args) {
        String str = "Betul Nur Yildirim";
        System.out.println(reverseVowels(str));
    }

    
}
