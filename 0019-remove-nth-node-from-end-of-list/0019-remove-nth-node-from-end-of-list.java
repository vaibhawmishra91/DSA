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
        if(head==null ) return head;

     ListNode first=head;
     ListNode second=head; 
    //  ListNode prev=null;

     for(int i=0;i<n;i++){
        second=second.next;
     }
// If second becomes null, remove the head 
    if (second == null) { 
    return head.next;
     }
     
     while(second.next!=null){
        first=first.next;
        second=second.next;
        }

     first.next=first.next.next;
     return head;
    }
}