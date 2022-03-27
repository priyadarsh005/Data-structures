import java.io.*;
import java.util.*;

public class BFS {
	
	private int V;  // Number of vertices
	private LinkedList<Integer> adj[];  // Adjacency List
	
	BFS(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; i++)
			adj[i] = new LinkedList();
	}

	void addEdge(int x, int y) {
		adj[x].add(y);
	}
	
	void calculateBFS(int s) {
		boolean visited[] = new boolean[V];
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[s] = true;
		q.add(s);
		
		while (q.size() != 0) {
			s = q.poll();
			System.out.println(s+" ");
			
			Iterator<Integer> itr = adj[s].iterator();
			while (itr.hasNext()) {
				int n = itr.next();
				if (!visited[n]) {
					visited[n] = true;
					q.add(n);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		BFS g = new BFS(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
		
		g.calculateBFS(2);

	}

}
