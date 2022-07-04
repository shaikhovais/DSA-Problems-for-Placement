
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) { //base condition
            return root;
        }
        
        //we use a while loop to traverse in the BST
        while(root != null) {
            
            //if the value of current node is greater than both the value then we go on the left side
            if(root.val > p.val && root.val > q.val) {
                root = root.left;
                
            //if the value of current node is lesser than both the value then we go on the right side
            } else if(root.val < p.val && root.val < q.val) {
                root = root.right;
                
            //if both the condition fails then it means that one node is on the left and the other node is on the right side, so in this case LCA will be the current node itself. So we break the loop and return the current node as LCA from line no 33
            } else {
                break;
            }
        }
        return root;
    }
}

//Time Complexity: O(h), where h is the height of the tree.
//Space Complexity: Since we are not doing any recursive call, so space complexity is constant.
