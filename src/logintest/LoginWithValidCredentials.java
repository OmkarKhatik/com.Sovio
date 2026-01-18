package logintest;

import org.openqa.selenium.By;

import utilityclass.BaseClass;

public class LoginWithValidCredentials extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		String expectedTitle = "Dashboard";
		preCondition();
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='email']"))
				.sendKeys("alex200230hales@gmail.com");
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='password']")).sendKeys("Alex@54321");
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();
		Thread.sleep(5000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("TestCase Passed and login successfull");
		} else {
			System.out.println("TestCase failed and Login unsuccessful");
		}
		postCondition();
	}

}
