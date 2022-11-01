
// nums1 中数字 x 的 下一个更大元素 是指 x 在 nums2 中对应位置 右侧 的 第一个 比 x 大的元素。

// 给你两个 没有重复元素 的数组 nums1 和 nums2 ，下标从 0 开始计数，其中nums1 是 nums2 的子集。

// 对于每个 0 <= i < nums1.length ，找出满足 nums1[i] == nums2[j] 的下标 j ，并且在 nums2 确定 nums2[j] 的 下一个更大元素 。如果不存在下一个更大元素，那么本次查询的答案是 -1 。

// 返回一个长度为 nums1.length 的数组 ans 作为答案，满足 ans[i] 是如上所述的 下一个更大元素 。

//  

// 示例 1：

// 输入：nums1 = [4,1,2], nums2 = [1,3,4,2].
// 输出：[-1,3,-1]
// 解释：nums1 中每个值的下一个更大元素如下所述：
// - 4 ，用加粗斜体标识，nums2 = [1,3,4,2]。不存在下一个更大元素，所以答案是 -1 。
// - 1 ，用加粗斜体标识，nums2 = [1,3,4,2]。下一个更大元素是 3 。
// - 2 ，用加粗斜体标识，nums2 = [1,3,4,2]。不存在下一个更大元素，所以答案是 -1 。
// 示例 2：

// 输入：nums1 = [2,4], nums2 = [1,2,3,4].
// 输出：[3,-1]
// 解释：nums1 中每个值的下一个更大元素如下所述：
// - 2 ，用加粗斜体标识，nums2 = [1,2,3,4]。下一个更大元素是 3 。
// - 4 ，用加粗斜体标识，nums2 = [1,2,3,4]。不存在下一个更大元素，所以答案是 -1 。
//  

// 提示：

// 1 <= nums1.length <= nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 104
// nums1和nums2中所有整数 互不相同
// nums1 中的所有整数同样出现在 nums2 中
//  

// 进阶：你可以设计一个时间复杂度为 O(nums1.length + nums2.length) 的解决方案吗？

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //方法一、暴力
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ans = new int[len1];
        // for(int i = 0; i < len1; i++) {
        //     for(int j = 0; j < len2; j++) {
        //         if(nums1[i] == nums2[j]) {
        //             for(int k = j + 1; k < len2; k++) {
        //                 if(nums2[j] < nums2[k]) {
        //                     ans[i] = nums2[k];
        //                     break;
        //                 }
        //                 ans[i] = -1;
        //             }
        //             if(j == len2 - 1) {
        //                 ans[i] = -1;
        //             }
        //         }
        //     }
        // }
        // return ans;
        //11%
        // 暴力方法优化
        // for(int i = 0; i < len1; i++) {
        //     int j = 0;
        //     while(j < len2 && nums1[i] != nums2[j]) {
        //         j++;
        //     }
        //     int k = j + 1;
        //     while(k < len2 && nums2[k] < nums2[j]) {
        //         k++;
        //     }

        //     ans[i] = k < len2 ? nums2[k] : -1;
        // }
        // return ans;
        //88%
        //做题时多想想时间复杂度
        //方法二、hash表 + 单调栈
        // Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < len2; i++) {
            while(!stack.isEmpty() && nums2[i] > stack.peek()) {
                // stack.add(nums2[i]);
                map.put(stack.pop(), nums2[i]);
            } 
            stack.push(nums2[i]);
        }

        // while(stack.size() > 0) {
        //     map.put(stack.pop(), -1);
        // }
        for(int i = 0; i < len1; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
        // int len1 = nums1.length;
        // int len2 = nums2.length;
        // int[] ans = new int[len2];
        // int index = 0;
        // for(int i = 0; i < )
    }
}