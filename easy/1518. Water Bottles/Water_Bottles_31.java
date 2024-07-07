/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 * 1518. Water Bottles
 * There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market 
 * with one full water bottle. The operation of drinking a full water bottle turns it into an empty bottle.
 * en the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
 * 
 * Example 1:
 * Input: numBottles = 9, numExchange = 3
 * Output: 13
 * Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
 * Number of water bottles you can drink: 9 + 3 + 1 = 13.
 * 
 * Example 2:
 * Input: numBottles = 15, numExchange = 4
 * Output: 19
 * Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
 * Number of water bottles you can drink: 15 + 3 + 1 = 19.
 * 
 * Constraints:
 * 1 <= numBottles <= 100
 * 2 <= numExchange <= 100
 */
public class Water_Bottles_31 {
        public static int numWaterBottles(int numBottles, int numExchange) {
            int drinkedBottles = numBottles;
            int quotient = numBottles / numExchange; // bölüm
            int remainder = numBottles % numExchange; // kalan
            int nextsum = 0;
            while (quotient > 0) {
                drinkedBottles += quotient;
                nextsum = quotient + remainder;
                quotient = nextsum / numExchange;
                remainder = nextsum % numExchange;
            }
            return drinkedBottles;
    }
        public static void main(String[] args) {
            int numBottles = 15, numExchange = 4;
            System.out.println(numWaterBottles(numBottles, numExchange));
  
    }
}
