
//https://leetcode.com/problems/continuous-subarray-sum/
//(a+(n*x))%x is same as (a%x). For e.g. in case of the array [23,2,6,4,7] the running sum is [23,25,31,35,42] and the remainders are [5,1,1,5,0]. We got remainder 5 at index 0 and at index 3. That means, in between these two indexes we must have added a number which is multiple of the k.

class Solution {

    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if(k == 0 || n < 2) {       
            return false;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int runningSum = 0;
        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++) {
            runningSum += nums[i];  
            runningSum %= k;
            if(map.containsKey(runningSum)) {   //we check for the remainder
                if(i - map.get(runningSum) > 1) {   //we check if the length is greater than 1
                    return true;
                }
            } else {
                map.put(runningSum, i);
            }
        }
        
        return false;
    }
        
}
    
    // TimeComplexity : O(n)
    // Space Complexity : O(k)

// TimeComplexity : O(n)
// Space Complexity : O(k)
