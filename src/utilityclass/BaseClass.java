package utilityclass;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static ChromeDriver driver = null;

	public static void preCondition() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.sovio.id/sign-in");
		Thread.sleep(2000);
	}

	public static void postCondition() {
		driver.quit();
	}

}
