// 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 
// 输入：nums = [1,1,2]
// 输出：2, nums = [1,2,_]
// 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。


class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int cur = nums[0];
        int index = 0;
        for(int i = 1; i < len; i++) {
            if(cur != nums[i]) {
                cur = nums[i];
                nums[++index] = nums[i];
            }
        }
        return index + 1;

    }
}