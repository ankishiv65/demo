package Appium.AppiumSample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiautomator extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement>  driver;
		driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//ui automator
		//driver.findElementByAndroidUIAutomator("attribute(\"value"\)");
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	System.out.println(driver.findElementsByAndroidUIAutomator("new UISelector().clickable(true)").size());

	}

}
