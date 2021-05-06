import java.util.HashMap;

public class ShortestPathLength extends BreadthFirstSearch {
    private HashMap<Vertex, Integer> vertexLevel;
	private int currentLevel;
	public ShortestPathLength(Graph graph) {
		super(graph);
	}
	protected void processVertex(Vertex w) {
		vertexLevel.put(w, currentLevel);
        currentLevel ++;
	}

	public int shortestPathLength(Vertex u, Vertex v) {
        currentLevel = 0;
        vertexLevel = new HashMap<>();
		start(u);
		if (vertexLevel.containsKey(v)) {
			return vertexLevel.get(v);
		}
		return -1;
	}

}
