package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;

public class _058_Graph_Removing_Vertex {

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

	public boolean removeEdge(String vertex1, String vertex2) {
		// Time Complexity: O(n)
		// Space Complexity: O(1)
		if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
			adjList.get(vertex1).remove(vertex2);
			adjList.get(vertex2).remove(vertex1);
			return true;
		}
		return false;
	}

	public boolean removeVertex(String vertex) {
		// Time Complexity: O(d^2) : d = degree of the vertex being removed
		// Space Complexity: O(1)
		if (adjList.get(vertex) == null)
			return false;
		for (String otherVertexEdge : adjList.get(vertex)) {
			adjList.get(otherVertexEdge).remove(vertex);
		}
		adjList.remove(vertex);
		return true;
	}

	public static void main(String[] args) {

		_058_Graph_Removing_Vertex graph = new _058_Graph_Removing_Vertex();

		graph.addVertex("A");
		graph.addVertex("B");
		graph.addEdge("A", "B");
		graph.printGraph();

		graph.removeVertex("A");
		graph.printGraph();

	}

}
