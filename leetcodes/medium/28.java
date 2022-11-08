// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。

//  

// 示例 1：

// 输入：haystack = "sadbutsad", needle = "sad"
// 输出：0
// 解释："sad" 在下标 0 和 6 处匹配。
// 第一个匹配项的下标是 0 ，所以返回 0 。
// 示例 2：

// 输入：haystack = "leetcode", needle = "leeto"
// 输出：-1
// 解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。

//可以用kmp算法 

class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        // for(int i = 0; i <= len1 - len2; i++) {
        //     if(haystack.substring(i, i + len2).equals(needle)) {
        //         return i;
        //     }
        // }
        // return -1;
        char[] ch1 = haystack.toCharArray();
        char[] ch2 = needle.toCharArray();
        for(int i = 0; i <= len1 - len2; i++) {
            // int b = 0;
            int a = 0;
            while (a < len2 && ch1[i + a] == ch2[a]) {
                a++;
            }
            if(a == len2) {
                return i;
            }
        }
        return -1;
    }
}