
//https://leetcode.com/problems/binary-tree-inorder-traversal/

class Solution {
    
    //we declare list as a global variable and keep on updating it
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return list;
        }
        
        //inorder = left->node->right
        inorderTraversal(root.left); //first we move to left
        list.add(root.val);          //add the value of node to list
        inorderTraversal(root.right);//then we move to right
        
        return list;
    }
}

//Time Complexity: O(n) n is the total number of nodes in the binary tree
//Space Complexity: O(n) n is the total number of nodes in the binary tree