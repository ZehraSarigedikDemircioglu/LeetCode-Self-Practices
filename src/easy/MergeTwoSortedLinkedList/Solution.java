package easy.MergeTwoSortedLinkedList;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode tempHead = new ListNode();
        ListNode prev = tempHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            }else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        if (list1 == null){
            prev.next = list2;
        }else{
            prev.next = list1;
        }
        return tempHead.next;
    }
}
/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */
