// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         if(head == null || head.next == null) return head;

//         ListNode dummy = new ListNode();
//         ListNode ans = dummy;
//         ListNode temp = head;
//         int count = 1;
//         while(temp != null) {
//             if(count % 2 != 0) {
//                 ListNode t = new ListNode(temp.val);
//                 dummy.next = t;
//                 dummy = t;
//             }
//             temp = temp.next;
//             count++;
//         }
//         temp = head;
//         count = 1;
//         while(temp != null) {
//             if(count % 2 == 0) {
//                 ListNode t = new ListNode(temp.val);
//                 dummy.next = t;
//                 dummy = t;
//             }
//             temp = temp.next;
//             count++;
//         }
//         dummy.next = null;
//         return ans.next;
//     }
// }
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}