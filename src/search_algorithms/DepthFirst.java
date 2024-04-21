package search_algorithms;

import java.util.ArrayList;
import java.util.List;

import graph_utils.Edge;
import graph_utils.Graph;
import graph_utils.Node;

public class DepthFirst extends SearchAlgorithm {
	
	boolean encontrado = false;
	List <Node> resultado = new ArrayList<Node>();
	List <String> resultados = new ArrayList<String>();


	public DepthFirst(Graph graph) {
		super(graph);
	}

	@Override
	public List<Node> start(Node n_initial, Node n_final) {
		
		
		List <Edge> lista = adjacencyOfNode(n_initial);
		
		
			
		if(resultado.isEmpty() ) {
			resultado.add(n_initial);
			resultados.add(n_initial.getLabel());}
		
		
		if(lista != null ) {
					
		for(Edge e : lista) {
			
			if(encontrado == true)
				break;

			
			if(!resultado.contains(e.getN1())) {
			
			
			if(e.getN1().equals(n_final)) {
				resultado.add(e.getN1());
				resultados.add(e.getN1().getLabel());
				System.out.println("Destino encontrado");
				encontrado = true;
				break;}
			
			
				resultado.add(e.getN1());
				resultados.add(e.getN1().getLabel());

	        	start(e.getN1(),n_final);}
		  }
			
		
		}
	
		return resultado;
		
	
}

}
