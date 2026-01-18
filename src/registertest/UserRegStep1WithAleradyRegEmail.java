package registertest;

import org.openqa.selenium.By;

import utilityclass.BaseClass;

public class UserRegStep1WithAleradyRegEmail extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='url-link' and text() = 'Create one']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email' and @data-slot='input']"))
				.sendKeys("alex200230hales@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();
		Thread.sleep(5000);
		String expectedMsg = "User already exists";
		String verificationMsg = driver.findElement(By.xpath("//div[contains(text(),'User already exists')]"))
				.getText();

		if (verificationMsg.equals(expectedMsg)) {
			System.out.println("TestCase Passed and successful msg User already exists");
		} else {
			System.out.println("Test Case failed");
		}
		postCondition();
	}

}
