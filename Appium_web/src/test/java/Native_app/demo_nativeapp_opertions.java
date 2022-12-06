package Native_app;


import java.net.MalformedURLException;
import java.net.URL;
import static java.time.Duration.ofSeconds;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
public class demo_nativeapp_opertions {
	AndroidDriver<AndroidElement> driver;	
	@BeforeTest	
		public void details() throws MalformedURLException{
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
			driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			
		}
	@Test(enabled=false)
	public void keyboardactions() throws InterruptedException {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
	}
	@Test(enabled=false)
	public void swap_Drapanddropaction() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		
		driver.findElement(MobileBy.AccessibilityId("12")).click();
		
		AndroidElement on=driver.findElement(MobileBy.AccessibilityId("15"));
		
		AndroidElement tw=driver.findElement(MobileBy.AccessibilityId("45"));
		
		TouchAction tee=new TouchAction(driver);
		
		tee.longPress(longPressOptions().withElement(element(on)).withDuration(ofSeconds(3))).moveTo(element(tw)).release().perform();
		
		driver.findElementByAndroidUIAutomator("text(\"PM\")").click();
		
		//drag and drop actions
		
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
		
		AndroidElement doe1=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));
		AndroidElement doe2=driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_3"));
		Thread.sleep(3000);
		tee.longPress(longPressOptions().withElement(element(doe2)).withDuration(ofSeconds(5))).moveTo(element(doe1)).release().perform();
		
		
		
		
		
	}
	
	@Test(enabled=true)
	public void notification() throws InterruptedException {
		driver.openNotifications();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Open quick settings.")).click();
	
		AndroidElement on=driver.findElement(MobileBy.className("android.view.ViewGroup"));
		
		AndroidElement tw=driver.findElement(MobileBy.className("android.support.v4.view.ViewPager"));
		
		TouchAction tee=new TouchAction(driver);
		
		tee.longPress(longPressOptions().withElement(element(on)).withDuration(ofSeconds(3))).moveTo(element(tw)).release().perform();
		
		//driver.findElementByAndroidUIAutomator("text(\"PM\")").click();
		
	}
	
}
