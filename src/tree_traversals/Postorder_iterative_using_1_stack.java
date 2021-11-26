package tree_traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import tree_implementations.Node;

/*
 * Time Complexity: O(2N)
 * 	where N is the no. of nodes in the tree
 * Space Complexity: O(N) (size due to usage of 1 stack)
 * 	where N is the no. of nodes in the tree
 * (don't take the space of answer DS into account)
 */

public class Postorder_iterative_using_1_stack {

	public static List<Integer> postorderTraversal(Node root) {
		List<Integer> postorder = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		if (root == null)
			return postorder;

		Node cur = root;
		while (cur != null || !stack.isEmpty()) {
			if (cur != null) {
				// From current node go the left node
				stack.push(cur);
				cur = cur.left;
			} else {
				// from the current node go the right
				Node temp = stack.peek().right;
				if (temp == null) {
					// Insert left/right node to post order
					temp = stack.pop();
					postorder.add(temp.data);
					// Insert root to post order
					// (i.e) Here we check whether temp is the right node of the topmost node of the stack
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						postorder.add(temp.data);
					}
				} else {
					// Right node is assigned to cur
					cur = temp;
				}
			}
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

// Post order: 6, 5, 4, 3, 2, 8, 10, 9, 7, 1,
/*
 * input 1:
1
2
3
-1
4
-1
5
-1
6
-1
-1
-1
7
8
-1
-1
 9
-1
10
-1
-1

input 2:
1
-1
2
3
-1
-1
-1

input 3:
1
-1
2
-1
-1

 */
