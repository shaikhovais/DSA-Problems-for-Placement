package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {                               //               1                           
        TreeNode root = new TreeNode(1);                             //              /  \      
        root.left = new TreeNode(2);                                 //             2    3       
        root.right = new TreeNode(3);                                //            / \  / \               
        root.left.left = new TreeNode(4);                            //           4   5 6  7               
        root.left.right = new TreeNode(5);                                        
        root.right.left = new TreeNode(6);                                   
        root.right.right = new TreeNode(7);    

        System.out.println("Level Order Traversal of a Binary Tree :");
        levelOrderTraversal(root);
        System.out.println();

        System.out.println("Level Order Traversal of a Binary Tree on a new line for each level:");
        levelOrderTraversalOnDiffLine(root);
    }

    public static void levelOrderTraversal(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void levelOrderTraversalOnDiffLine(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()) {
            //We take an element out, print it and add its left and right to the queue if they are not null
            TreeNode current = queue.poll();

            //if the removed element is null it means a level is complete and we should move to next line
            if(current == null) {
                if(queue.isEmpty()) {
                    //if queue is empty and we get it null, it means that we have printed all the elements
                    return;
                } else {
                    //else we add null at the end of queue to mark the end of that level and also move to next line
                    queue.add(null);
                    System.out.println();
                    continue;
                }
            }

            System.out.print(current.data + " ");

            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }
}

class TreeNode {

    TreeNode left, right;
    int data;

    TreeNode(int data) {
        this.data = data;
    }
}
