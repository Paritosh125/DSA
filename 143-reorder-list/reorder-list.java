
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        ListNode beforeSlow = null;

        while (fast != null && fast.next != null) {
            beforeSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;

        while (curr != null) {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }

        ListNode start = head;
        ListNode reverse = prev;

        while (reverse != null && start != null) {
            ListNode nextStart = start.next;
            ListNode nextReverse = reverse.next;

            start.next = reverse;
            reverse.next = nextStart;

            start = nextStart;
            reverse = nextReverse;
        }
    }
}
