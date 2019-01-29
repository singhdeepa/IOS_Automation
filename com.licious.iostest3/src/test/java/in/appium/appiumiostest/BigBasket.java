package in.appium.appiumiostest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;


public class BigBasket {
	
	private static  IOSDriver<MobileElement> driver;
	@Test
	public void f() {
	    
	    try
	    {
	       // WebElement element=driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Licious\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePageIndicator"));
	       // JavascriptExecutor js = (JavascriptExecutor) driver;
	    //    HashMap<String, String> swipeObject = new HashMap<String, String>();
	        //swipeObject.put("direction", "left");
	       // swipeObject.put("element", ((RemoteWebElement) element).getId());
	        //js.executeScript("mobile: swipe", swipeObject);
	        Thread.sleep(500);
	       driver.findElementByAccessibilityId("Shop By Category").click();
	       Thread.sleep(500);
	       driver.findElementByAccessibilityId("Search 18000+ products").sendKeys("Fruits");
	       Thread.sleep(500);
	       driver.findElementByAccessibilityId("Fresho").click();
	       Thread.sleep(500);
	       //driver.findElementByAccessibilityId("Banana, Sapota & Papaya").click();
	       Thread.sleep(500);
	       driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"addBtn\"])[1]").click();
	       Thread.sleep(500);
	     String s=  driver.findElementByXPath("//XCUIElementTypeButton[@label=\"Vegetarian\"]").getText();
	     Thread.sleep(500);
	     System.out.println(s);
	//useLocation.click();
	    }catch(Exception e)
	    {
	        
	    }
	}
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException, InterruptedException {
	    //File classpathRoot = new File(System.getProperty("user.dir"));
	    
	DesiredCapabilities capabilities = new DesiredCapabilities();
    //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability("deviceName", "iPhone 5s");
    Thread.sleep(500);
    capabilities.setCapability("platformVersion", "12.1.2");
    Thread.sleep(500);
    capabilities.setCapability("platformName", "iOS");
    capabilities.setCapability("udid", "8be2febde89e8e664a85c2b038229953f1a7c48e");
    Thread.sleep(500);
    capabilities.setCapability("automationName", "XCUITest");
    Thread.sleep(500);
    capabilities.setCapability("autoAcceptAlerts", false);
    //capabilities.setCapability("resetKeyboard", true);
    capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
    //capabilities.setCapability("app", app.getAbsolutePath());
    //capabilities.setCapability("app", "/Users/deepa/Desktop/Licious.ipa");
    Thread.sleep(500);
    driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 20);
    try {
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
    } catch (Exception e) {
        System.err.println("   no alert visible after "+20+" sec.");
       
    }
    try {
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(500);
        driver.switchTo().alert().dismiss();
        
    } catch (Exception e) {
        System.err.println("   no alert visible after "+20+" sec.");
       
    }
    
}
}
