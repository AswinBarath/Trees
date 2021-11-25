package tree_traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import tree_implementations.Node;

/*
 * Time Complexity: O(N)
 * 	where N is the no. of nodes in the tree
 * Space Complexity: O(2N) (size due to usage of 2 stacks)
 * 	where N is the no. of nodes in the tree
 * (when queue stores every node - worst case)
 * (don't take the space of answer DS into account)
 */
public class Postorder_iterative_using_2_stacks {

	public static List<Integer> postorderTraversal(Node root) {
		List<Integer> postorder = new ArrayList<Integer>();
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();

		if (root == null)
			return postorder;

		stack1.push(root);
		while (!stack1.isEmpty()) {
			root = stack1.pop();
			stack2.push(root);
			if (root.left != null)
				stack1.push(root.left);
			if (root.right != null)
				stack1.push(root.right);
		}

		while (!stack2.isEmpty()) {
			postorder.add(stack2.pop().data);
		}

		return postorder;
	}

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		List<Integer> ans = postorderTraversal(root);
		System.out.print("Post order: ");
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

// Post order: 4, 5, 2, 8, 7, 6, 3, 1, 
