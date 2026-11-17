class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null)return head;
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        int con = (count / 2);
        temp = head;
        int scount = 0;
        for (int i = 0; i < count; i++) {
            scount++;
            if (scount == con) {
                temp = temp.next;
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}