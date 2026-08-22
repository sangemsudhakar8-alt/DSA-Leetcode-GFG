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
        ListNode temp = headA;
        ListNode temp1 = headB;
        int n1 =0;
        int n2 =0;
        while(temp != null){
            n1++;
            temp = temp.next;
        }
        while(temp1 != null){
            n2++;
            temp1 = temp1.next;
        }
        if(n1<n2){
            return collisonPoint(headA,headB,n2-n1);
        }else{
            return collisonPoint(headB,headA,n1-n2);
        }    
    }
    private ListNode collisonPoint(ListNode t1, ListNode t2, int d){
        while(d>0){
            d--;
            t2 = t2.next;
        }
        while(t1 !=t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}