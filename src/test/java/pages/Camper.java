package pages;

import metodos.Browsers;
import metodos.Metodo;

public class Camper {
	
	Metodo metodos = new Metodo();
	Elementos el = new Elementos();
	Browsers browsers = new Browsers();
	
	
	public void camper() {
		// public void preencher_os_dados_do_veiculo_de_teste
		metodos.clicar(el.getMake());
		metodos.escrever(el.getEnginePerformance(), "105");
		metodos.escrever(el.getDateofManufacture(), "01/01/2020");
		metodos.escrever(el.getNumberOfSeats(), "4");
		metodos.clicar(el.getFuel());
		metodos.escrever(el.getPayload(), "800");
		metodos.escrever(el.getTotalWeight(), "15000");
		metodos.escrever(el.getListPrice(), "10000");
		metodos.escrever(el.getLicensePlateNumber(), "0123456789");
		metodos.escrever(el.getAnnualMileage(), "10000");
		metodos.clicar(el.getBotaoNext1());
		// public void preencher_os_dados_do_seguro_de_teste
		metodos.escrever(el.getFirstName(), "jsdjfh");
		metodos.escrever(el.getLastname(), "dskjhdj");
		metodos.escrever(el.getDateOfBirth(), "09/10/1990");
		metodos.clicar(el.getGenderM());
		metodos.escrever(el.getStreetAddress(), "Rua lalalal");
		metodos.clicar(el.getCountry());
		metodos.escrever(el.getZipCode(), "04890520");
		metodos.escrever(el.getCity(), "São Paulo");
		metodos.clicar(el.getOccupation());
		metodos.clicar(el.getHobbies());
		metodos.escrever(el.getWebsite(), "www.dshcsgdh.com.br");
		metodos.clicar(el.getBotaoNext2());
		// public void preencher_os_dados_do_produto_de_teste
		metodos.escrever(el.getStartDate(), "01/02/2022");
		metodos.clicar(el.getInsurancesum());
		metodos.clicar(el.getMeritrating());
		metodos.clicar(el.getDamageInsurance());
		metodos.clicar(el.getEuroProtection());
		metodos.clicar(el.getCourtesycarno());
		metodos.clicar(el.getBotaoNext3());
		// public void preencher_os_dados_do_preco_de_teste() {
		metodos.clicar(el.getSelecSilver());
		metodos.clicar(el.getSelecPlatinum());
		metodos.esperarElementoClicavel(el.getBotaoNext(), 2);
		metodos.clicar(el.getBotaoNext());
		// public void envio_a_cotacao_de_teste()
		metodos.escrever(el.getEmail(), "sxsahbh@gsakj.com");
		metodos.escrever(el.getPhone(), "119999999");
		metodos.escrever(el.getUsername(), "Filomena");
		metodos.escrever(el.getPassword(), "Gloria2021");
		metodos.escrever(el.getConfirmPassword(), "Gloria2021");
		metodos.escrever(el.getComments(), "Bla bla bla");
		metodos.clicar(el.getSendEmail());
		// public void valido_a_cotavao_enviada_de_teste
		metodos.pausa(5000);
		metodos.screenshot("Evidencia Seguro CAMPER cadastrada com sucesso");
		metodos.clicar(el.getOk());
		browsers.fechar();

	}

}
