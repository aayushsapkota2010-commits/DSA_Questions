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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode curr=head;
        int size=0;
        ListNode prev=null;
    
        while(curr!=null)
        {
            size++;
            prev=curr;
            curr=curr.next;
        }

        int newK=k%size;
           if (newK == 0) {
            return head;
        }
        int diff=size-newK;

        int i=0;
        curr=head;
        while(i<diff-1)
        {
            curr=curr.next;
            i++;
        }
        ListNode newHead=curr.next;
        curr.next=null;
        prev.next=head;
        

        return newHead;

        
    }
}