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
    public ListNode oddEvenList(ListNode head) {
        while(head==null || head.next==null)
            return head;
        ListNode oddHead=head;
        ListNode evenHead=head.next;
        ListNode tempOdd=head;
        ListNode tempEven=head.next;
        while(tempOdd.next!=null && tempOdd.next.next!=null){
            tempOdd.next=tempOdd.next.next;
            tempEven.next=tempEven.next.next;
            tempOdd=tempOdd.next;
            tempEven=tempEven.next;
        }
        tempOdd.next=evenHead;
        return oddHead;
    }
}