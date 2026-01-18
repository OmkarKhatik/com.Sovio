package forgotpassword;

import org.openqa.selenium.By;

import utilityclass.BaseClass;

public class ForgotPassword extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		preCondition();
		System.out.println("");
		driver.findElement(By.xpath("//input[@data-slot='input' and @type='email']"))
				.sendKeys("alex200230hales@gmail.com");
		driver.findElement(By.xpath("//button[@data-slot='button' and text()='Forgot password?']")).click();
		Thread.sleep(2000);
		String confirmMsg = driver
				.findElement(By.xpath("//div[text()='Reset password link has been sent to your mail']")).getText();
		Thread.sleep(2000);

		String expectedMsg = "Reset password link has been sent to your mail";
		System.out.println(confirmMsg);
		if (expectedMsg.equals(confirmMsg)) {
			System.out.println("TestCasePass and link set");
		} else {
			System.out.println("Test Case failed and link not set");
		}
		postCondition();
	}

}
