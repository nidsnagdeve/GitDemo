package com.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/SBI-TESTING/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//parent-child, sibling-sibling traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		//parent-child, child-parent traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}

}
