
 //https://leetcode.com/problems/merge-two-binary-trees/

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //we merge trees in first tree(root1)
        
        //whenever we find a null we return with other root
        if(root1 == null) {
            return root2;
        }
        
        if(root2 == null) {
            return root1;
        }
        
        //if both are not null then we add the values to first tree
        root1.val += root2.val;
        
        //recursive call to traverse the whole tree
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        
        return root1;
    }
}

//Time Complexity: O(m) m is the minimum number of nodes in the smallest tree of two
//Space Complexity: O(m) depth of recursion tree can go upto m in case of skewed tree and in average case it will be O(logm)