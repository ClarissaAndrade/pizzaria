/*Faça os testes de unidade da classe Pizza e verifique se o valor da Pizza está correto de acordo com a quantidade de ingredientes. Verifique
 também se o registro de ingredientes funcionou corretamente. Crie um método estático na classe Pizza que zera o registro de ingredientes e 
 invoque ele em um método de inicialização ou finalização na classe de testes. Um método de teste deve ser independente do que aconteceu em 
 outros métodos de teste!

Faça os testes da classe CarrinhoDeCompras, verificando se o preço das pizzas são somados corretamente e se ele impede a adição de uma pizza 
sem ingredientes.

Procure criar os testes de forma que cada método de testes verifique um cenário e uma funcionalidade. Evite por exemplo, em um mesmo teste, 
verificar o preço da pizza e o registro de ingredientes ao mesmo tempo.*/


import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Testes {
	
	@Before
	void zerar () {
	Pizza.zeraIngredientes();
	}

	@Test
	void valorPizzaQuinze() {
		
		Pizza pizzaTesteUm = new Pizza();
		CarrinhoDeCompras carrinhoTesteUm = new CarrinhoDeCompras();
		
		pizzaTesteUm.adicionaIngrediente("Queijo");
		pizzaTesteUm.adicionaIngrediente("Tomate");
		
		carrinhoTesteUm.adicionaCarrinho(pizzaTesteUm);
		
		double resultado = carrinhoTesteUm.valorFinal();
		assertEquals(15, resultado);		
	}
	
	@Test
	void valorPizzaVinte() {
		
		Pizza pizzaTesteDois = new Pizza();
		CarrinhoDeCompras carrinhoTesteDois = new CarrinhoDeCompras();
		
		pizzaTesteDois.adicionaIngrediente("Queijo");
		pizzaTesteDois.adicionaIngrediente("Tomate");
		pizzaTesteDois.adicionaIngrediente("Orégano");
		
		carrinhoTesteDois.adicionaCarrinho(pizzaTesteDois);
		
		double resultado = carrinhoTesteDois.valorFinal();
		assertEquals(20, resultado);		
	}
	
	@Test
	void valorPizzaVinteTres() {
		
		Pizza pizzaTesteTres = new Pizza();
		CarrinhoDeCompras carrinhoTesteTres = new CarrinhoDeCompras();
		
		pizzaTesteTres.adicionaIngrediente("Queijo");
		pizzaTesteTres.adicionaIngrediente("Tomate");
		pizzaTesteTres.adicionaIngrediente("Orégano");
		pizzaTesteTres.adicionaIngrediente("Presunto");
		pizzaTesteTres.adicionaIngrediente("Palmito");
		pizzaTesteTres.adicionaIngrediente("Ovo");
		
		carrinhoTesteTres.adicionaCarrinho(pizzaTesteTres);
		
		double resultado = carrinhoTesteTres.valorFinal();
		assertEquals(23, resultado);		
	}
	
	@Test
	void carrinhoDeCompras() {
		
		Pizza pizzaTesteUm = new Pizza();
		Pizza pizzaTesteDois = new Pizza();
		CarrinhoDeCompras carrinhoTeste = new CarrinhoDeCompras();
		
		pizzaTesteUm.adicionaIngrediente("Queijo");
		pizzaTesteUm.adicionaIngrediente("Tomate");
		carrinhoTeste.adicionaCarrinho(pizzaTesteUm);
		
		pizzaTesteDois.adicionaIngrediente("Orégano");
		pizzaTesteDois.adicionaIngrediente("Presunto");
		pizzaTesteDois.adicionaIngrediente("Palmito");
		pizzaTesteDois.adicionaIngrediente("Ovo");
		carrinhoTeste.adicionaCarrinho(pizzaTesteDois);
		
		double resultado = carrinhoTeste.valorFinal();
		assertEquals(35, resultado);		
	}
	
	@Test
	void carrinhoDeComprasVazio() {
		
		Pizza pizzaTeste = new Pizza();
		CarrinhoDeCompras carrinhoTeste = new CarrinhoDeCompras();
		
		carrinhoTeste.adicionaCarrinho(pizzaTeste);
		
		double resultado = carrinhoTeste.valorFinal();
		assertEquals(0, resultado);		
	}
	
    @Test
    public void devePossuirAQuantidadeCorretaDeIngredientes() {
        
    	Pizza fixture = new Pizza();
        fixture.adicionaIngrediente("ingredienteA");
        fixture.adicionaIngrediente("ingredienteA");
        fixture.adicionaIngrediente("ingredienteB");
        fixture.adicionaIngrediente("ingredienteB");
        fixture.adicionaIngrediente("ingredienteB");
        fixture.adicionaIngrediente("ingredienteC");
        
        Map<String, Integer> actual = fixture.contarIngredientes();
        
        Assertions.assertEquals(2, actual.get("ingredienteA"));
        Assertions.assertEquals(3, actual.get("ingredienteB"));
        Assertions.assertEquals(1, actual.get("ingredienteC"));
    }

}
	
