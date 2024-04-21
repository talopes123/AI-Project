package search_algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import graph_utils.Graph;
import graph_utils.Node;

public class BreadthFirst extends SearchAlgorithm {
	
	List <Node> resultado = new ArrayList<Node>();
	//List <String> resultados = new ArrayList<String>();
    private Queue<Node> queue = new LinkedList<Node>();



	public BreadthFirst(Graph graph) {
		super(graph);
		
	}

	@Override
	public List<Node> start(Node n_initial, Node n_final) {
		
		boolean encontrado = false;

		

	
		resultado.add(n_initial);
		queue.add(n_initial);
		
			
		while (encontrado == false) {
			

			
			n_initial = queue.poll();
			

			if(adjacencyOfNode(n_initial) != null) {
			
			for(int i = 0; i < adjacencyOfNode(n_initial).size(); i++) {
			
			 if(!resultado.contains(adjacencyOfNode(n_initial).get(i).getN1())) {
				resultado.add(adjacencyOfNode(n_initial).get(i).getN1());
				// resultados.add(adjacencyOfNode(n_initial).get(i).getN1().getLabel());
				queue.add(adjacencyOfNode(n_initial).get(i).getN1());
				//	System.out.println(resultados);}
			 }
			
				if(adjacencyOfNode(n_initial).get(i).getN1().equals(n_final)) {
					System.out.println("Destino encontrado");
					encontrado = true;
					break;}
		}
		
		
			
			}
		}
		 return resultado;
		
	}		

  }

