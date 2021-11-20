package dsa_one;

import java.util.Scanner;

public class Tree {

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		preorder_traversal(root);
		System.out.println();

		inorder_traversal(root);
		System.out.println();

		postorder_traversal(root);
		System.out.println();

	}

	static Node createTree() {

		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();

		if (data == -1)
			return null;

		root = new Node(data);

		System.out.println("Enter left for " + data);
		root.left = createTree();

		System.out.println("Enter right for " + data);
		root.right = createTree();

		return root;
	}

	public static void preorder_traversal(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preorder_traversal(root.left);
		preorder_traversal(root.right);
	}

	public static void inorder_traversal(Node root) {
		if (root == null)
			return;

		inorder_traversal(root.left);
		System.out.print(root.data + " ");
		inorder_traversal(root.right);
	}

	public static void postorder_traversal(Node root) {
		if (root == null)
			return;

		postorder_traversal(root.left);
		postorder_traversal(root.right);
		System.out.print(root.data + " ");
	}

}

class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}
}
