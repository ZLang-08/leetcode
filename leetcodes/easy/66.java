// 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

// 你可以假设除了整数 0 之外，这个整数不会以零开头。
// 示例 1：

// 输入：digits = [1,2,3]
// 输出：[1,2,4]
// 解释：输入数组表示数字 123。
// 示例 2：

// 输入：digits = [4,3,2,1]
// 输出：[4,3,2,2]
// 解释：输入数组表示数字 4321。
// 示例 3：

输入：digits = [0]
输出：[1]


class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        // for(int i = 0, n = 1; i < len; i++, n *= 10) {
        //     // res += res * 10 +  digits[i];
        //     res += digits[len - i - 1] * n ;
        // }
        // // int res1 = res + 1;
        // res++;
        // int len1 = (res + "").length();
        // int[] arr = new int[len1];
        // for(int i = 0; i < len1; i++) {
        //     arr[len1 - i - 1] = res % 10;
        //     res /= 10;
        // }
        // return arr;
        // double d = 0;
        // for(int i = 1; i < 1000; i++) {
        //     d += 1 / i;
        // }
        //数组长度100不能用加法

        // for(int i = len - 1; i >= 0; i--) {
        //     if(digits[i] != 9) {
        //         digits[i]++;
        //         for(int j = i + 1; j < len; j++) {
        //             digits[j] = 0;
        //         }
        //         return digits;
        //     }
        // }

        // int[] res = new int[len + 1];
        // res[0] = 1;
        // return res;

        for(int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0) {
                return digits;
            }
        }
        int[] arr = new int[len + 1];
        arr[0] = 1;
        return arr;
    }
}