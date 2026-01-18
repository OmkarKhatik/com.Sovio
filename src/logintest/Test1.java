package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.sovio.id/sign-in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email' and @data-slot='input']")).sendKeys("test@gmail.com");

		Thread.sleep(2000);
		driver.close();

	}
}
