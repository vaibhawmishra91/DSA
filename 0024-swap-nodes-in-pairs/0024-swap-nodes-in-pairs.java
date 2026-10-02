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
    public ListNode swapPairs(ListNode head) {
    
    if(head==null ||head.next==null ) return head;

    ListNode a=head;
    ListNode b=head.next;
    head=b;
    ListNode prev=null;
    while(a!=null && a.next!=null){

        a.next=b.next;
        b.next=a;
        // for first iterration prev is null so prev.next gives error
        if(prev != null)
                prev.next = b;
       
        prev=a;
        a=a.next;//b/s possibility that a become null so if a.next gives error
        if(a != null) b = a.next;
                

    }
     return head;
    }
}