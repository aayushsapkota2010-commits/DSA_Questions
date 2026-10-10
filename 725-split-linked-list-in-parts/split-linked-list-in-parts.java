class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];

        int n = 0;
        ListNode curr = head;

        while (curr != null) {
            n++;
            curr = curr.next;
        }

        int base = n / k;
        int extra = n % k;

        curr = head;

        for (int i = 0; i < k; i++) {
            res[i] = curr;

            int size = base + (i < extra ? 1 : 0);

            for (int j = 0; j < size - 1; j++) {
                curr = curr.next;
            }

            if (curr != null) {
                ListNode nextPart = curr.next;
                curr.next = null;
                curr = nextPart;
            }
        }

        return res;
    }
}