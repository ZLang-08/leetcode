// 给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。

// 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。

//  

// 示例 1：

// 输入：s1 = "bank", s2 = "kanb"
// 输出：true
// 解释：例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
// 示例 2：

// 输入：s1 = "attack", s2 = "defend"
// 输出：false
// 解释：一次字符串交换无法使两个字符串相等
// 示例 3：

// 输入：s1 = "kelb", s2 = "kelb"
// 输出：true
// 解释：两个字符串已经相等，所以不需要进行字符串交换


class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //交换一次就相等了,那说明交换前就已经有len - 2 个字符是一样的
        //只需要记录这两个不相等的值得下标,交换后看他们是否相等
        int len = s1.length();
        int a = -1;//记录第一个不相等的索引
        int b = -1;//记录第二个
        for(int i = 0; i < len; i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                continue;
            } else if (a == -1) {
                a = i;
            } else if (b == -1) {
                b = i;
            } else {
                return false;//说明超过了两个不相等的字符
            }
        }
        if(a == -1) {//全是相等的
            return true;
        }
        if(b == -1) {
            return false;//只有一个不相等的
        }
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }
}