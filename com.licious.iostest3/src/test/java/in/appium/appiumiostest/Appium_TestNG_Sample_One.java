package in.appium.appiumiostest;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium_TestNG_Sample_One {

private static  IOSDriver<MobileElement> driver;

@Test
public void f() {
    
    try
    {
        WebElement element=driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Licious\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePageIndicator"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> swipeObject = new HashMap<String, String>();
        //swipeObject.put("direction", "left");
       // swipeObject.put("element", ((RemoteWebElement) element).getId());
        //js.executeScript("mobile: swipe", swipeObject);
        Thread.sleep(500);
        WebElement getStartedBtn=driver.findElement(By.id("LET'S GET STARTED"));
        getStartedBtn.click();
        Thread.sleep(500);
 WebElement location=   driver.findElement(By.id("Search for your Delivery location"));
 
 location.sendKeys("Indira Nagar");
 
 driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Indira Nagar\"])[1]")).click();
 Thread.sleep(500);
 driver.findElement(By.id("Weekend Treats")).click();
 Thread.sleep(500);
 driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"ADD TO CART\"])[1]")).click();
 //location.sendKeys(Keys.DOWN,Keys.ENTER);
//WebElement useLocation=driver.findElement(By.id("Use Loaction"));
//useLocation.click();
    }catch(Exception e)
    {
        
    }
}

@BeforeMethod
public void beforeMethod() throws MalformedURLException, InterruptedException {
    //File classpathRoot = new File(System.getProperty("user.dir"));
    //File appDir = new File(classpathRoot, "/Apps/Amazon/");
    //File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");    
    DesiredCapabilities capabilities = new DesiredCapabilities();
    //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability("deviceName", "iPhone 6");
    Thread.sleep(500);
    capabilities.setCapability("platformVersion", "11.4.1");
    Thread.sleep(500);
    capabilities.setCapability("platformName", "iOS");
    capabilities.setCapability("udid", "dbe992ded821c2bfb413ea887b6120b17316bf95");
    Thread.sleep(500);
    capabilities.setCapability("automationName", "XCUITest");
    Thread.sleep(500);
    capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
    //capabilities.setCapability("app", app.getAbsolutePath());
    capabilities.setCapability("app", "/Users/deepa/Desktop/Licious.ipa");
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

@AfterMethod
public void afterMethod() {
}
}
