// 如果数组是单调递增或单调递减的，那么它是 单调 的。

// 如果对于所有 i <= j，nums[i] <= nums[j]，那么数组 nums 是单调递增的。 如果对于所有 i <= j，nums[i]> = nums[j]，那么数组 nums 是单调递减的。

// 当给定的数组 nums 是单调数组时返回 true，否则返回 false。

//  

// 示例 1：

// 输入：nums = [1,2,2,3]
// 输出：true
// 示例 2：

// 输入：nums = [6,5,4,4]
// 输出：true
// 示例 3：

// 输入：nums = [1,3,2]
// 输出：false



class Solution {
    public boolean isMonotonic(int[] nums) {
        int increaNum = 0;
        int downNum = 0;
        int len = nums.length;
        // for(int i = 0; i < len - 1; i++) {
        //     if(nums[i] <= nums[i + 1]) {
        //         increaNum++;
        //     } 
        //     if(nums[i] >= nums[i + 1]) {
        //         downNum++;
        //     }
        //     //不要用if else if 可以少一个判断==的语句
        //     // } else {
        //     //     downNum++;
        //     //     increaNum++;
        //     // }
        // }
        // return downNum == len - 1 || increaNum == len - 1;



        //官方
        boolean flag1 = true;
        boolean flag2 = true;
        for(int i = 0; i < len - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                flag1 = false;
            }
            if(nums[i] < nums[i + 1]) {
                flag2 = false;
            }
        }
        return flag1 || flag2;
    }
}