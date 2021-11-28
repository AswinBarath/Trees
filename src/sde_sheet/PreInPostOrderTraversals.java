package sde_sheet;

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

class Pair {
	Node node;
	int num;

	Pair(Node _node, int _num) {
		num = _num;
		node = _node;
	}
}

class Answer {
	List<Integer> pre;
	List<Integer> in;
	List<Integer> post;

	Answer(List<Integer> _pre, List<Integer> _in, List<Integer> _post) {
		pre = _pre;
		in = _in;
		post = _post;
	}
}

public class PreInPostOrderTraversals {

	public static Answer preInPostOrderTraversals(Node root) {
		Stack<Pair> stack = new Stack<Pair>();
		stack.push(new Pair(root, 1));
		List<Integer> preOrder = new ArrayList<>();
		List<Integer> inOrder = new ArrayList<>();
		List<Integer> postOrder = new ArrayList<>();
		if (root == null)
			return null;

		while (!stack.isEmpty()) {
			Pair it = stack.pop();

			// this is part of pre order
			// increment 1 or 2
			// push the left side of the tree
			if (it.num == 1) {
				preOrder.add(it.node.data);
				it.num++;
				stack.push(it);

				if (it.node.left != null) {
					stack.push(new Pair(it.node.left, 1));
				}
			}

			// this is a part of in order
			// increment 2 to 3
			// push right
			else if (it.num == 2) {
				inOrder.add(it.node.data);
				it.num++;
				stack.push(it);

				if (it.node.right != null) {
					stack.push(new Pair(it.node.right, 1));
				}

			}

			// don't push it back again
			else {
				postOrder.add(it.node.data);
			}
		}

		// Only for Eclipse
		return new Answer(preOrder, inOrder, postOrder);

	}

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		Answer ans = preInPostOrderTraversals(root);
		System.out.print("Preorder: ");
		for (int data : ans.pre) {
			System.out.print(data + ", ");
		}
		System.out.print("Inorder: ");
		for (int data : ans.in) {
			System.out.print(data + ", ");
		}
		System.out.print("Postorder: ");
		for (int data : ans.post) {
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

/*
 * Example 1:

1
2
3
-1
-1
4
-1
-1
5
6
-1
-1
7
-1
-1

Preorder: 1, 2, 3, 4, 5, 6, 7, Inorder: 3, 2, 4, 1, 6, 5, 7, Postorder: 3, 4, 2, 6, 7, 5, 1, 

 */ 
