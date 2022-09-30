import java.util.HashMap;

//https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    public int subarraySum(int[] nums, int target) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        //we put 0 because we have seen it once
        map.put(0, 1);
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - target)) {
                count += map.get(sum - target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

//Time complexity : O(n) we will be iterating over the complete array. 
//Space complexity : O(n) due to hashmap