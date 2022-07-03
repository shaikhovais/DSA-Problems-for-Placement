
//https://leetcode.com/problems/path-sum/

class Solution {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        //return false when root is null or when we reached leaf node but the sum is not equal to target sum
        if(root == null) {
            return false;
        }
        
        //if the current node is not null then we subract targetSum by it's value and pass the new targetSum ahead in the function
        targetSum = targetSum - root.val;
        
        //if both sides are null then it means that we have reached leaf node and if at the same time targetSum is also equals to 0 then we can return true because we have found the path
        if(root.left == null && root.right == null && 0 == targetSum) {
            return true;
        }
        
        //we do a recursive call for both the sides and use 'or(||)' function because even if one side is true then we got the ans(path)
        return hasPathSum(root.left,  targetSum) || hasPathSum(root.right, targetSum);
    }
    
}

//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(n) n is the total number of nodes in the binary tree