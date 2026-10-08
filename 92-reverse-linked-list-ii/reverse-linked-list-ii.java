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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //No elements in linklist
        if(head == null)
        return null;

        //left == right , no reversing needed 
        if(left==right)
        return head;

        //else
        ListNode temp = head ;
        ListNode before = temp;
        int pos = 1;
        while(pos < left)
        {
            before = temp ;
            temp = temp.next;
            pos++;
        } 
        int times = right - left + 1;
        ListNode prev = null ;
        ListNode curr = temp ;
        while(times > 0)
        {
            ListNode nex = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = nex;
            times--;
        }
        if(left == 1)
        {
            head = prev;
        }
        else
        {
          before.next = prev;
        }
        temp.next = curr ;

     return head;   
    }
}