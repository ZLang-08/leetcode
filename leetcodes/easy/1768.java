// 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。

// 返回 合并后的字符串 。

//  

// 示例 1：

// 输入：word1 = "abc", word2 = "pqr"
// 输出："apbqcr"
// 解释：字符串合并情况如下所示：
// word1：  a   b   c
// word2：    p   q   r
// 合并后：  a p b q c r
// 示例 2：

// 输入：word1 = "ab", word2 = "pqrs"
// 输出："apbqrs"
// 解释：注意，word2 比 word1 长，"rs" 需要追加到合并后字符串的末尾。
// word1：  a   b 
// word2：    p   q   r   s
// 合并后：  a p b q   r   s
// 示例 3：

// 输入：word1 = "abcd", word2 = "pq"
// 输出："apbqcd"
// 解释：注意，word1 比 word2 长，"cd" 需要追加到合并后字符串的末尾。
// word1：  a   b   c   d
// word2：    p   q 
// 合并后：  a p b q c   d


class Solution {
    public String mergeAlternately(String word1, String word2) {
        // int len = Math.min(word1.length(), word2.length());
        // // String res = "";//字符串相加别用String， 太费时间
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < len; i++) {
        //     // res += word1.charAt(i);
        //     // res += word2.charAt(i);
        //     sb.append(word1.charAt(i));
        //     sb.append(word2.charAt(i));
        // }
        // if( word1.length() > word2.length() )  {
        //     sb.append(word1.substring(len, word1.length()));
        // } else {
        //      sb.append(word2.substring(len, word2.length()));
        // }
        //     //    res + word1.substring(len, word1.length()) :
        //     //    res + word2.substring(len, word2.length());
        // return sb.toString();


        //看了官方题解
        int n1 = word1.length();
        int n2 = word2.length();
        // int min = Math.min(n1, n2);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < n1 || j < n2) {
            if(i < n1) {
                sb.append(word1.charAt(i));
                i++;
            }
            if(j < n2) {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}