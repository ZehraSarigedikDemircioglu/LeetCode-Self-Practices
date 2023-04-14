package easy.RemoveDuplicatesFromSortedList;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while(current != null) {
            if (current.next == null) {
                break;
            }
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
/*
Given the head of a sorted linked list, delete all duplicates such that
each element appears only once. Return the linked list sorted as well.
 */
