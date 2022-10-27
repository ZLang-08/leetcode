/*
给你一个整数数组 nums 。

如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。

返回好数对的数目。

示例 1：

输入：nums = [1,2,3,1,1,3]
输出：4
解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
示例 2：

输入：nums = [1,1,1,1]
输出：6
解释：数组中的每组数字都是好数对
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int len = nums.length;
        // Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        // for(int i = 0; i < len; i++) {
        //     if(map.containsKey(nums[i])) {
        //         count += 1;
        //     }
        //     map.put(nums[i], i);
        // }
        // if(map.containsKey(nums[len - 1])) {
        //     count += 1;
        // }
        // for(int i = 0; i < len - 1; i++) {
        //     for(int j = i + 1; j < len; j++) {
        //         if(nums[i] == nums[j]) {
        //             count += 1;
        //         }
        //     }
        // }
        int[] temp = new int[101];
        for(int num : nums) {
            count += temp[num - 1];
            temp[num - 1] += 1;
        }
        return count;
    }
}