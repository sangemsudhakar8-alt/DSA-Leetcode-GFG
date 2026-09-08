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
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);
        ListNode curr = head;
        int maxval=curr.val;
        while(curr !=null && curr.next!=null){
            if(curr.next.val<maxval){
                curr.next = curr.next.next;
            }else{
            maxval=curr.next.val;
            curr=curr.next;
            }
        }
    return reverseList(head);    
    }
    private ListNode reverseList(ListNode head){
        ListNode prev =null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nexttemp=curr.next;
            curr.next=prev;
            prev =curr;
            curr=nexttemp;
        }
        return prev;
    }
}