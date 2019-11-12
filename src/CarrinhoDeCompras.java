import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	public List<Pizza> pizzasTotais = new ArrayList<>();
	public double valorTotal;

	
	public void adicionaCarrinho (Pizza pizza) {
		
		if (pizza.quantidade > 0) {
			
			pizzasTotais.add(pizza);
			valorTotal += pizza.getPreco();
		}
		else {
			System.out.println("Impossível adicionar pizza sem ingredientes");
		}
		
	}
		
	public double valorFinal () {
		
		return valorTotal;
	}
		
		
		
	}
	
	
	