package com.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/SBI-TESTING/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Nidhi Nagdeve");
		driver.findElement(By.name("email")).sendKeys("nidhinagdeve99@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Nidhi123#");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		//static dropdown
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");
		driver.findElement(By.name("bday")).sendKeys("20/08/1999");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
