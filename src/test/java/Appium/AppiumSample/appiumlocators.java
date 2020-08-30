package Appium.AppiumSample;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class appiumlocators extends base {
	public static void main(String[] args) throws MalformedURLException{

	AndroidDriver<AndroidElement>  driver;
	driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	driver.findElementByXPath("//*[@text='3. Preference dependencies']").click();
	driver.findElementById("android:id/checkbox").click();
	//2 ways to handle duplicate 
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	driver.findElementsByClassName("//android.widget.RelativeLayout").get(2).click();
	driver.findElementById("android:id/edit").sendKeys("Ankit");
	driver.findElementById("android:id/button1").click();
	//ui automator
	//driver.findElementByAndroidUIAutomator("attribute(\"value"\)");
	
}
}
