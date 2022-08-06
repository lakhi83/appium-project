package pkg1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Flipcart {
	private AndroidDriver<MobileElement> driver;
	TouchAction touchAction;
	
	
	@BeforeMethod
	
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:platformVersion", "7.0");
		desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
		// desiredCapabilities.setCapability("appium:app", "C:\\Users\\surinder86\\Desktop\\ApiDemos-debug.apk");
		desiredCapabilities.setCapability("appium:appPackage", "com.flipkart.android");
		desiredCapabilities.setCapability("appium:appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");


		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		touchAction = new TouchAction(driver);

		System.out.println(driver.getSessionId());
	}
	
	@Test	
	public void Flipcartselection() throws InterruptedException {
		Thread.sleep(3000);
	//driver.findElementByXPath("//android.widget.RelativeLayout[4]//android.widget.ImageView[1]").click();
	//driver.findElementById("com.flipkart.android:id/select_btn").click();

	driver.findElementById("com.flipkart.android:id/custom_back_icon").click();
	Thread.sleep(5000);
	
	driver.findElementById("com.flipkart.android:id/search_widget_textbox").click();
	
	driver.findElementById("com.flipkart.android:id/search_autoCompleteTextView").sendKeys("Laptop bags");
	
	
	
	
	
	
	

	
	

	
	

}
	
	
}
