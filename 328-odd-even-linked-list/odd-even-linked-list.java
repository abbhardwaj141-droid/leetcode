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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        ListNode temp = head;
        int count = 1;
        while(temp != null) {
            if(count % 2 != 0) {
                ListNode t = new ListNode(temp.val);
                dummy.next = t;
                dummy = t;
            }
            temp = temp.next;
            count++;
        }
        temp = head;
        count = 1;
        while(temp != null) {
            if(count % 2 == 0) {
                ListNode t = new ListNode(temp.val);
                dummy.next = t;
                dummy = t;
            }
            temp = temp.next;
            count++;
        }
        dummy.next = null;
        return ans.next;
    }
}