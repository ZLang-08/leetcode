
// 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。

// 请你返回该链表所表示数字的 十进制值 。

//  

// 示例 1：



// 输入：head = [1,0,1]
// 输出：5
// 解释：二进制数 (101) 转化为十进制数 (5)
// 示例 2：

// 输入：head = [0]
// 输出：0
// 示例 3：

// 输入：head = [1]
// 输出：1
// 示例 4：

// 输入：head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
// 输出：18880

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
    public int getDecimalValue(ListNode head) {
        // List<Integer> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null) {
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // int n;
        // int res = 0;
        // for(int i = 0; i < list.size(); i++) {
        //     n = 1;
        //     if(list.get(i) == 1) {
        //         for(int j = 0; j < list.size() - i - 1; j++) {
        //             n *= 2;
        //         }
        //         res += n;
        //     }
        // }
        // return res;


        //官方
        ListNode temp = head;
        int res = 0;
        while(temp != null) {
            // res = res * 2 + temp.val;
            res = res << 1;
            res |= temp.val;
            temp = temp.next;
        }
        return res;
    }
}