class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        k = k % count;
        if (k == 0) return head;
        temp = head;
        for (int i = 0; i < count - k - 1; i++) {
            temp = temp.next;
        }

        ListNode agla = temp.next;
        temp.next = null;
        ListNode Agla = agla;
        while (Agla.next != null) {
            Agla = Agla.next;
        }

        Agla.next = head;
        return agla;
    }
}