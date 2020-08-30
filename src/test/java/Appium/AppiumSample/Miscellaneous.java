package Appium.AppiumSample;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;

public class Miscellaneous extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver;
		driver=capabilities();
		
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getDeviceTime());
		
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	

	}

}
