package BinaryTree;

public class HeightOfBinaryTree {
    //There are two definitons of height of a binary tree :
    // 1) Number of Nodes on the longest path between root and deepest leaf Node.
    // 2) Number of edges on the longest path between root and deepest leaf Node.
    // Difference in both the ans is of '1'
    public static void main(String[] args) {                               //               1
        TreeNode root = new TreeNode(1);                             //              /  \
        root.left = new TreeNode(2);                                 //             2    3
        root.right = new TreeNode(3);                                //            / \    \
        root.left.left = new TreeNode(4);                            //           4   5    6
        root.left.right = new TreeNode(5);                           //               /
        root.right.right = new TreeNode(6);                          //              7
        root.left.right.left = new TreeNode(7);                              

        int height = heightOfBinaryTree(root);
        System.out.println("Height of binary tree is : " + height);
    }

    public static int heightOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        //Maximum of leftHeight and rightHeight is the actual height of that TreeNode and we do '+ 1' to add the TreeNode itself to it's height
        int height = Math.max(leftHeight, rightHeight) + 1;

        return height;
    }
}

class TreeNode {

    TreeNode left, right;
    int data;

    TreeNode(int data) {
        this.data = data;
    }
}
