import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShortestPath extends BreadthFirstSearch {
    private HashMap<Vertex, Vertex> parent;
	private Vertex prev;
	public ShortestPath(Graph graph) {
		super(graph);
	}
	protected void processVertex(Vertex w) {
		parent.put(w, prev);
		prev = w;
	}

	public List<Vertex> shortestPath(Vertex u, Vertex v) {
        prev = u;
        parent = new HashMap<>();
		start(u);
		List<Vertex> shortPath = new ArrayList<>();
		if(parent.containsKey(v)) {
			while (v != u) {
				shortPath.add(0, v);
				v = parent.get(v);
			}
			shortPath.add(0, v);
		}
		return shortPath;
	}

}
