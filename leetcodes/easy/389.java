
// 给定两个字符串 s 和 t ，它们只包含小写字母。

// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。

// 请找出在 t 中被添加的字母。

//  

// 示例 1：

// 输入：s = "abcd", t = "abcde"
// 输出："e"
// 解释：'e' 是那个被添加的字母。
// 示例 2：

// 输入：s = "", t = "y"
// 输出："y"

class Solution {
    public char findTheDifference(String s, String t) {
    //     Map<Character, Integer> map1 = new HashMap<>();
    //     Map<Character, Integer> map2 = new HashMap<>();
    //     int len1 = s.length();
    //     int len2 = t.length();
    //     int i;
    //     char c = ' ';
    //     for(i = 0; i < len1; i++) {
    //         map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
    //         map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
    //     }
    //     map2.put(t.charAt(len1), map2.getOrDefault(t.charAt(len1), 0) + 1);

    // //    boolean loop = false;
    //     for(i = 0; i < len2; i++) {
    //         if(!map1.containsKey(t.charAt(i)) ||
    //          map1.get(t.charAt(i)) != map2.get(t.charAt(i))) {
    //             c = t.charAt(i);
    //             break;
    //         }
    //     }

    //     return c;
    //只能说不要什么都往hash表想
    //多想一想有没有什么简单的方法,放开思路
    //这道题可以弄一个大小为26的数组
    //而元素则表示每个字符出现的次数
        // int len = s.length();
        // int[] res = new int[26];
        // int[] res1 = new int[26];//可以不需要,遍历t,每次自减,当发现某个元素小于零时,他就是新加的
        // for(int i = 0; i < len; i++) {
        //     res[s.charAt(i) - 97] += 1;
        //     res1[t.charAt(i) - 97] += 1;
        // }
        // // int len1 = t.lenght();
        // res1[t.charAt(len) - 97] += 1;
        // for(int i = 0; i < 26; i++) {
        //     if(res1[i] != res[i]) {
        //         return (char) (i + 97);
        //     }
        // }
        // return ' ';


        //两个字符串的和的差就是新加的字符
        int res1 = 0;
        int res2 = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            res1 += s.charAt(i);
            res2 += t.charAt(i);
        }
        res2 += t.charAt(len);
        return (char)(res2 - res1);
    }
}