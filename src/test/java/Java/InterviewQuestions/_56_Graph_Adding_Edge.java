package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;

public class _56_Graph_Adding_Edge {

	private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

	public void printGraph() {
		System.out.println(adjList);
	}

	public boolean addVertex(String vertex) {
		// Time Complexity: O(1)
		// Space Complexity: O(1)
		if (adjList.get(vertex) == null) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		return false;
	}

	public boolean addEdge(String vertex1, String vertex2) {
		// Time Complexity: O(1)
		// Space Complexity: O(1)
		if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
			adjList.get(vertex1).add(vertex2);
			adjList.get(vertex2).add(vertex1);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		_56_Graph_Adding_Edge graph = new _56_Graph_Adding_Edge();
		
		graph.addVertex("A");
		graph.addVertex("B");
		
		graph.printGraph();

		graph.addEdge("A", "B");
		graph.printGraph();
	}

}
