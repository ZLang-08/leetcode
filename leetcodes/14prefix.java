class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int len = strs.length;
        for(int i = 1 ; i < len; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if(prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2 ) {
        int minLen = Math.min(str1.length(), str2.length());
        int index = 0;
        while(index < minLen && str1.charAt(index) == str2.charAt(index)) {
            index += 1;

        }

        return str1.substring(0, index);
    }
}