class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    public MyLinkedList() {
        head = new ListNode(0);
        tail = new ListNode(0);

        head.next = tail;
        tail.prev = head;

        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode curr;

        // Traverse from head
        if (index < size / 2) {
            curr = head.next;

            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
        }
        // Traverse from tail
        else {
            curr = tail.prev;

            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        ListNode node = new ListNode(val);

        // Insert before the node currently at index
        ListNode pred;
        ListNode succ;

        if (index < size / 2) {
            // Find predecessor from head
            pred = head;

            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }

            succ = pred.next;
        } else {
            // Find successor from tail
            succ = tail;

            for (int i = size; i > index; i--) {
                succ = succ.prev;
            }

            pred = succ.prev;
        }

        node.prev = pred;
        node.next = succ;

        pred.next = node;
        succ.prev = node;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        ListNode curr;

        // Find node to delete
        if (index < size / 2) {
            curr = head.next;

            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
        } else {
            curr = tail.prev;

            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
        }

        // Remove curr
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        size--;
    }
}
