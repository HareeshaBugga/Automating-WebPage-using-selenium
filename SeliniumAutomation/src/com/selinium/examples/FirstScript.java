package com.selinium.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; //used for drop-down or select option. 

public class FirstScript {

	public static void main(String[] args) {
				//Open the browser
			    System.setProperty("webdriver.chrome.driver", "C:\\Users\\haree\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
								
				// enter the url
				driver.get("https://www.mortgagecalculator.org/");
				driver.manage().window().maximize();  //to maximize
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
		 		//find the text field home value element, and enter 1000
				WebElement homeValueElement = driver.findElement(By.id("homeval"));
				homeValueElement.clear();
				homeValueElement.sendKeys("1000");
				
				WebElement downpayment = driver.findElement(By.id("downpayment"));
				downpayment.clear();
				downpayment.sendKeys("500");
				
				WebElement loanamount = driver.findElement(By.id("loanamt"));
				loanamount.clear();
				loanamount.sendKeys("200000");
				

				WebElement interestrate = driver.findElement(By.id("intrstsrate"));
				interestrate.clear();
				interestrate.sendKeys("10");
				

				WebElement loanterm = driver.findElement(By.id("loanterm"));
				loanterm.clear();
				loanterm.sendKeys("20");
				
				WebElement startdate= driver.findElementByName("param[start_month]");
				Select selectStartDate = new Select(startdate);
				selectStartDate.selectByIndex(11);
				//selectStartDate.selectByVisibleText("Dec");
				//selectStartDate.selectByValue("12");
				
				
				
				WebElement startyear = driver.findElementById("start_year");
				startyear.clear();
				startyear.sendKeys("2017");

				WebElement propertytax = driver.findElementById("pptytax");
				propertytax.clear();
				propertytax.sendKeys("2000");
				

				WebElement pmi = driver.findElementById("pmi");
				pmi.clear();
				pmi.sendKeys("0.2");
				

				WebElement homeins = driver.findElementById("hoi");
				homeins.clear();
				homeins.sendKeys("1200");
				

				WebElement hoa = driver.findElementById("hoa");
				hoa.clear();
				hoa.sendKeys("1");
				
				WebElement Loantype = driver.findElementByName("param[refiorbuy]"); //check to see if there is a different method to solve this. 
				Loantype.click();
				
				//Select loantype = (Select) driver.findElementByName("param[refiorbuy]");
				//loantype.selectByValue("1");
				
				WebElement cal = driver.findElementByName("cal");
				cal.click();
				
				driver.close(); //close only current browser
				//driver.quit(); //closes all browsers oepened by selenium
				
				
				
				
				
				
				
	}
}
