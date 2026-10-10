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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
        return head ;
        ListNode temp = head ;
        int count = 0 ;

        while(temp != null)
        {
            temp = temp.next ; 
            count++;
        }
        int i = 0;
        temp = head ;
        ListNode prev = null;
        k = k % count;

        if (k == 0)
            return head;
        while ( i < count - k)
        {
            prev = temp ;
            temp = temp.next ;
            i++;
        }
        ListNode res = temp;
        ListNode temp2 = temp;
        while(temp2.next != null)
        {
            temp2 = temp2.next;
        }
        temp2.next = head ;
        prev.next= null ;
        return res ;
    }
}