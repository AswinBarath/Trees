package tree_traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import tree_implementations.Node;

/*
 * Time Complexity: O(N)
 * 	where N is the no. of nodes in the tree
 * Space Complexity: O(N)
 * 	where N is the no. of nodes in the tree
 * (don't take the space of answer DS into account)
 */
public class Inorder_iterative {

	public static List<Integer> inorderTraversal(Node root) {
		List<Integer> inorder = new ArrayList<Integer>();

		if (root == null)
			return inorder;

		Stack<Node> stack = new Stack<Node>();
		Node node = root;

		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty())
					break;
				node = stack.pop();
				inorder.add(node.data);
				node = node.right;
			}
		}

		return inorder;
	}

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		List<Integer> ans = inorderTraversal(root);
		System.out.print("Inorder: ");
		for (int data : ans) {
			System.out.print(data + ", ");
		}

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

// Inorder: 4, 2, 6, 5, 7, 1, 3,
