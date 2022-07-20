
//https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        
        //we are having two variables 'max' and 'min' because whenever we find negative number then multiplying it with 'min' will give us max value instead of 'max' e.g -4 * 2(min) > -4 * 3(max)      
        int max = ans;
        int min = ans;
        
        for(int i = 1; i < n; i++) {
            
            //whenever we encounter a negative number we swap 'max' with 'min'
            if(nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            
            //if including current num is smaller than the current num itself then we start again with just current num e.g (-2, 1) : 1 > -2 * 1
            max = Math.max(nums[i], max * nums[i]);   
            min = Math.min(nums[i], min * nums[i]);
            ans = Math.max(ans, max);       //update the ans
        }
        
        return ans;
    }
}

//Time complexity : O(n) where n is the size of array
//Space complexity : O(1) 