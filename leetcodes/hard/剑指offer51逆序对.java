//第一个hard
// 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

//  

// 示例 1:

// 输入: [7,5,6,4]
// 输出: 5


class Solution {
    public int reversePairs(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        return process(nums, 0, nums.length - 1);
    }

    public int process(int[] arr, int l, int r) {
        if(r == l) {
            return 0;
        }
        int mid = l + ((r - l) >> 1);
        return process(arr, l, mid) +
                process(arr, mid + 1, r) + 
                merger(arr, l, mid, r);

    }

    public int merger(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        int res = 0;
        while(p1 <= m && p2 <= r) {
            res += arr[p1] > arr[p2] ? (r - p2 + 1) : 0;
            help[i++] = arr[p1] > arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= m) {
            help[i++] = arr[p1++];
        }
        while(p2 <= r) {
            help[i++] = arr[p2++];
        }
        for(i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
        return res;
    }
}