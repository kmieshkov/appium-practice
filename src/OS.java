import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class OS extends Main {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = getDriver();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='OS']")).click();
		driver.quit();
	}
}
