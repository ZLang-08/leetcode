// 给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。

//  

// 示例 1：

// 输入：s = "Hello"
// 输出："hello"
// 示例 2：

// 输入：s = "here"
// 输出："here"
// 示例 3：

// 输入：s = "LOVELY"
// 输出："lovely"


class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) <= 90 && s.charAt(i) >= 65) {
                sb.append((char)(s.charAt(i) + 32));
            } else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}