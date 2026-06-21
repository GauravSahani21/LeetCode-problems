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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }

        arr.remove(arr.size() - n);

        ListNode temp2 = new ListNode(0);
        ListNode t = temp2;

        for(int i=0; i<arr.size(); i++){
            t.next = new ListNode(arr.get(i));
            t = t.next;
        }
        return temp2.next;
    }
}