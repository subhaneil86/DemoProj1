package com.ecomm.shcart.RSAcademy1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GreenKart {
	
	WebDriver driver;
	//String[] vegetables = {"Carrot","Beetroot"};
	HashMap<String, String> vegetables = new HashMap<String, String>();
	
	
	@BeforeSuite
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "H:\\ExternalJars\\ChromeDriver83\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void putVegetablesinList(){
		vegetables.put("Carrot", "2");
		vegetables.put("Beetroot", "2");
	}

	@Test
	public void selectVegetable() throws InterruptedException{
		int i = 0;
		String vegName="";
		String vegList="";
		String addToCart="";
		vegetables.get("Carrot");
		System.out.println(vegetables.get("Carrot"));
		/*for (i=1;i<=30;i++){
			vegName="//*[@id='root']/div/div[1]/div/div["+i+"]/h4";
			addToCart="//*[@id='root']/div/div[1]/div/div["+i+"]/div[3]/button";
			String name=driver.findElement(By.xpath(vegName)).getText();
			for (int j=0;j<vegetables.length;j++){
				vegList=".*"+vegetables[j]+".*";
				if (name.matches(vegList)){
					Thread.sleep(5000);
					driver.findElement(By.xpath(addToCart)).click();
				}
			}
			vegList="";
			
		
		}*/
		
	}
	

}
