//1523
//给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。
//示例 1：
// 输入：low = 3, high = 7
// 输出：3
// 解释：3 到 7 之间奇数数字为 [3,5,7] 。
// 示例 2：
// 输入：low = 8, high = 10
// 输出：1
// 解释：8 到 10 之间奇数数字为 [9] 。
// 来源：力扣（LeetCode）
lass Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        // for(int i = low; i <= high; i++) {
        //     if(i % 2 != 0) {
        //         count += 1;
        //     }
        // }
    
        return low % 2 == 0 && high % 2 == 0 ? count : count + 1;
    }
}