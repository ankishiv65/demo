package Appium.AppiumSample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Chrome_realdevice {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver;

		// TODO Auto-generated method stub
	// File appDir = new File("src");
	// File app = new File(appDir, "ApiDemos-debug.apk");
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 
	 capabilities.setCapability("deviceName", "Redmi 6");
	 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	 capabilities.setCapability("udid","4588a8e87d29");//extracted from cmd -adb devices
	 capabilities.setCapability("platformName","Android");
	//capabilities.setCapability("platformVersion","Android");
	 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElementByName("q").sendKeys("Ankit");
  driver.findElementByXPath("//input[@value='Google Search']").click();
	}

}
