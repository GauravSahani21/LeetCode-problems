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
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int count = 1;

        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        ListNode tail = temp;

        k = k % count;

        if (k == 0) {
            return head;
        }

        temp = head;

        for(int i=1; i<count-k; i++){
            temp = temp.next;
        }

        ListNode newHead = temp.next;

        temp.next =  null;
        tail.next =  head;

        return newHead;
    }
}