package BinaryTree;

public class InvertABinaryTree {
    public static void main(String[] args) {                               //               1                           1    
        TreeNode root = new TreeNode(1);                             //              /  \      Inversion         /  \
        root.left = new TreeNode(2);                                 //             2    3         ->           3    2 
        root.right = new TreeNode(3);                                //            / \  / \                    / \  / \
        root.left.left = new TreeNode(4);                            //           4   5 6  7                  7   6 5  4
        root.left.right = new TreeNode(5);                                        
        root.right.left = new TreeNode(6);                                   
        root.right.right = new TreeNode(7);    

        root = invertTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }

        //if not null then swap the pointers
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //traverse to left and right part of the tree
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

class TreeNode {

    TreeNode left, right;
    int data;

    TreeNode(int data) {
        this.data = data;
    }
}
