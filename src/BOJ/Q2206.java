package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q2206 {

	static int n, m;
	static int[][] adj;
	static boolean[][] visited;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			n = Integer.parseInt(tmp[0]);
			m = Integer.parseInt(tmp[1]);
			adj = new int[n][m];
			visited = new boolean[n][m];

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	static void bfs(int x, int y) {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(x, y));
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			
			for(int i=0; i<n; i++) {
				
			}
			if(adj[current.x][current.y] == 0 && !visited[current.x][current.y]) {
				
			}
		}
		
		
	}
	
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}

}
