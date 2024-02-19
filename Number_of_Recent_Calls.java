/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.LinkedList;
import java.util.Queue;
    
/**
 * Number of Recent Calls
 * 
 * You have a RecentCounter class which counts the number of recent requests within a certain time frame.
 * Implement the RecentCounter class:
 * RecentCounter() Initializes the counter with zero recent requests.
 * int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has
 * happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the 
 * inclusive range [t - 3000, t].
 * It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
 * 
 * Example 1:
 * Input
 * ["RecentCounter", "ping", "ping", "ping", "ping"]
 * [[], [1], [100], [3001], [3002]]
 * Output
 * [null, 1, 2, 3, 3]
 * Explanation
 * RecentCounter recentCounter = new RecentCounter();
 * recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
 * recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
 * recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
 * recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
 * @author betus
 */
public class Number_of_Recent_Calls {
    
    
    class RecentCounter {
        int counter =0;
        Queue<Integer> myQueue = new LinkedList();   
     
        public RecentCounter() {
        }
        
        public int ping(int t) {
            myQueue.add(t);            
            while(myQueue.peek() < t - 3000){
                myQueue.remove();   
            }
            return myQueue.size();
        }
    }
      
    /*
        RecentCounter rc = new RecentCounter();
    
        rc.ping(1);    //son 3000 mili saniye içerisinde (-2999 il 1 milisaniye zamanları arasında) kaç tane ping yollanmış
        rc.ping(100);  //son 3000 mili saniye içerisinde (-2900 ile 100 milisaniye zamanları arasında) kaç tane ping yollanmış
        rc.ping(3001);
        rc.ping(3002);
    */
    
}
