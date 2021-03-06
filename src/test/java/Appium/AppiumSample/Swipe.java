package Appium.AppiumSample;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement>  driver;
		driver=capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@content-desc='9']").click();
		WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
		//swipe=longpress on for 1 sec+move to other element+release
		TouchAction t=new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(1))).moveTo(element(second)).release().perform();
	}

}
