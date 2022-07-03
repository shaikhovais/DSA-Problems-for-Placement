
//https://leetcode.com/problems/invert-binary-tree/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        //base condition
        if(root == null) {
            return root;
        }
        
        //swap left and right node using a temp node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        //recursive call for left and right part
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}

//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(h) h is the height of the binary tree
