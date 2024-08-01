/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        HashMap<ListNode,Integer>mp = new HashMap<>();
        while(tempB!=null){
            mp.put(tempB,1);
            tempB=tempB.next;
        }
        while(tempA!=null){
            if(mp.containsKey(tempA))
                return tempA;
            tempA=tempA.next;
        }
        return null;
    }
}