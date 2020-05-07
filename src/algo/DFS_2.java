package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import algo.DFS_2.Graph.Node;

public class DFS_2 {

	public static void main(String[] args) {
		Graph g = new Graph(5);

		g.addEdge(4, 3);
		g.addEdge(4, 1);
		g.addEdge(0, 1);
		g.addEdge(2, 3);
		g.addEdge(2, 0);

		g.dfs(2);

	}

	static class Graph {
		class Node {
			int data;
			LinkedList<Node> adj;
			boolean visited;

			Node(int data) {
				this.data = data;
				this.visited = false;
				adj = new LinkedList<Node>();
			}
		}

		Node[] nodes;

		public Graph(int size) {
			nodes = new Node[size];
			for (int i = 0; i < size; i++) {
				nodes[i] = new Node(i);
			}
		}

		void addEdge(int a, int b) {
			Node n1 = nodes[a];
			Node n2 = nodes[b];

			if (!n1.adj.contains(n2))
				n1.adj.add(n2);
			if (!n2.adj.contains(n1))
				n2.adj.add(n1);
		}

		void visit(Node n) {
			System.out.print(n.data + " ");
		}

		void dfs(int start) {
			Node root = nodes[start];
			Stack<Node> stack = new Stack<Node>();
			stack.push(root);
			root.visited = true;
			while (!stack.isEmpty()) {
				Node r = stack.pop();
				for (Node n : r.adj) {
					if (n.visited == false) {
						n.visited = true;
						stack.push(n);
					}
				}
				visit(r);
			}
		}

		void dfsR(Node start) {
			if (start == null)
				return;
			start.visited = true;
			visit(start);
			for (Node n : start.adj) {
				if (n.visited == false)
					dfsR(n);
			}
		}

		void dfsR(int start) {
			Node r = nodes[start];
			dfsR(r);
		}
	}

}
