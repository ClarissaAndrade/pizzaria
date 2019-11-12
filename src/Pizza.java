import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {

	static List<String> listaIngredientes = new ArrayList<>();
	double valorPizza = 0;
	static int quantidadeEstatica = 0;
	int quantidade = 0;
	
	public void adicionaIngrediente(String ingrediente) {
		listaIngredientes.add(ingrediente);
		quantidade++;
		contabilizaIngredientes();
	}

	public double getPreco() {
		if (quantidade <= 2) {
			valorPizza = 15;
			return valorPizza;
		}
		if(quantidade>=3 && quantidade<=5) {
			valorPizza = 20;
			return valorPizza;
		}
		else {
			valorPizza = 23;
			return valorPizza;
		}
	}
		
	public static void contabilizaIngredientes () {
		quantidadeEstatica++;	
	}	
	
	
    public Map<String, Integer> contarIngredientes() {
        Map<String, Integer> totalPorIngredientes = new HashMap<String, Integer>();
        
        for (String ingrediente : listaIngredientes) {
            int frequency = Collections.frequency(listaIngredientes, ingrediente);
            totalPorIngredientes.put(ingrediente, frequency);
        }
    
        return totalPorIngredientes;
    }	
	
	public static void zeraIngredientes() {
		quantidadeEstatica = 0;
	}
}