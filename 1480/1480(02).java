/**
 *我自己写的,没有想到可以在原数组直接整的快速算法 
 */
class Solution {
    public int[] runningSum(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        int[] res = new int[len];
        map.put(0, nums[0]);
        res[0] = nums[0];
        for(int i = 1; i < len; i++) {
            map.put(i, nums[i] + map.get(i - 1));
            res[i] = map.get(i); 
        }
        return res;
    }
}