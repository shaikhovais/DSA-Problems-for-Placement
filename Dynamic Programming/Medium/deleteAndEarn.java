
//https://leetcode.com/problems/delete-and-earn/
//https://www.youtube.com/watch?v=qVfjmkL1naw

class Solution {
    public int deleteAndEarn(int[] nums) {
        
        //Fill the freq array
        int freq[] = new int [10001];       //10000 is given in the constraints as max value
        for(int val : nums) {
            freq[val]++;
        }
        
        //Take two variables 'inc' to calculate if the current element is included and 'exc' to calculate if the current element is not included
        int inc = 0;
        int exc = 0;  
        for(int i = 0; i <= 10000; i++) {
            int excTemp = Math.max(inc, exc);       
            int incTemp = exc + (freq[i] * i);
            
            inc = incTemp;
            exc = excTemp;
        }
        
        return Math.max(inc, exc);
    }
}

// TimeComplexity : O(n), where n is the ength of array
// Space Complexity : O(n), due to freq array