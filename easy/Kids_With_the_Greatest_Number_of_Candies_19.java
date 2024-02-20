/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.ArrayList;
import java.util.List;

/**
 *There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number 
 * of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have. Return a boolean array 
 * result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number
 * of candies among all the kids, or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 * 
 * 
 * Example 1:
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true] 
 * 
 * Example 2:
 * Input: candies = [4,2,1,1,2], extraCandies = 1
 * Output: [true,false,false,false,false] 
 * Explanation: There is only 1 extra candy.
 * Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
 * 
 * @author betus
 */
public class Kids_With_the_Greatest_Number_of_Candies_19 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> result = new ArrayList<>();
        //1) Finding max
        int max = candies[0];
        for(int i =0; i<candies.length; i++){
            if(max< candies[i]){
                max = candies[i];
            }
        }
        //2) Adding extras.
        for(int k = 0; k<candies.length ; k++){
            if(candies[k]+ extraCandies >= max){
                result.add(Boolean.TRUE);
            }
            else{
                result.add(Boolean.FALSE);
            }
        }
        return result;        
    }
 
    
    
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        List <Boolean> result = new ArrayList<>();
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));    
    }
}
