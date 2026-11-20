// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         if(head == null || head.next == null) return head;
//         ListNode odd = head;
//         while(odd != null && odd.next != null) {
//             ListNode even = odd.next;
//             int temp = odd.val;
//             odd.val = even.val;
//             even.val = temp;
//             odd = even.next;
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;
        }
        return dummy.next;
    }
}