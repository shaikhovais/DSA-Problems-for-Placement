
//https://leetcode.com/problems/counting-bits/

class Solution {
    public int[] countBits(int n) {
        //for more detail watch https://www.youtube.com/watch?v=awxaRgUB4Kw&t=424s
        int result[] = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            result[i] = result[i / 2] + (i & 1);   // '&' will add 1 if it's odd
        }              
        return result;
    }
}