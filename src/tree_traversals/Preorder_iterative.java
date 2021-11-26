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
public class Preorder_iterative {

	public static List<Integer> preorderTraversal(Node root) {
		List<Integer> preorder = new ArrayList<Integer>();

		if (root == null)
			return preorder;

		Stack<Node> stack = new Stack<Node>();
		stack.push(root);

		while (!stack.isEmpty()) {
			root = stack.pop();
			preorder.add(root.data);
			if (root.right != null)
				stack.push(root.right);
			if (root.left != null)
				stack.push(root.left);
		}

		return preorder;
	}

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		List<Integer> ans = preorderTraversal(root);
		System.out.print("Preorder: ");
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
