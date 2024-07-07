package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;

public class _57_Graph_Removing_Edge {

	private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

	public void printGraph() {
		System.out.println(adjList);
	}

	public boolean addVertex(String vertex) {
		if (adjList.get(vertex) == null) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		return false;
	}

	public boolean addEdge(String vertex1, String vertex2) {
		if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
			adjList.get(vertex1).add(vertex2);
			adjList.get(vertex2).add(vertex1);
			return true;
		}
		return false;
	}

	public boolean removeEdge(String vertex1, String vertex2) {
		if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
			adjList.get(vertex1).remove(vertex2);
			adjList.get(vertex2).remove(vertex1);
			return true;
		}
		return false;
	}

	public boolean removeVertex(String vertex) {
		if (adjList.get(vertex) == null)
			return false;
		for (String otherVertexEdge : adjList.get(vertex)) {
			adjList.get(otherVertexEdge).remove(vertex);
		}
		adjList.remove(vertex);
		return true;
	}

	public static void main(String[] args) {

		_57_Graph_Removing_Edge graph = new _57_Graph_Removing_Edge();

		graph.addVertex("A");
		graph.addVertex("B");
		graph.addEdge("A", "B");
		graph.printGraph();
		
		graph.removeVertex("A");
		graph.printGraph();
		
	}

}
