package br.ce.wcaquino.convertes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmbiente {

	
	public static void main(String[] args) {
		
		//Somente na pasta ocm od river na pasta
	//	System.setProperty("webdriver.chorme.driver", "c:\\SELENIUM\\Selenium\\Drives\\chromedriver.exe");
		
		//Salvado no pacth do windows
		WebDriver driver =  new ChromeDriver();
		
				driver.get("https://srbarriga.herokuapp.com/login");
		
	}
}
