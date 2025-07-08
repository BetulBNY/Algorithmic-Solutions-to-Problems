/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 * Container With Most Water 
 *
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0)
 * and (i, height[i]).Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 * 
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 * 
 * 
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 * 
 * @author betus
 */


// LONG SOLUTION
class Solution {
    public int maxArea(int[] height) {
      int left = 0;   // left dediğimiz şey index
      int right = height.length-1;
      int max = 0;   // Integer.MAX_VALUE dersek eğer 2^32-1 i temsil edeceği için bundan daha büyük bir değer bulamaz arrayde.
      while(left != right){        
          int base = right-left;
          int h = Math.min(height[left],height[right]);
          int area = base*h;   
          if(max < area){
              max = area;
          }
          if(height[left] < height[right]){
              left++;
          }
          else{
              right--;
          }
      }
      return max;
    }
}

// SHORTER SOLUTION
class Solution {
    public int maxArea(int[] height) {
      int left = 0;   // left dediğimiz şey index
      int right = height.length-1;
      int max = 0;   // Integer.MAX_VALUE dersek eğer 2^32-1 i temsil edeceği için bundan daha büyük bir değer bulamaz arrayde.
      while(left != right){        
          int area = (right-left)* ((height[left] > height[right])? height[right--]: height[left++]);   
          if(max < area) max = area;
      }
      return max;
    }
}

