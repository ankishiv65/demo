package Ecommerce;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
	
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
 capabilities.setCapability("appPackage","com.androidsample.generalstore");
 
 capabilities.setCapability("appActivity","com.androidsample.generalstore.SplashActivity");
driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
return driver;
	}

}
