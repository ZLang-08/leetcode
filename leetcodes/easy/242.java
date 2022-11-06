// 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。

//  

// 示例 1:

// 输入: s = "anagram", t = "nagaram"
// 输出: true
// 示例 2:

// 输入: s = "rat", t = "car"
// 输出: false


class Solution {
    public boolean isAnagram(String s, String t) {
        // int[] arr = new int[26];
        // int[] arr1 = new int[26];
        // int len = s.length();
        // int len1 = t.length();
        // if(len != len1) {
        //     return false;
        // }
        // for(int i = 0; i < len; i++) {
        //     arr[s.charAt(i) - 'a']++;
        //     arr1[t.charAt(i) - 'a']++;
        // }
        // for(int i = 0; i < len; i++) {
        //     if(arr[s.charAt(i) - 'a'] != arr1[s.charAt(i) - 'a']) {
        //         return false;
        //     }
        // }
        // return true;
        
        //排序

        int len = s.length();
        int len1 = t.length();
        if(len != len1) {
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return  Arrays.equals(ch1, ch2);
    }
}