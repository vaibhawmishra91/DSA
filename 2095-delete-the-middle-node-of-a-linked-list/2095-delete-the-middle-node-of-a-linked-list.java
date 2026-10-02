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
    public ListNode deleteMiddle(ListNode head) {

       if(head == null || head.next == null) return null;
            // head.next == null ,base case if ll have only one node;
        ListNode slow=head;
        ListNode fast=head;
         // prev will store the node before slow
        ListNode prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;

        return head;
    }
}