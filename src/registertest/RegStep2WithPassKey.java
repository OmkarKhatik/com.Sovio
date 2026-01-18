package registertest;

import org.openqa.selenium.By;

import utilityclass.BaseClass;

public class RegStep2WithPassKey extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		preCondition();
		driver.findElement(By.xpath("//a[@class='url-link' and text() = 'Create one']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='email']")).sendKeys("y4zs9@virgilian.com");
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-slot='input' and @name='firstName']")).sendKeys("Roy");
		driver.findElement(By.xpath("//input[@data-slot='input' and @name='lastName']")).sendKeys("Roy");
		driver.findElement(By.xpath("//button[contains(text(),'Passkey')]")).click();
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();
		Thread.sleep(5000);
		postCondition();

	}

}
