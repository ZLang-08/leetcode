class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        if(x < 0) {
            return false;
        }
        int num = x;
        while(num != 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
       return res == x;

    }
}