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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryover=0;
        int sum=0;
        ListNode n=null; 
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        while(l1!=null || l2!=null){
            if(l1!=null)
                sum=sum+l1.val;
            if(l2!=null)
                sum=sum+l2.val;
            sum=sum+carryover;
            if(sum>9){
                n = new ListNode(sum%10);
                carryover=1;
            }
            else{
                n = new ListNode(sum);
                carryover=0;
            }
            temp.next=n;
            temp=n;
            sum=0;
            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;
        }
        if(carryover==1){
            n = new ListNode(1);
            temp.next=n;
            temp=n;
        }
        return head.next;
    }
}