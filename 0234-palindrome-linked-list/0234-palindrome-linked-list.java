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
    public boolean isPalindrome(ListNode head) {
        ListNode first =head;
        ListNode second = head;
        while(second != null && second.next != null){
            first =first.next;
            second = second.next.next;
        }
        ListNode prev =null;
        ListNode curr = first;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        ListNode slow = head;
        ListNode fast = prev;
        while(fast != null){
            if(slow.val != fast.val){
                return false;
            }
            fast=fast.next;
            slow = slow.next;
        }
        return true;
    }
}