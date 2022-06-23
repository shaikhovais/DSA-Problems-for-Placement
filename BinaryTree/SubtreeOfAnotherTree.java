package BinaryTree;

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {                               //               1
        TreeNode root = new TreeNode(1);                             //              /  \               2
        root.left = new TreeNode(2);                                 //             2    3             / \
        root.right = new TreeNode(3);                                //            / \    \           4   5
        root.left.left = new TreeNode(4);                            //           4   5    6
        root.left.right = new TreeNode(5);                           //             (Tree 1)         (Tree 2)
        root.right.right = new TreeNode(6);  

        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(4);
        subRoot.right = new TreeNode(5);

        System.out.println((isSubTree(root, subRoot)));
    }

    public static boolean isSubTree(TreeNode root, TreeNode subRoot) {
        //if subRoot is null then it is true because every tree has null
        if(subRoot == null) {
            return true;
        }

        //if subroot is not null and root is null then it is false
        if(root == null) {
            return false;
        }

        //if we find the node with value equal to subroot then we check in another function if they are identical
        if(root.data == subRoot.data) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }

        //we use 'or' operation because if anyside is true then we return true
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) {
            return true;
        }
        //this means we reached the end in both the trees at the same time so it's identical

        if(root == null || subRoot == null) {
            return false;
        }
        //this means one tree has reahed the end before the other so they can't be identical

        //if data is same then we check left and right both
        if(root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        //if data is not same then it's not identical and we return false
        return false;
    }
}

class TreeNode {

    TreeNode left, right;
    int data;

    TreeNode(int data) {
        this.data = data;
    }
}
