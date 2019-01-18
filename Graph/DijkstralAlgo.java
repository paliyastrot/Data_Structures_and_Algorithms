package practice;

import java.util.*;
class NodeDij implements Comparable<NodeDij>
{
	
int dest, weight;
	NodeDij(int dest, int weight)
	{
		this.dest = dest;
		this.weight = weight;
	}


	@Override
	public int compareTo(NodeDij o) {
		return this.weight - o.weight;
	}
}
public class DijkstraAlgo {
	
	int V ;
	LinkedList<NodeDij> adjList[];
	
	//creating a minHeap
	BinaryHeap<NodeDij> minHeap;
	
	//constructor
	public DijkstraAlgo(int V) 
	{	
		this.V = V;
		minHeap = new BinaryHeap<NodeDij>();
		adjList = new LinkedList[V];
		for(int i=0;i<V;i++)
			adjList[i]= new LinkedList<NodeDij>();	
	}
	
	
	
	public void createminHeap()
	{
		minHeap.add(new NodeDij(0, 0));
		for(int i=1;i<V;i++)
		{
			minHeap.add(new NodeDij(i, Integer.MAX_VALUE));
		}
	}
	public void Dijkstra()
	{
		HashSet<Integer> hash = new HashSet<Integer>();
		int distance[] = new int[V];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[0]=0;
		while(!minHeap.isEmpty())
		{
			NodeDij node = minHeap.poll();
			int vertex = node.dest;
			hash.add(vertex);
			//System.out.println(vertex);
			
			for(NodeDij x: adjList[vertex])
			{
				if(!hash.contains(x.dest))
				{
					int newKey = x.weight + distance[vertex];
	
					int currKey = distance[x.dest];
					//System.out.println(newKey + " "+currKey);
					
					if(currKey>newKey)
					{
						minHeap.decreaseKey(new NodeDij(x.dest, newKey), x.dest);
						distance[x.dest]=newKey;
					}
				}
			}
		//	System.out.println("Size of MinHeap is :" + minHeap.length());
			
		}
		System.out.println(Arrays.toString(distance));
	}
	
	

	public static void main(String[] args) 
	{
		DijkstraAlgo graph = new DijkstraAlgo(6);
		graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);
        graph.createminHeap();
        graph.Dijkstra();
		
	}

	private void addEdge(int src, int dest, int weight) 
	{
		
		adjList[src].add(new NodeDij(dest, weight));
		adjList[dest].add(new NodeDij(src, weight));
	}

}
