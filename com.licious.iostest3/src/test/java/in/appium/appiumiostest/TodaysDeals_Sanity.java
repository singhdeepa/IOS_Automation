package in.appium.appiumiostest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import in.appium.utilities.ActionEngine;
import in.appium.utilities.MobileBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;


import java.net.MalformedURLException;
import java.net.URL;

import java.util.HashMap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;





public class TodaysDeals_Sanity extends MobileBaseClass{

private static  IOSDriver<MobileElement> driver;

@Test
public void f() {
    
    try
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	HashMap<String, String> scrollObject = new HashMap<String, String>();
    	scrollObject.put("direction", "right");
    	js.executeScript("mobile: scroll", scrollObject);
    	Thread.sleep(5000);
    	scrollObject.put("direction", "right");
    	js.executeScript("mobile: scroll", scrollObject);
    	Thread.sleep(5000);
    	scrollObject.put("direction", "right");
    	js.executeScript("mobile: scroll", scrollObject);
    	Thread.sleep(5000);
    	scrollObject.put("direction", "right");
    	js.executeScript("mobile: scroll", scrollObject);
        
        MobileBaseClass.logger=report.startTest("Test Native Application");
        WebElement getStartedBtn=driver.findElement(By.id("LET'S GET STARTED"));
        getStartedBtn.click();
       
        Thread.sleep(1000);
 WebElement location=   driver.findElement(By.id("Search for your Delivery location"));
 
 location.sendKeys("Indira Nagar");
 //MobileBaseClass.logger.log(LogStatus.INFO,MobileBaseClass.logger.addScreenCapture(ActionEngine.captureScreenshot(driver, "Login")));
 MobileBaseClass.logger.log(LogStatus.PASS,"Location is entered successfully");
 driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Indira Nagar\"])[1]")).click();
 Thread.sleep(2000);
 //driver.findElement(By.id("Chicken")).click();
 driver.findElementByAccessibilityId("Today's Deals-bk").click();
 //WebElement marinadesItem=driver.findElementByAccessibilityId("Marinades");
 //JavascriptExecutor executor = (JavascriptExecutor)driver;

 //executor.executeScript("arguments[0].click();", marinadesItem);
 //driver.findElement(By.id("Weekend Treats")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"ADD TO CART\"])[1]")).click();
 Thread.sleep(500);
 driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Licious\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[3]");
 Thread.sleep(500);
 driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Licious\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField").sendKeys("8884948076");;
 Thread.sleep(500);
 driver.findElementByAccessibilityId("Proceed").click();
 Thread.sleep(500);
 driver.findElementByAccessibilityId("Password Login").click();
 Thread.sleep(500);
 driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Licious\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField").sendKeys("nilam_63");
 Thread.sleep(500);
 driver.findElementByAccessibilityId("Login").click();
 
 
 //location.sendKeys(Keys.DOWN,Keys.ENTER);
//WebElement useLocation=driver.findElement(By.id("Use Loaction"));
//useLocation.click();
    }catch(Exception e)
    {
        
    }
}

@BeforeMethod
public void beforeMethod() throws MalformedURLException, InterruptedException {
        
    DesiredCapabilities capabilities = new DesiredCapabilities();
    
    capabilities.setCapability("deviceName", "iPhone SE");
    
   
    capabilities.setCapability("platformName", "iOS");
   
    capabilities.setCapability("platformVersion", "11.4");
   
    capabilities.setCapability("Identifier", "0EC8AD7E-5A5D-4D2A-B0C7-CB683C68FC33");
    
    capabilities.setCapability("automationName", "XCUITest");
   
    capabilities.setCapability("app", "//Users/deepa/Downloads/Licious.app");
    
   // capabilities.setCapability("noReset", "noReset");
   // capabilities.setCapability("autoAcceptAlerts",true);
    driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
