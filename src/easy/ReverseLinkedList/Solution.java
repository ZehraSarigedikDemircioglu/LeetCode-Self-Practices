package easy.ReverseLinkedList;

public class Solution {

    public static void main(String[] args) {


    }

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;//change the direction of current to prev
            prev = current;//move prev to right to current
            current = nextNode;//move current to right on the next node
        }
        return prev;
    }
}
/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
