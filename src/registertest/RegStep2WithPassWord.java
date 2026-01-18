package registertest;

import org.openqa.selenium.By;

import utilityclass.BaseClass;

public class RegStep2WithPassWord extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		preCondition();
		driver.findElement(By.xpath("//a[@class='url-link' and text() = 'Create one']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='email']")).sendKeys("pf9j4@virgilian.com");
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-slot='input' and @name='firstName']")).sendKeys("Roy");
		driver.findElement(By.xpath("//input[@data-slot='input' and @name='lastName']")).sendKeys("Roy");
		driver.findElement(By.xpath("//input[@data-slot='input' and @name='password']")).sendKeys("Roy@12345");
		driver.findElement(By.xpath("//input[@data-slot='input' and @name='confirmPassword']")).sendKeys("Roy@12345");
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();
		Thread.sleep(5000);

		String expectedUrl = "https://dev.sovio.id/sign-in";
		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Test Case Passed and successful registered");
		} else {
			System.out.println("Test Case Failed and registeration failed");
		}

	}
}
