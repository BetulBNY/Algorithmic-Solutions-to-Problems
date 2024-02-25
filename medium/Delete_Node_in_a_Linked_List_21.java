/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/** Delete Node in a Linked List
 *
 * There is a singly-linked list head and we want to delete a node node in it.
 * You are given the node to be deleted node. You will not be given access to the first node of head.
 * All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
 * Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
 * 
 * The value of the given node should not exist in the linked list.
 * The number of nodes in the linked list should decrease by one.
 * All the values before node should be in the same order.
 * All the values after node should be in the same order.
 * 
 * 
 * Custom testing:
 * For the input, you should provide the entire linked list head and the node to be given node.
 * node should not be the last node of the list and should be an actual node in the list.
 * We will build the linked list and pass the node to your function.
 * output will be the entire list after calling your function.
 * @author betus
 */
public class Delete_Node_in_a_Linked_List_21 {
    
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    public static void main(String[] args) {
        // head = [4,5,1,9], node = 5
        Delete_Node_in_a_Linked_List_21 myList = new Delete_Node_in_a_Linked_List_21();
        ListNode head = myList.new ListNode(4);
        head.next = myList.new ListNode(5);
        ListNode node = head.next;
        head.next.next = myList.new ListNode(1); 
        head.next.next.next = myList.new ListNode(9); 
        
        // Traverse and print the linked list
        Delete_Node_in_a_Linked_List_21.ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        
        System.out.println("\n After Deletion:");
        // After deletion process
        deleteNode(node);
                
        current = head; // Reset current pointer to the head
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        
    }
    
}
