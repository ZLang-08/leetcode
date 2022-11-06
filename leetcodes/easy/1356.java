// 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。

// 如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。

// 请你返回排序后的数组。

//  

// 示例 1：

// 输入：arr = [0,1,2,3,4,5,6,7,8]
// 输出：[0,1,2,4,8,3,5,6,7]
// 解释：[0] 是唯一一个有 0 个 1 的数。
// [1,2,4,8] 都有 1 个 1 。
// [3,5,6] 有 2 个 1 。
// [7] 有 3 个 1 。
// 按照 1 的个数排序得到的结果数组为 [0,1,2,4,8,3,5,6,7]
// 示例 2：

// 输入：arr = [1024,512,256,128,64,32,16,8,4,2,1]
// 输出：[1,2,4,8,16,32,64,128,256,512,1024]
// 解释：数组中所有整数二进制下都只有 1 个 1 ，所以你需要按照数值大小将它们排序。

class Solution {
    public int[] sortByBits(int[] arr) {
        // int len = arr.length;
        // int temp；
        // //这里是冒泡的思路,还可以更快
        // for(int j = 0; j < len - 1; j++) {
        //     for(int i = 0; i < len - 1 - j; i++) {
        //         if(numOfOne(arr[i]) > numOfOne(arr[i + 1])) {
        //             temp = arr[i];
        //             arr[i] = arr[i + 1];
        //             arr[i + 1] = temp;
        //         } else if(numOfOne(arr[i]) == numOfOne(arr[i + 1])) {
        //             if(arr[i] > arr[i + 1]) {
        //                 temp = arr[i];
        //                 arr[i] = arr[i + 1];
        //                 arr[i + 1] = temp;
        //             }
        //         }
        //     }
        // }
        // return arr;



        //大佬的做法

        int len = arr.length;
        int[] count = new int[len];
        for(int i = 0; i < len; i++) {
            count[i] = numOfOne(arr[i]) * 10000000 + arr[i];
        }
        Arrays.sort(count);
        for(int i = 0; i < len; i++) {
            count[i] = count[i] % 10000000;
        }

        return count;
    }

    public int numOfOne(int n) {
        int res = 0;
        while(n > 0) {
            if(n % 2 == 1) {
                res++;
            }
            n /= 2;
        }
        // int i = 0;
        // while(i < 16) {
        //     if(n & (1 << i) == 1) {
        //         res++;
        //     }
        //     i++;
        // }
        // if(n & i >> 1 == 1) {
        //     res++;
        // }
        return res;
    }
}