/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases like removing the first node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize two pointers, both starting at the dummy node
        ListNode first = dummy;
        ListNode second = dummy;

        // Move the first pointer n+1 steps ahead, so that there is a gap of n nodes
        // between first and second
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until the first pointer reaches the end of the list
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Now, second pointer is right before the node to be deleted
        second.next = second.next.next;

        // Return the head of the modified list
        return dummy.next;
    }

    // Helper method to print the linked list (optional, for testing purposes)
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}