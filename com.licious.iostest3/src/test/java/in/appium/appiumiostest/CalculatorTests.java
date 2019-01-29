package in.appium.appiumiostest;


	import org.testng.annotations.Test;
	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.Test;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.remote.MobileCapabilityType;

	public class CalculatorTests {

	 @Test
	 public void testCalculator() throws MalformedURLException, InterruptedException {
	  
	  File appDir = new File(System.getProperty("user.dir") + "/apps");
	  File app = new File(appDir, "calc_debug.apk");
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"192.168.56.101:5555");
	  capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	  capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
	  capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
	  
	  AppiumDriver<MobileElement> driver =  
	    new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	  Thread.sleep(5000);
	  driver.quit();
	 }
	
}
