package daytwo;
	public class graph
	{
		private List<GraphNode> nodes; 
			private HashMap<String,Vertex> vertexMap = new HashMap();
			
		public void addEdge(String next, String dest, double cost);
	

	Vertex v = getVertex(next);
	Vertex w = getVertex(dest);
	v.adj.add(newEdge(w,cost));
	}