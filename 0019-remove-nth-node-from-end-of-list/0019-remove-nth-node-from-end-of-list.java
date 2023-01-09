/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode prevToDelete = head;
    ListNode NthFromStart = head;
    for (int i = 0; i < n; i++) {
        if (NthFromStart.next == null) {
            if (i == n - 1)
                head = head.next;
            return head;
        }
        NthFromStart = NthFromStart.next;
    }
    // Incrementing both the pointer till both one reaches end
    while (NthFromStart.next != null) {
        prevToDelete = prevToDelete.next;
        NthFromStart = NthFromStart.next;
    }
    // changing the reference of prior to delete to next to next
    prevToDelete.next = prevToDelete.next.next;
    
    return head;
        
    }
}