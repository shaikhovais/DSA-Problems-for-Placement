
//https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Solution {
    
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        //use recursive call to get the depth left and right side of our current node
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        //take the maximum between left and right and add 1(adding 1 to include current node to our maxDepth) 
        int maxDepth = Math.max(leftDepth, rightDepth) + 1;
        
        return maxDepth;
    }
}

// Time Complexity: O(n) n is the total number of nodes in the binary tree
// Space Complexity: O(n)n is the total number of nodes in the binary tree