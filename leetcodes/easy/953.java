// 某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。

// 给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 false。

//  

// 示例 1：

// 输入：words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
// 输出：true
// 解释：在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。
// 示例 2：

// 输入：words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
// 输出：false
// 解释：在该语言的字母表中，'d' 位于 'l' 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。
// 示例 3：

// 输入：words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
// 输出：false
// 解释：当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 'l' > '∅'，其中 '∅' 是空白字符，定义为比任何其他字符都小（更多信息）。


class Solution {
    int[] res = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
    //     Map<String, Integer> map = new HashMap<>();
    //     for(int i = 0; i < 26; i++) {
    //         map.put(order.substring(i, i + 1), i);
    //     }
    //     int len = words.length;
    //     for(int i= 0; i < len - 1; i++) {
    //         if(compareToByString(words[i],words[i + 1], map) < 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public int compareToByString(String s1, String s2, Map<String, Integer> map) {
    //     int n1 = s1.length();
    //     int n2 = s2.length();
    //     int min = Math.min(n1, n2);
    //     int i = 0;
    //     while(i < min) {
    //         if(map.get(s1.substring(i, i + 1)) > 
    //         map.get(s2.substring(i, i + 1))) {
    //             return -1;
    //         } else if(map.get(s1.substring(i, i + 1)) < 
    //         map.get(s2.substring(i, i + 1))) {
    //             return 1;
    //         }
    //         i++;
    //     }
    //     if(n1 == n2) {
    //         return 0;
    //     } else if(n1 < n2){
    //         return 1;
    //     } else {
    //         return -1;
    //     }
        

    // 看了官方题解
    //数组好快啊
        // int[] index = new int[26];
        // for(int i = 0; i < 26; i++) {
        //     index[order.charAt(i) - 'a'] = i;
        // }

        // int len = words.length;
        // for(int i = 0; i < len - 1; i++) {
        //     boolean flag = false;
        //     for(int j = 0; j < words[i].length() && j < words[i + 1].length(); j++) {
        //         int pre = index[words[i].charAt(j) - 'a'];
        //         int cur = index[words[i + 1].charAt(j) - 'a'];
        //         if(pre > cur) {
        //             return false;
        //         } else if(pre < cur) {
        //             // return true;
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if(!flag) {
        //         if(words[i].length() > words[i + 1].length()) {
        //             return false;
        //         }
        //     }
        //     // if(words[i].length() > words[i + 1].length()) {
        //     //     return false;
        //     // }

        // }

        // return true;

    //三叶姐的方法

    for(int i = 0; i < 26; i++) {
        res[order.charAt(i) - 'a'] = i;
    }
    int len = words.length;
    for(int i = 0; i < len - 1; i++) {
        if(compareToByString(words[i], words[i + 1]) > 0) {
            return false;
        }
    }
    return true;


    }

    public int compareToByString(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0;
        int j = 0;
        while(i < n1 && j < n2) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            if(c1 != c2) {
                return res[c1 - 'a'] - res[c2 - 'a'];
            }
            i++;
            j++;
        }

        if(i < n1) {
            return 1;
        }
        if(j < n2) {
            return -1;
        }

        return 0;
    }
}