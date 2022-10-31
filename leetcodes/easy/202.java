
// 编写一个算法来判断一个数 n 是不是快乐数。

// 「快乐数」 定义为：

// 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
// 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
// 如果这个过程 结果为 1，那么这个数就是快乐数。
// 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。

//  

// 示例 1：

// 输入：n = 19
// 输出：true
// 解释：
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
// 示例 2：

// 输入：n = 2
// 输出：false


class Solution {
    public boolean isHappy(int n) {
        //方法一、不建议,集合可能会满
        // Set<Integer> set = new HashSet<>();
        // while(n != 1) {
        //     n = squareSum(n);
        //     if(!set.add(n)) {
        //         return false;
        //     }
        // }
        // return true;

        //方法二、快慢指针,为什么循环判断条件是快慢指针是否相等,因为在还环里面走，快的迟早会追上慢的,
        int fast = n;
        int slow = n;
        do {
            slow = squareSum(slow);
            fast = squareSum(fast);
            fast = squareSum(fast);
        } while(slow != fast);
        return fast == 1;
    }

    public int squareSum(int n) {
        int sum = 0;
        int temp = 0;
        while(n != 0) {
            temp = n % 10;
            sum += Math.pow(temp, 2);
            n /= 10;
        }
        return sum;
    }
}