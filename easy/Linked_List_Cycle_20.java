/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/** Linked List Cycle
 * 
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.

 
 * @author betus
 */
public class Linked_List_Cycle_20 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Linked_List_Cycle_20 solution = new Linked_List_Cycle_20();

        // Creating the linked list: [3, 2, 0, -4]
        ListNode head = solution.new ListNode(3);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(0);
        head.next.next.next = solution.new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle, connecting the last node to the second node

        // Check 
        boolean hasCycle = solution.hasCycle(head);
        System.out.println(hasCycle); // Output is true
               
        // Example for negative
        /*
        Linked_List_Cycle_20 solution = new Linked_List_Cycle_20();

        // Creating the linked list: 
        ListNode head = solution.new ListNode(1);

        // Check if there is a cycle
        boolean hasCycle = solution.hasCycle(head);

        System.out.println(hasCycle); // Output is false
        */
                
    }
}
