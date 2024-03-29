/* Crie uma classe Pizza que possua o m�todo adicionaIngrediente() que recebe uma String com o ingrediente a ser adicionado. Essa classe tamb�m 
 deve possuir o m�todo getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais
 e mais de 5 ingredientes custa 23 reais.

� preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize uma vari�vel est�tica na classe Pizza para guardar esse tipo de
informa��o (dica: utilize a classe HashMap para guardar o ingrediente como chave e um Integer como valor). Crie o m�todo est�tico
contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro.

Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. Ela deve ter um m�todo que retorna o valor total de
todas as pizzas adicionadas. O Carrinho n�o pode aceitar que seja adicionada uma pizza sem ingredientes.

Crie uma classe Principal com o m�todo main() que faz o seguinte:

Cria 3 pizzas com ingredientes diferentes
Adiciona essas Pizzas em um CarrinhoDeCompra
Imprime o total do CarrinhoDeCompra
Imprime a quantidade utilizada de cada ingrediente
Entregue um c�digo organizado e limpo! */


public class Principal {

	public static void main(String[] args) {
	
		
		Pizza pizzaUm = new Pizza();
		Pizza pizzaDois = new Pizza();
		Pizza pizzaTres = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		pizzaUm.adicionaIngrediente("Queijo");
		pizzaUm.adicionaIngrediente("Tomate");
		
		pizzaDois.adicionaIngrediente("Calabreza");
		pizzaDois.adicionaIngrediente("Cebola");
		pizzaDois.adicionaIngrediente("Ovo");
		
		pizzaTres.adicionaIngrediente("Presunto");
		pizzaTres.adicionaIngrediente("Provolone");
		pizzaTres.adicionaIngrediente("Azeitona");
		pizzaTres.adicionaIngrediente("Cheddar");
		pizzaTres.adicionaIngrediente("Queijo");
		
		carrinho.adicionaCarrinho(pizzaUm);
		carrinho.adicionaCarrinho(pizzaDois);
		carrinho.adicionaCarrinho(pizzaTres);
		
		System.out.println("Valor final da compra: " + String.format("%.2f", carrinho.valorFinal()));
		
		System.out.println("Quantidade de ingredientes utilizadas: " + Pizza.quantidadeEstatica);
		
		
		System.out.println(pizzaUm.contarIngredientes());
		
		
	}

}
