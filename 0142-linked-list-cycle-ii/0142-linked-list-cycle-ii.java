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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
//         HashMap<ListNode,Integer> mp = new HashMap<ListNode,Integer>();
//         ListNode temp=head;
//         while(temp!=null){
//             if(mp.containsKey(temp))
//                 return temp;
            
//             mp.put(temp,1);
//             temp=temp.next;
//         }
//         return null;
        
        ListNode fast,slow;
        fast=slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}