package tree_traversals;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import tree_implementations.Node;

/*
 * Time Complexity: O(N)
 * 	where N is the no. of nodes in the tree
 * Space Complexity: O(N)
 * 	where N is the no. of nodes in the tree
 * (when queue stores every node - worst case)
 * (don't take the space of answer DS into account)
 */

public class Level_order_traversal {

	public static List<List<Integer>> levelOrder(Node root) {
		// answer list
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		Queue<Node> queue = new LinkedList<Node>();

		if (root == null)
			return wrapList;

		// insert root into queue
		queue.offer(root);

		while (!queue.isEmpty()) {
			// No. of elements in queue
			int levelNum = queue.size();
			// To store each level - use sublist
			List<Integer> subList = new LinkedList<Integer>();
			for (int i = 0; i < levelNum; i++) {
				// insert left of node in queue
				if (queue.peek().left != null)
					queue.offer(queue.peek().left);
				// insert right of node in queue
				if (queue.peek().right != null)
					queue.offer(queue.peek().right);
				// Now, remove nodes of current level from queue and add it to sublist
				subList.add(queue.poll().data);
			}
			// Now, add the level stored in list into answer list
			wrapList.add(subList);
		}

		return wrapList;
	}

	static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Node root = createTree();

		List<List<Integer>> ans = levelOrder(root);
		System.out.print("Level order: ");
		for (List<Integer> sub : ans) {
			System.out.print(sub + ", ");
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