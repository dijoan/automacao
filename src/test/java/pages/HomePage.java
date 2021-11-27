package pages;

import org.openqa.selenium.By;

import metodos.Metodo;

public class HomePage {

	 Metodo metodos = new Metodo();
	 By automobile = By.id("nav_automobile");
	 By truck = By.id("nav_truck");
	 By motorcycle = By.id("nav_motorcycle");
	 By camper = By.id("nav_camper");
	
	 
 public void menu(String menu) {
	 	 
	 if (menu.equalsIgnoreCase("automobile")) {
		 metodos.clicar(automobile); 
		 }else if (menu.equalsIgnoreCase("truck")) {
		 metodos.clicar(truck);
	 }else if (menu.equalsIgnoreCase("motorcycle")) {
	 metodos.clicar(motorcycle);
 	}else if (menu.equalsIgnoreCase("camper")) {
 		metodos.clicar(camper);
 	} else {
 		System.out.println("------OPÇÃO INVÁLIDA------");
 	}
	 

	 
}
	
}
