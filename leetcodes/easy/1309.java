// 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：

// 字符（'a' - 'i'）分别用（'1' - '9'）表示。
// 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
// 返回映射之后形成的新字符串。

// 题目数据保证映射始终唯一。

//  

// 示例 1：

// 输入：s = "10#11#12"
// 输出："jkab"
// 解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
// 示例 2：

// 输入：s = "1326#"
// 输出："acz"

class Solution {
    public String freqAlphabets(String s) {
        
        // StringBuilder sb = new StringBuilder();
        // int len = s.length();
        // for(int i = 0; i < len; i++) {
        //     char ch = s.charAt(i);
        //     if(ch == '1' || ch == '2') {
        //         if(i + 2 < len && s.charAt(i + 2) == '#') {
        //             int a = Integer.parseInt(s.substring(i, i + 2));
        //             sb.append((char)(a + 96));
        //             i += 2;
        //         } else {
        //             int b = Integer.parseInt(s.substring(i, i + 1));
        //             sb.append((char)(b + 96));
        //         }
        //     } else {
        //          int c = Integer.parseInt(s.substring(i, i + 1));
        //         sb.append((char)(c + 96));
        //     }
        // }
        // return sb.toString();

        //官方的题解

        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i = 0; i < len ; i++) {
            if(i + 2 < len && s.charAt(i + 2) == '#') {
                sb.append((char)(((s.charAt(i) - '0') * 10 + 
                s.charAt(i + 1) - '1' + 'a')));
                i += 2;
            } else {
                sb.append((char)(s.charAt(i) - '1' + 'a'));//注意这个地方减的是1
            }
        }
        return sb.toString();
    }
}