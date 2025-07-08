package easy;
// Convert Binary Number in a Linked List to Integer
import static java.lang.Math.pow;
/**
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. 
 * The linked list holds the binary representation of a number. Return the decimal value of the number in the linked list.
 * The most significant bit is at the head of the linked list.
 * 
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 *
 * @author betus
 */
public class Convert_Binary_Number_in_Linked_List_to_Integer {
    
    static class ListNode {
        int val;
        ListNode next;
    }    
    public int getDecimalValue(ListNode head) {
        int arrsize = 0;
        ListNode current = head;

        // Finding the length of the linked list
        while(current != null) {
            arrsize++;
            current = current.next;
        }
        int sum = 0;
        int power = arrsize;

        // Calculating the decimal value
        current = head;

        for(int i = 0; i<arrsize; i++){
            sum += current.val * Math.pow(2, power - 1);
            power--;
            current = current.next;            
        }
        return sum;
    }  
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 1};
        ListNode head = createLinkedList(arr);
        
        Convert_Binary_Number_in_Linked_List_to_Integer converter = new Convert_Binary_Number_in_Linked_List_to_Integer();
        int result = converter.getDecimalValue(head);
        System.out.println("Solution with method: " +result);

        // Solution without method:
        int arrsize = arr.length;
        int sum = 0;
        int power = arrsize;
        for(int i = 0 ; i<arrsize; i++){
            sum += arr[i]*pow(2,power-1);
            power--;
        }        
        System.out.println("Solution without method: " + sum);
    }

    // Helper method to create a linked list from an array
    private static ListNode createLinkedList(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (int value : arr) {
            current.next = new ListNode();
            current.next.val = value;
            current = current.next;
        }

        return dummy.next;
    }
}
