package BinaryTree;

import java.util.Scanner;

public class ConstructBinaryTree {

    static Scanner scan = null;
    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("If you want to add null then enter'-1' and move to right");
        TreeNode root = constructTree();

        System.out.println("Indorder Traversal of Binary Tree :");
        inOrderTraversal(root);
		System.out.println();

        System.out.println("Pre Order Traversal of Binary Tree :");
		preOrderTraversal(root);
		System.out.println();
        
        System.out.println("Post Order Traversal of Binary Tree :");
		postOrderTraversal(root);
		System.out.println();
    }

    public static TreeNode constructTree() {

        TreeNode root = null;
        System.out.println("Enter data: ");
        int data = scan.nextInt();

        if(data == -1) {
            return null;
        }

        root = new TreeNode(data);

        System.out.println("Enter left for " + data);
		root.left = constructTree();
		
		System.out.println("Enter right for "+ data);
		root.right = constructTree();

        return root;
    }

    public static void inOrderTraversal(TreeNode root) {
		if(root == null) {
            return;
        }
		
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}
	
	public static void preOrderTraversal(TreeNode root) {
		if(root == null) {
            return;
        }
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public static void postOrderTraversal(TreeNode root) {
		if(root == null) {
            return;
        }
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}
}

class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }
}
