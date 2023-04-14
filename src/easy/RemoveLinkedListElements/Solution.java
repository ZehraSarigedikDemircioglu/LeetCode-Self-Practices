package easy.RemoveLinkedListElements;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        ListNode current = head;

        if (head == null) return null;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head.val == val ? head.next : head;
    }
}
/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that
has Node.val == val, and return the new head.
 */
