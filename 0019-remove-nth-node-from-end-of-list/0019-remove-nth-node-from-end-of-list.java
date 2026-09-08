class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        count = count - n;

        if (count == 0) {
            return head.next;
        }

        temp = head;
        for (int i = 1; i < count; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}