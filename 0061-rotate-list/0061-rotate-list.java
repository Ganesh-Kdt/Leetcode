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
           return head;
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int n=k%size;
        if(k%size==0)
            return head;
        int index=size-n;
        ListNode newHead=head;
        ListNode prev=null;
        while(index>0){
            prev=newHead;
            newHead=newHead.next;
            index--;
        }
        temp=newHead;
        while(n>0){
            if(temp.next==null)
                temp.next=head;
            temp=temp.next;
            n--;
        }
        prev.next=null;
        return newHead;
    }
}