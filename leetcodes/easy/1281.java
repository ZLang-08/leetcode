// 1281 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。

//  

// 示例 1：

// 输入：n = 234
// 输出：15 
// 解释：
// 各位数之积 = 2 * 3 * 4 = 24 
// 各位数之和 = 2 + 3 + 4 = 9 
// 结果 = 24 - 9 = 15


class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        int temp = n;
        while(temp != 0) {
            sum += temp % 10;
            mul *= temp % 10;
            temp /= 10;
        }
        return mul - sum;
    }
}