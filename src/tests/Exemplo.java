package tests;

import graph_utils.Graph;
import graph_utils.Node;
import search_algorithms.DepthFirst;
import search_algorithms.SearchAlgorithm;
/**
 * Example of a graph creation
 * 
 * @author Rita Peixoto
 * @version 1.0
 *
 */
public class Exemplo {
	public static void main(String[] args) {
		/*
		 * (1)--->(2)--->(3) 
		 *  \ 			 / 
		 *   \ 		   	/
		 *    V 	   V 
		 *    (4)--->(5)
		 * 
		 * Initial -> (1) Final -> (5)
		 */

		Graph graph = new Graph();
		// creating the nodes
		Node n1 = new Node("1");
		Node n2 = new Node("2");
		Node n3 = new Node("3");
		Node n4 = new Node("4");
		Node n5 = new Node("5");
		Node n6 = new Node("6");

		// creating and adding edges to graph
		graph.addEdge(n1, n2);
		graph.addEdge(n2, n3);
//		graph.addEdge(n3, n5);
		graph.addEdge(n1, n4);
		graph.addEdge(n4, n5);

		System.out.println("initial node " + n1.getLabel());
		System.out.println("final node " + n5.getLabel());
		SearchAlgorithm dfsAlg = new DepthFirst(graph);
		dfsAlg.printResult(dfsAlg.startSearch(n1, n5));
		System.out.println(graph.toString());
	}
}
