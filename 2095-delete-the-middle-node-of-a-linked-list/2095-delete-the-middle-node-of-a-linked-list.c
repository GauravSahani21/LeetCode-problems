/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {

    if (head == NULL)
        return NULL;

    if (head->next == NULL) {
        free(head);
        return NULL;
    }

    struct ListNode* temp = head;
    int count = 0;

    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    int n = count / 2;

    temp = head;

    for (int i = 0; i < n - 1; i++) {
        temp = temp->next;
    }

    struct ListNode* temp2 = temp->next;

    temp->next = temp->next->next;

    free(temp2);

    return head;
}