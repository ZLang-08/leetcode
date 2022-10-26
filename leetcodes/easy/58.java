class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        // String str1 = s.substring(0, n);
        // String str2 = s.substring(n, s.length());
        // sb.append(str2);
        // sb.append(str1);
        // return sb.toString();
        // return str2 + str1;
        // return (s + s).substring(n, n + s.length());
        for(int i = n; i < n + s.length(); i++) {
            sb.append(s.charAt(i % s.length()));
        }
        return sb.toString();
    }
}