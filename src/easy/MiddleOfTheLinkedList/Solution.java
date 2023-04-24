package easy.MiddleOfTheLinkedList;

public class Solution {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next; // single jump
            fast = fast.next.next; // double jump
        }
        if(fast.next == null){
            return slow;
        }else{
            return slow.next;
        }
    }
}
/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
 */
