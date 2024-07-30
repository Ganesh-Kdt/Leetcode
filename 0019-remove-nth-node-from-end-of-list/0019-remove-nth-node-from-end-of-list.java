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
        
        ListNode temp=head;
        int size=0;
        
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        int index=size-n-1;
        if(index<0){
            head=head.next;
            return head;
        }
            
        temp=head;
        while(index>0){
            temp=temp.next;  
            index--;
        }
        temp.next=temp.next.next;
        return head;
        
    }
}