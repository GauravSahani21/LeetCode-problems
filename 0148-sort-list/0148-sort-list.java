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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            arr.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(arr);

        int i  =0;
        temp=head;

        while(i<count){
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }
}