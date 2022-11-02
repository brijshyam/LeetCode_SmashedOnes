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
    public ListNode deleteDuplicates(ListNode head) {
        if( head != null && head.next != null) {            
            if(head.next.val != head.val) {
                head.next = deleteDuplicates(head.next);
            } else {
                while(head.next != null && head.val == head.next.val)
                    head = head.next;
                return deleteDuplicates(head.next);
            }
        }
        return head;
    }
}