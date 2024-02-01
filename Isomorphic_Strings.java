/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.HashMap;
import java.util.Map;


/**
 * ISOMORPHIC STRINGS
 * Given two strings s and t, determine if they are isomorphic. 
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. 
 * No two characters may map to the same character, but a character may map to itself.
 * 
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * @author betus
 */

public class Isomorphic_Strings {
      public static boolean isIsomorphic(String s, String t) {
        if(s.length() == t.length()){        
            Map<Character, Character> mycharMap = new HashMap<>();
            for(int i = 0; i<s.length(); i++){
                char schar = s.charAt(i);
                char tchar = t.charAt(i);
                
                if(!mycharMap.containsKey(schar)){
                    if(!mycharMap.containsValue(tchar)){
                        mycharMap.put(schar, tchar);}
                    else
                        return false;
                  }
                else{
                    char finalmap = mycharMap.get(schar);
                    if(finalmap != tchar){
                        return false;
                    }
                }
      }  
            
      } return true;}
    
 
    public static void main(String[] args) {
        
       
        String s1 = "egg";
        String s2 = "add";
        
        System.out.println(isIsomorphic(s1, s2));  
        
    }
}
