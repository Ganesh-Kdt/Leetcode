/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // ListNode temp=head;
        // if(head==null || head.next==null)
        //     return false;
        // HashMap<ListNode,Integer> mp = new HashMap<>();
        // while(temp!=null){
        // if(!mp.containsKey(temp))
        //     mp.put(temp,1);
        // else
        //     return true;
        //     temp=temp.next;
        // }
        // return false;
        
        if(head==null || head.next==null)
            return false;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}