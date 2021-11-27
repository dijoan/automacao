package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//caminho das features incluindo os foldres
		features = "src/test/resources/features",
		
		//o nome da package que tem os steps
		glue = "steps",
		
		//tags que estao na features
		tags = "@testebotoes",
		
		//valida se existe alguma linha do gherkins sem o step associado
		dryRun = false,
		
		//puglin serve para colocarmos formatações e extensões
		//pretty serve para deixar o console do cucumber
		//htms: gera um status report em html
		plugin = {"pretty","html:target/report.html"},
		
		//monochrome limpa os caracteres do console
		monochrome = true
		
		) 

public class Executa {

}
