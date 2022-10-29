
// 给你一个整数数组 nums 和一个整数 k ，请你返回数对 (i, j) 的数目，满足 i < j 且 |nums[i] - nums[j]| == k 。

// |x| 的值定义为：

// 如果 x >= 0 ，那么值为 x 。
// 如果 x < 0 ，那么值为 -x 。
//  

// 示例 1：

// 输入：nums = [1,2,2,1], k = 1
// 输出：4
// 解释：差的绝对值为 1 的数对为：
// - [1,2,2,1]
// - [1,2,2,1]
// - [1,2,2,1]
// - [1,2,2,1]
// 示例 2：

// 输入：nums = [1,3], k = 3
// 输出：0
// 解释：没有任何数对差的绝对值为 3 。
// 示例 3：

// 输入：nums = [3,2,1,5,4], k = 2
// 输出：3
// 解释：差的绝对值为 2 的数对为：
// - [3,2,1,5,4]
// - [3,2,1,5,4]
// - [3,2,1,5,4]



class Solution {
    public int countKDifference(int[] nums, int k) {
        int len = nums.length;
        int res = 0;
        //方法一：暴力
        // for(int i = 0; i < len; i++) {
        //     for(int j = i + 1; j < len; j++) {
        //         if(Math.abs(nums[i] - nums[j]) == k) {
        //             res++;
        //         }
        //     }
        // }
        //方法二： hash表
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            //getOrDefault(key, default)如果有找key 则返回他的value 否则返回默认值default
            res += map.getOrDefault(nums[i] - k, 0) + map.getOrDefault(nums[i] + k, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);//注意有相同的值时这里会有替换
        }
        

        return res;
    }
}