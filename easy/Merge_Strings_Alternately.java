/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string. Return the merged string.
 * 
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * 
 * @author betus
 */


// MY SOLUTION
/*
Approach:
In the first part of the method, characters are added to a StringBuilder as requested, iterating through both input strings. 
For any remaining characters after this initial iteration, the code enters the if conditions to identify the longer string. 
The characters of the longer string are then added to the end of the StringBuilder. To ensure compatibility with the expected return type of 
String, 
the StringBuilder is converted to a String before being returned.

Complexity:

Time complexity:
O(n) This is because for loop is performed over all characters of both words, and each character is processed once.

Space complexity:
O(n) This is because a StringBuilder object is created, and this object uses space proportional to the total number of characters in both words.

*/
class Merge_Strings_Alternately{
    
        public static String mergeAlternately(String word1, String word2) {
        StringBuilder finalword = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length()); 

        // If lengths of strings are equal
        for (int i = 0; i < minLength; i++) {
            finalword.append(word1.charAt(i)).append(word2.charAt(i));
        }
        // Getting remaining character from the longest string
        if (word1.length() > word2.length()) {
            finalword.append(word1.substring(minLength));
        } else {
            finalword.append(word2.substring(minLength));
        }
        return finalword.toString();  // Converting StringBuilder to String
   }
        
        public static void main(String[] args) {
            String word1 = "abc";
            String word2 = "pqr";
            System.out.println(mergeAlternately(word1, word2));
    }
    
}
