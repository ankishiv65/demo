package Appium.AppiumSample;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling extends base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver;
		driver=capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Visibility\"));");
		driver.findElementByAndroidUIAutomator("text(\"Visibility\")").click();
	}

}
