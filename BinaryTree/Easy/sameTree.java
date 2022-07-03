
https://leetcode.com/problems/same-tree/

class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        
        //return true if both are null because it means we reached the leaf node at same time
        if(root1 == null && root2 == null) {
            return true;
        }
        
        //return false if we don't reach leaf node at same time
        if(root1 == null || root2 == null) {
            return false;
        }
        
        //if values are not same return false;
        if(root1.val != root2.val) {
            return false;
        }
        
        //if the value of current nodes are same then call for left and right part
        boolean leftSubTree = isSameTree(root1.left, root2.left);
        boolean rightSubTree = isSameTree(root1.right, root2.right);
        return leftSubTree && rightSubTree;
        
    }
}

//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(h) h is the height of the binary tree
