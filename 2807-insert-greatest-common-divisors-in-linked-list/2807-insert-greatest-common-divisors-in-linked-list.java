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
    int gcd(int a, int b){
        while(b != 0){
            int temp = b; 
            b = a%b;
            a = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        List<Integer> l = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            l.add(temp.val);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        temp = dummy;

        for(int i=0; i<l.size(); i++){

            temp.next = new ListNode(l.get(i));
            temp = temp.next;

            if(i< l.size()-1){
                temp.next = new ListNode(gcd(l.get(i), l.get(i+1)));
                temp = temp.next;
            }
        }

        return dummy.next;

    }
}