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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        Collections.reverse(arr);

        ListNode result = new ListNode(0);
        ListNode temp2 = result;

        for (int i = 0; i < arr.size(); i++) {
            temp2.next = new ListNode(arr.get(i));
            temp2 = temp2.next;
        }

        return result.next;
    }
}