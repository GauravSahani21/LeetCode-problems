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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }

        StringBuilder s = new StringBuilder();

        for(int i=0; i<arr.size(); i++){
            s.append(arr.get(i));
        }

        return Integer.parseInt(s.toString(), 2);
    }
}