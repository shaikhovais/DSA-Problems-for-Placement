
//https://leetcode.com/problems/single-number/
//https://practice.geeksforgeeks.org/problems/element-appearing-once2552/0

class Solution {
    public int singleNumber(int[] nums) {
        //first , we have to know the bitwise XOR in java
        // 0 ^ N = N 
        // N ^ N = 0

        // So..... if N is the single number
        // N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
        // = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
        // = 0 ^ 0 ^ ..........^ 0 ^ N
        // = N
        
        int n = nums.length;
        int result = 0;
        
        for(int i = 0; i < n; i++) {
            result ^= nums[i];
        }
        
        return result;
    }
}

//Time complexity : O(n) we will be iterating over the complete array. 
//Space complexity : O(1)