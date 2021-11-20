package dsa_one;

import java.util.Scanner;

import tree_implementations.Node;

public class HeightOfBinaryTree {

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		System.out.println("Height of the tree: " + heightOfBinaryTree(root));

	}

	public static int heightOfBinaryTree(Node root) {
		if (root == null)
			return 0;

		return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)) + 1;
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
