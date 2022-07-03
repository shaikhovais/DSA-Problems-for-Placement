
//https://leetcode.com/problems/subtree-of-another-tree/

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //return true is subroot is null
        if(subRoot == null) {
            return true;
        }
        
        //return false if subroot is not null but root is null
        if(root == null) {
            return false;
        }
        
        //when we find the matching node use helper function to check if it's a subtree or not
        if(root.val == subRoot.val) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }
        
        //use 'or' function because if subtree is present in any part, we return true
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        //return true if both are null because it means we reached the leaf node at same time
        if(root == null && subRoot == null) {
            return true;
        }
        
        //return false if we don't reach leaf node at same time
        if(root == null || subRoot == null) {
            return false;
        }
        
        //if the value for current node is true then call for left and right part
        if(root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        //if values don't match return false;
        return false;
    }
}

//Time Complexity: O(m*n) n is the total number of nodes in the first binary tree and m is the total number of nodes in the second binary tree (subtree)
//Space Complexity: O(min(n,m)) depth of recursion tree can go upto n or m, whichever is smaller