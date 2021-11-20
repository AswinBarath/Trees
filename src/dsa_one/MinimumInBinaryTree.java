package dsa_one;

import java.util.Scanner;

/*
 * Time Complexity: O(h)
 * 	where h is height of the tree
 * Space Complexity: O(n)
 * 	where n is the no. of nodes in the tree
 */
public class MinimumInBinaryTree {

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		System.out.println("Minimum of the tree: " + minimum(root));

	}

	public static int minimum(Node root) {
		if (root == null)
			return Integer.MAX_VALUE;

		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
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
