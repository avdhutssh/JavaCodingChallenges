package Java.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;

public class _55_Graph_Adding_Vertex {

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

	public static void main(String[] args) {

		_55_Graph_Adding_Vertex graph = new _55_Graph_Adding_Vertex();
		graph.printGraph();

		graph.addVertex("A");

		graph.printGraph();
	}

}
