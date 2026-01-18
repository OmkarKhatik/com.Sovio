package logintest;

import org.openqa.selenium.By;
import utilityclass.BaseClass;

public class LoginWithBlankEmail extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Enter a valid email";
		preCondition();
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='password']")).sendKeys("Alex@54321");
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();
		Thread.sleep(5000);
		String errorMsg = driver.findElement(By.xpath("//p[@id='_r_0_-form-item-message']")).getText();
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
