

import java.util.Arrays;
import java.util.List;

/**
 * This extension of DFS successfully outputs a topological ordering
 * as long as input graph is a DAG. If every vertex is reachable
 * from the starting vertex, the output will be a topological ordering
 * of the entire graph; if not, it will be a topological ordering
 * of all vertices in the graph that are reachable from the starting
 * vertex.  (As mentioned in the slides, this approach can be improved
 * so that all vertices are output in topologically sorted order.)
 * 
 * IMPLEMENT
 */
public class TopologicalSort extends DepthFirstSearch {
	private Vertex[] sortedVertices;
	private Vertex topSortStartVertex = null;
	
	private int currentPos;

	public Vertex getTopSortStartVertex() {
		return topSortStartVertex;
	}
	
	/**
	 * Assumption: g is a DAG. If not, there is no guarantee concerning
	 * the nature of the output.
	 */
	public TopologicalSort(Digraph g) {
		super(g);
		computeTopStartVertex();
		int numOfVertices = graph.getVertices().size() ;
		currentPos = numOfVertices - 1;
		sortedVertices = new Vertex[numOfVertices];
		
	}
	public List<Vertex> getTopologicalOrdering() {
		//warning: will return null until this class has been implemented!
		return Arrays.asList(sortedVertices);
	}

	protected void processVertex(Vertex w){	
		sortedVertices[currentPos] = w;
		currentPos --;
	}

	/**
	 * Finds, if possible, a vertex that has no in-vertices and sets this value
	 * in topSortStartVertex
	 * If not found, throws an IllegalStateException, indicating that
	 * the input graph is not a DAG. 
	 */
	public void computeTopStartVertex() {
		boolean found = false;
		for(Vertex v : graph.getVertices()){
			if(graph.getInVertices(v).size() == 0) {
				topSortStartVertex = v;
				found = true;
				break;
			}
		}
		if(!found) {
			throw new IllegalArgumentException("No start vertex found");
		}
	}
	

}
