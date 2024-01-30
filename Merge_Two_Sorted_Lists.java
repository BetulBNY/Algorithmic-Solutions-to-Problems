/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * @author betus
 */
public class Merge_Two_Sorted_Lists {
    
 // 2 Way to solve it:
 // 1) Brute Force : MErge 2 list in an array. After that sort them in array and convert it linked list.
 // 2)    
// Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
        
 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedNode = new ListNode(-1);
    ListNode headNode = mergedNode;
    
    while (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
            mergedNode.next = list1;
            list1 = list1.next;   // jump to next element of list
        } else {
            mergedNode.next = list2;
            list2 = list2.next;   // move pointer
        }
        mergedNode = mergedNode.next;
    }

    if (list1 == null) {
        mergedNode.next = list2;
    } else if (list2 == null) {
        mergedNode.next = list1;
    }

    return headNode.next;
}
        
 public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Merge 2 lists
        ListNode mergedList = mergeTwoLists(list1, list2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
       
}
