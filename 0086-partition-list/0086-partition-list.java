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
    public ListNode partition(ListNode head, int x) {
        ListNode sdummy = new ListNode(0);
        ListNode ldummy = new ListNode(0);
        ListNode first = sdummy;
        ListNode second = ldummy;
        ListNode temp = head;
        while(temp != null){
            if(temp.val< x){
               first.next = temp;
               first = first.next;
            }else{
                second.next = temp;
                second = second.next;
            }
            temp = temp.next;
        }
        second.next=null;
        first.next=ldummy.next;
    return sdummy.next;    
    }
}