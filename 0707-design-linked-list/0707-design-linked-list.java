class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node temp = head;

        while (index > 0) {
            if (temp == null) {
                return -1;
            }

            temp = temp.next;
            index--;
        }

        if (temp == null) {
            return -1;
        }

        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    public void addAtIndex(int index, int val) {
        Node node = new Node(val);

        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }

        temp.next = temp.next.next;
    }
}