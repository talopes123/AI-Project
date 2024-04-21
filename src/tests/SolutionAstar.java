package tests;

import graph_utils.*;
import search_algorithms.*;

public class SolutionAstar {
	public static void main(String[] args) {
		/*
		 * TO DO Aqui deves: 
		 * 		- criar a instancia do grafo que representa o mapa das
		 * 		masmorras (ver classe Exemplo.java) e explicar a funcao heuristica escolhida
		 * 		bem como os custos associados aos arcos (edges) 
		 * 		- colocar o c�digo para testar o algoritmo criado
		 * 
		 */
		
		/*
		 * (6)--->(10)--->(4)---------------->(3)---->(9)---->(7)
		 *   			   |                    \      | 
 		 *                 |                     \     |
		 *                 |         (1)          \    |
		 *                 |         ^             \   | 
		 *                 |        /               \  | 
		 *    		   	   V       /                 V V 
		 * 	              (8)--->(5)---------------- >(11)          
		 *                         \                   
		 *                          \                  
		 *                           V
		 *                           (2)
		 *                           
		 *                           
		 * Initial -> (6) Final -> (11)
		 */

		Graph graph = new Graph();
		// creating the nodes
		Node n1 = new Node("1",2);
		Node n2 = new Node("2",14);
		Node n3 = new Node("3",19);
		Node n4 = new Node("4",26);
		Node n5 = new Node("5",1);
		Node n6 = new Node("6",30);
		Node n7 = new Node("7",16);
		Node n8 = new Node("8",13);
		Node n9 = new Node("9",8);
		Node n10 = new Node("10",29);
		Node n11 = new Node("11",0);

		// creating and adding edges to graph
		graph.addEdge(n6, n10,1);
		graph.addEdge(n10, n4,3);
		graph.addEdge(n4, n3,15);
		graph.addEdge(n4, n8,13);
		graph.addEdge(n3, n11,19);
		graph.addEdge(n3, n9,4);
		graph.addEdge(n9, n11,8);
		graph.addEdge(n9, n7,8);
		graph.addEdge(n8, n5,12);
		graph.addEdge(n5, n2,13);
		graph.addEdge(n5, n11,1);
		graph.addEdge(n5, n1,1);

		System.out.println("initial node " + n6.getLabel());
		System.out.println("final node " + n11.getLabel());

		
		
		SearchAlgorithm dfsAlg = new Astar(graph);
		
		dfsAlg.printResult(dfsAlg.startSearch(n6, n11));
		System.out.println(graph.toString());
	}


		
	}
