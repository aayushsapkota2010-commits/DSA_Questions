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
        ListNode phead=new ListNode(0);
        phead.next=head;
        ListNode curr=head;
        int size=0;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        int diff=size-n;

        ListNode temp=phead;
        for(int i=0;i<diff;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return phead.next;
    }
}