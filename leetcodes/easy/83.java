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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        while(cur.next != null) {
            if(cur.next.val == cur.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
        // ListNode l = head;
        // ListNode r = head.next;
        // while(r != null ) {
        //     while(r != null && l.val == r.val) {
        //         r = r.next;
        //     }
        //     l.next = r;
        //     l = r;
        //     r = r != null ? r.next : null;
        // }
        // return head;
        
    }
}