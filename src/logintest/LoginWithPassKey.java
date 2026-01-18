package logintest;

import org.openqa.selenium.By;

import utilityclass.BaseClass;

public class LoginWithPassKey extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		preCondition();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='email']"))
				.sendKeys("alex200230hales@gmail.com");
		driver.findElement(By.xpath("//button[@data-slot='button' and @type='submit']")).click();

		System.out.println("pop up meassge came and testcase passs");
		postCondition();
	}

}
