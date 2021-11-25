package tree_traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tree_implementations.Node;

public class Postorder_iterative_using_1_stack {

	public static List<Integer> postorderTraversal(Node root) {
		List<Integer> postorder = new ArrayList<Integer>();
		
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
