package com.intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Launch Chrome
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:/Users/SBI-TESTING/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//driver.get("https://rahulshettyacademy.com/");
	
		//Launch FireFox
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "C:/Users/SBI-TESTING/Downloads/geckodriver-v0.35.0-win64/geckodriver.exe");
		//driver.get("https://rahulshettyacademy.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
		//Launch Edge
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:/Users/SBI-TESTING/Downloads/edgedriver_win64 (1)/msedgedriver.exe");
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
		
		
	}

}
