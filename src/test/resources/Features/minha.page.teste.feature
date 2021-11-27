#Author: dijoansantos@gmail.com


@testebotoes
Feature: Validar solicitação de seguro
  Como usuário quero solicitar cotacoes para validar precos

Background: Acessar o site para 
    Given que acesse o site da tricentis para fazer o teste "http://sampleapp.tricentis.com/"
    
	@automobile
  Scenario: cotacao automobile
    And clico no menu "automobile"
    When preencher os dados do veiculo de teste
    And preencher os dados do seguro de teste
    And preencher os dados do produto de teste
    And preencher os dados do preco de teste
    And envio a cotacao de teste
    Then valido a cotacao enviada de teste
    
     @truck 
  Scenario: cotacao truck
    And clico no menu "truck"
    When preencher os dados do veiculo de teste
    And preencher os dados do seguro de teste
    And preencher os dados do produto de teste
    And preencher os dados do preco de teste
    And envio a cotacao de teste
    Then valido a cotacao enviada de teste
    
  @motorcycle
  Scenario: cotacao motocicle
    And clico no menu "motorcycle"
    When preencher os dados do veiculo de teste
    And preencher os dados do seguro de teste
    And preencher os dados do produto de teste
    And preencher os dados do preco de teste
    And envio a cotacao de teste
    Then valido a cotacao enviada de teste

	@camper 
  Scenario: cotacao camper
    And clico no menu "camper"
    When preencher os dados do veiculo de teste
    And preencher os dados do seguro de teste
    And preencher os dados do produto de teste
    And preencher os dados do preco de teste
    And envio a cotacao de teste
    Then valido a cotacao enviada de teste
      
    
    