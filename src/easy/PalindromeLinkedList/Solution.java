package easy.PalindromeLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();
        ListNode current = head;

        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        current = head;

        while (current != null && !stack.isEmpty()) {
            if (current.val != stack.pop()) {
                return false;
            } else {
                current = current.next;
            }
        }
        return true;
    }
}
