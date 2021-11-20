package dsa_one;

import java.util.Scanner;

import tree_implementations.Node;

public class SizeOfBinaryTree {

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		System.out.println("Size of the tree: " + sizeOfBinaryTree(root));

	}

	public static int sizeOfBinaryTree(Node root) {
		if (root == null)
			return 0;

		return sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right) + 1;
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
}
