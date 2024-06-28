/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author betus
 */
public class Find_the_Highest_Altitude_24 {
        public int largestAltitude(int[] gain) {
        int i = 0;
        int sum = 0;
        int max = 0;
        while (i < gain.length) {
            sum += gain[i];
            // System.out.println("max"+sum);
            if (sum >= max) {
                max = sum;
                i++;
            } else {
                i++;
            }

        }
        return max;
    }
}
