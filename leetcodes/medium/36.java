// 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。

// 如果数组中不存在目标值 target，返回 [-1, -1]。

// 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。

//  

// 示例 1：

// 输入：nums = [5,7,7,8,8,10], target = 8
// 输出：[3,4]
// 示例 2：

// 输入：nums = [5,7,7,8,8,10], target = 6
// 输出：[-1,-1]


class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left = binarySreach(nums, target);
       if(left == nums.length || nums[left] != target) {
           return new int[]{-1, -1};
       }
       int right = binarySreach(nums, target + 1) - 1;
       return new int[]{left, right};

    }

    public int binarySreach(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r) {
            int mid = l + ((r - l) >> 1);
            if(arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}