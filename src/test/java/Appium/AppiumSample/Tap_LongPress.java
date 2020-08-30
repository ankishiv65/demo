package Appium.AppiumSample;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static java.time.Duration.ofSeconds;
public class Tap_LongPress extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement>  driver;
		driver=capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		WebElement expandablelist=driver.findElementByXPath("//*[@text='Expandable Lists']");
		//Tap
		TouchAction t1=new TouchAction(driver);
		t1.tap(tapOptions().withElement(element(expandablelist))).perform();	
		driver.findElementByXPath("//*[@text='1. Custom Adapter']").click();
		
		//Long Press
		WebElement PeopleNames=driver.findElementByXPath("//*[@text='People Names']");
		t1.longPress(longPressOptions().withElement(element(PeopleNames)).withDuration(ofSeconds(2))).release().perform();
	}

	

}
