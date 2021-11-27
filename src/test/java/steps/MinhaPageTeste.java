package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodo;
import pages.Automobile;
import pages.Camper;
import pages.Elementos;
import pages.HomePage;
import pages.Motorcycle;
import pages.Truck;

public class MinhaPageTeste {

	HomePage home = new HomePage();
	Metodo metodos = new Metodo();
	Elementos el = new Elementos();
	Camper camper = new Camper();
	Motorcycle motorcycle = new Motorcycle();
	Automobile automobile = new Automobile();
	Truck truck = new Truck();
	
	@Given("que acesse o site da tricentis para fazer o teste {string}")
	public void que_acesse_o_site_da_tricentis_para_fazer_o_teste(String site) {

		metodos.abrirNavegador(site);

	}

	@Given("clico no menu {string}")
	public void clico_no_menu(String clicar) {

		
		home.menu(clicar);

	}

	@When("preencher os dados do veiculo de teste")
	public void preencher_os_dados_do_veiculo_de_teste() {
		
		
		automobile.automobile();
		motorcycle.motorcycle();
		truck.truck();
	}

	@When("preencher os dados do seguro de teste")
	public void preencher_os_dados_do_seguro_de_teste() {

		automobile.automobile();
		motorcycle.motorcycle();
		truck.truck();

	}

	@When("preencher os dados do produto de teste")
	public void preencher_os_dados_do_produto_de_teste() {

		automobile.automobile();
		motorcycle.motorcycle();
		truck.truck();
	}

	@When("preencher os dados do preco de teste")
	public void preencher_os_dados_do_preco_de_teste() {
		automobile.automobile();
		motorcycle.motorcycle();
		truck.truck();

	}

	@When("envio a cotacao de teste")
	public void envio_a_cotacao_de_teste() {

		automobile.automobile();
		motorcycle.motorcycle();
		truck.truck();

	}

	@Then("valido a cotacao enviada de teste")
	public void valido_a_cotacao_enviada_de_teste() {
		
		
	    
	}

}
