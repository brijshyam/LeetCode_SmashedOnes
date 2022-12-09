/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB == null) return null;
        int lenA= length(headA);
        int lenB=length(headB);
        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
        while(lenB>lenA){
            headB=headB.next;
            lenB--;
        }
       while(headA!=headB){
           headA=headA.next; 
           headB= headB.next;
       }
        return headA;
    }
    
    public int length(ListNode head){
        int size=0; 
        while(head!=null){
            head= head.next;
            size++;
        }
        return size;
        
    }
}