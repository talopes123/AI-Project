package search_algorithms;

import java.util.ArrayList;
import java.util.List;

import graph_utils.Edge;
import graph_utils.Graph;
import graph_utils.Node;

public class Astar extends SearchAlgorithm {
	
	
	
	
	/* Para a heurística, decidi escolher o custo da distância pelo caminho mais barato, até ao nó objetivo
	 * 
	 * Para o custo decidi escolher o número de quadrados entre cada nó
	 * 
	 * 
	 * 
	 */
	
	boolean encontrado = false;
	List <Node> resultado = new ArrayList<Node>();
	List <String> resultados = new ArrayList<String>();


	public Astar(Graph graph) {
		super(graph);
			}

	
	
	
	public int getSmallestF (List<Integer> lista) {
		
		int valor = lista.get(0);
		int contador = -1;
		
		
		for(int a : lista) {
				
			
			if(a <= valor) {
				valor = a;
			
			    contador ++;}
			
		}
			
		return contador;
	}
	
	
	@Override
	public List<Node> start(Node n_initial, Node n_final) {
		
		List <Edge> lista = adjacencyOfNode(n_initial);
		
		resultado.add(n_initial);
		
		List<Integer> fss  = new ArrayList<Integer>(); 
		
		
		if(lista != null) {
		
		for(int i = 0; i < lista.size(); i++) {
			lista.get(i).getN1().setCost(lista.get(i).getCost());
			//System.out.println(lista.get(i).getCost());
			fss.add(lista.get(i).getN1().getF());
			//System.out.println("FSSSSS" + "--- " +lista.get(i).getN1().getLabel() + "-----" +  lista.get(i).getN1().getF());
		}
		
		//System.out.println(lista.get(getSmallestF(fss)).getN1().getLabel());
		//System.out.println(lista);
		n_initial = lista.get(getSmallestF(fss)).getN1();
		
		if(n_initial.equals(n_final)) {
			resultado.add(n_initial);
			return resultado;}
		
		start(n_initial,n_final);
		
		}
		
		
		return resultado;
			
  }

}
