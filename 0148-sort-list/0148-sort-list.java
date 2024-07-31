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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
//         ListNode outerTemp=head;
//         while(outerTemp!=null){
//             ListNode innerTemp=outerTemp;
//             while(innerTemp!=null){
//                 if(innerTemp.val<outerTemp.val){
//                     int temp=innerTemp.val;
//                     innerTemp.val=outerTemp.val;
//                     outerTemp.val=temp;
//                 }
//                 innerTemp=innerTemp.next;
//             }
//             outerTemp=outerTemp.next;
//         }
        
//         return head;
        ListNode temp=head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        temp=head;
        for(int i=0;i<=arr.size()-1;i++){
            temp.val=arr.get(i);
            temp=temp.next;
        }
        return head;
    }
}