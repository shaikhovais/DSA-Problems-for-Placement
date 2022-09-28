import java.util.HashMap;

//https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //we create a map to store the values which we have visited
        HashMap <Integer, Integer> map = new HashMap<>();
        //result array will store the index of both the numbers that add up to target
        int result[] = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            int remainingSum = target - nums[i];
            //if map contains remaining sum it means that we got both the index and we can return it by
            //adding in our result array
            if(map.containsKey(remainingSum)) {
                result[0] = map.get(remainingSum);
                result[1] = i;
                return result;
            } else {
            //if it's not there then we add in the map for future refernce
                map.put(nums[i], i);
            }
        }
        
        return result;
    }
}

//Time complexity : O(n) because we are iterating over the complete array
//Space complexity : O(n) due to hashmap