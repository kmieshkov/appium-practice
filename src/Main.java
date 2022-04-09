import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static DesiredCapabilities getCapabilities() {
		// apk location
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");

		// Capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_XL_API_30");
		capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

		return capabilities;
	}

	public static AndroidDriver getDriver() throws MalformedURLException {

		DesiredCapabilities capabilities = getCapabilities();

		// Android driver
		URL server = new URL("http://0.0.0.0:4723/wd/hub"); // Appium server
		AndroidDriver driver = new AndroidDriver(server, capabilities);

		return driver;
	}
}
