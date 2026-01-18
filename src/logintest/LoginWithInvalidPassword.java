package logintest;

import org.openqa.selenium.By;

import utilityclass.BaseClass;

public class LoginWithInvalidPassword extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Invalid Credentials.";
		preCondition();
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='email']"))
				.sendKeys("alex200230hales@gmail.com");
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='password']")).sendKeys("Alex@52221");
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();
		Thread.sleep(5000);
		String errorMsg = driver.findElement(By.xpath("//div[text()='Invalid Credentials.']")).getText();
		System.out.println(errorMsg);
		Thread.sleep(5000);

		if (expectedErrorMsg.equals(errorMsg)) {
			System.out.println("TestCase Passed and login unsuccessfull");
		} else {
			System.out.println("TestCase failed and Login successful");
		}
		postCondition();
	}

}
