package Appium.AppiumSample;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Drag_and_drop extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver;
		driver=capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		WebElement drag=driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement drop=driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		TouchAction t=new TouchAction(driver);
		//drag_and_drop=longpress_for_1second+moveto other+release+perform
		t.longPress(longPressOptions().withElement(element(drag)).withDuration(ofSeconds(1))).moveTo(element(drop)).release().perform();
		
		
	}

}
