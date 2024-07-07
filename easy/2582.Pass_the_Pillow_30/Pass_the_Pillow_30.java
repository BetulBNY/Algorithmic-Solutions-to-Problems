/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 * 2582. Pass the Pillow
 * 
 * There are n people standing in a line labeled from 1 to n. The first person in the line is holding a pillow initially. 
 * Every second, the person holding the pillow passes it to the next person standing in the line.
 * Once the pillow reaches the end of the line, the direction changes, and people continue passing the pillow in the opposite direction.
 * For example, once the pillow reaches the nth person they pass it to the n - 1th person, then to the n - 2th person and so on.
 * en the two positive integers n and time, return the index of the person holding the pillow after time seconds.

    Example 1:
    Input: n = 4, time = 5
    Output: 2
    Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
    After five seconds, the 2nd person is holding the pillow.

    Example 2:
    Input: n = 3, time = 2
    Output: 3
    Explanation: People pass the pillow in the following way: 1 -> 2 -> 3.
    After two seconds, the 3rd person is holding the pillow.

Constraints:
* 2 <= n <= 1000
* 1 <= time <= 1000  
 */
public class Pass_the_Pillow_30 {
    public static void main(String[] args) {
        int t = 5; // time
        int n = 4; // number of people
        System.out.println("The person holding the pillow after " + t + " seconds is: " + findPersonHoldingPillow(n, t));
    }

    public static int findPersonHoldingPillow(int n, int t) {
        int direction = 1; // 1 for forward, -1 for backward
        int person = 1; // first person

        while (t != 0) {
            person += direction; // send the pillow
            //System.out.println(person);
            if (person == n || person == 1) { // if at the end or beginning, change direction
                direction = -direction;
            }
            t--;
        }
        return person;
    }   
}