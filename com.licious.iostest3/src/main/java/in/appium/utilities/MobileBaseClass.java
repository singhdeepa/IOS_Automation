package in.appium.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class MobileBaseClass 
{
	//protected static WebDriver driver;
	protected ExtentReports report;
	public static ExtentTest logger;
	public  AndroidDriver<MobileElement> driver;
	@BeforeSuite
	public void setupReport()
	{
		report=new ExtentReports("/Users/deepa/Desktop/in.licious.appiumtest/Mobile_Reports/"+ActionEngine.getCurrentDateTime()+".html");
	}
	//Users/deepa/Desktop/in.licious.appiumtest/Mobile_Reports
	
	@AfterMethod
	public void tearDownReport()
	{
		driver.removeApp("com.licious");
		report.endTest(MobileBaseClass.logger);
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
		
	}
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException, InterruptedException {
	    //File classpathRoot = new File(System.getProperty("user.dir"));
	    //File appDir = new File(classpathRoot, "/Apps/Amazon/");
	    //File app = new File(appDir, "in.amazon.mShop.android.shopping.apk"); 
		// MobileBaseClass.logger=report.startTest("Application Launched Su");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	    //DesiredCapabilities caps = DesiredCapabilities.android();
	 //   caps.setCapability("appiumVersion", "1.5.3");
	    capabilities.setCapability("platformName","android");
	    capabilities.setCapability("platformVersion","6.0");
	    //capabilities.setCapability("deviceName","Moto E");
//	    capabilities.setCapability("device","T03850CEE4");
//	    capabilities.setCapability("autoGrantPermissions", true);
	    capabilities.setCapability("deviceName","Moto E");
	    capabilities.setCapability("device","T03850CEE4");
	    
	    capabilities.setCapability("noReset","true");
	    capabilities.setCapability("automationName","uiautomater2");
	    
	    capabilities.setCapability("app","/Users/deepa/Desktop/in.licious.appiumtest/App_Android/110-343-dev-licious.apk");
	    capabilities.setCapability("appPackage","com.licious");
	    //capabilities.setCapability("appPackage","com.android.vending");
	  //  capabilities.setCapability("appActivity","com.android.vending.AssetBrowserActivity");
	    capabilities.setCapability("appActivity","com.licious.intro.activity.SplashActivity");
	    capabilities.setCapability("unicodeKeyboard", true);
	    capabilities.setCapability("resetKeyboard", true);
	   // capabilities.setCapability("automationName", "XCUITest");
	    Thread.sleep(500);
	 //   capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	    //capabilities.setCapability("app", app.getAbsolutePath());
	   // capabilities.setCapability("app", "/Users/deepa/Downloads/dev-3.3.27-bug-fix.apk");
	    Thread.sleep(500);
	    driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    driver.resetApp();
	    Thread.sleep(5000);
	   // WebDriverWait wait = new WebDriverWait(driver, 20);
//	    try {
//	        wait.until(ExpectedConditions.alertIsPresent());
//	        Thread.sleep(500);
//	        driver.switchTo().alert().accept();
//	        Thread.sleep(1000);
//	    } catch (Exception e) {
//	        System.err.println("   no alert visible after "+20+" sec.");
//	       
//	    }
//	    try {
//	        wait.until(ExpectedConditions.alertIsPresent());
//	        Thread.sleep(500);
//	        driver.switchTo().alert().dismiss();
//	        
//	    } catch (Exception e) {
//	        System.err.println("   no alert visible after "+20+" sec.");
//	       
//	    }
	    TouchAction action = new TouchAction(driver	);
        
		PointOption p1= new PointOption();
          Dimension dimensions = driver.manage().window().getSize();
          Double screenwidthtStart = dimensions.getWidth() * 0.5;
          int h1 = screenwidthtStart.intValue();
          Double screenWidthEnd = dimensions.getWidth() * 0.2;
          int h2 = screenWidthEnd.intValue();
          for (int i = 0; i <= 5; i++) {
        	  try {
        	  action.press(p1.point(376, 662)).moveTo(p1.point(50,662)).release().perform();
	          Thread.sleep(1000);
        	  }catch (Exception e) {
				// TODO: handle exception
			}
		} 
	}
	@AfterSuite
	public void generateReport()
	{
		report.flush();
	}
	
}
