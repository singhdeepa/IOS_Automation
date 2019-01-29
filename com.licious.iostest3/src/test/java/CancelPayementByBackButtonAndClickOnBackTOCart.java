import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.offset.PointOption;

public class CancelPayementByBackButtonAndClickOnBackTOCart {
	private static  AndroidDriver<MobileElement> driver;
	WebDriver d;
	AndroidDriver<WebElement> driverW;
	static Dimension size;
	 List<MobileElement> slots;
	@Test
	public void cancelPayementByBackButtonAndClickOnBackTOCartTest() throws InterruptedException, ClassNotFoundException, SQLException
	{
		TouchAction action = new TouchAction(driver	);
		PointOption p1= new PointOption();
		 Dimension dimensions = driver.manage().window().getSize();
	     Double screenwidthtStart = dimensions.getWidth() * 0.5;
	     int h1 = screenwidthtStart.intValue();
	     Double screenWidthEnd = dimensions.getWidth() * 0.2;
	     int h2 = screenWidthEnd.intValue();
	     Thread.sleep(5000);
	     action.press(p1.point(659, 1102)).moveTo(p1.point(177,1102)).release().perform();
	     Thread.sleep(5000);
	     action.press(p1.point(659, 1102)).moveTo(p1.point(177,1102)).release().perform();
	     Thread.sleep(5000);
	     
	     action.press(p1.point(659, 1102)).moveTo(p1.point(177,1102)).release().perform(); 
	     Thread.sleep(5000);
	     action.press(p1.point(659, 1102)).moveTo(p1.point(177,1102)).release().perform(); 
	     Thread.sleep(5000);
	     driver.findElement(By.id("com.licious:id/tvGetStarted")).click(); 
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'Search for your Delivery location']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.id("com.licious:id/etAreaSearch")).sendKeys("Indiranagar");
	     Thread.sleep(5000);
	     scrollAndClick("Indiranagar, Bengaluru, Karnataka, India");
	     Thread.sleep(5000);
	   //*[@text = 'Search Google Play']
	     //Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@content-desc = 'Open navigation drawer']")).click();
//	     Thread.sleep(5000);
	    
		 driver.findElement(By.xpath("//*[@text = 'Licious Wallet']")).click();
		 Thread.sleep(5000);
		// driver.findElement(By.id("com.licious:id/etEmail")).sendKeys("7903067480");
//	     Thread.sleep(5000);
//	     driver.findElement(By.id("com.licious:id/tvLoginProceed")).click();
//	     Thread.sleep(5000);
	     //driver.sendKeyEvent(AndroidKeyCode.ENTER);
//	     try
//	     {
//	     driver.findElement(By.id("com.licious:id/tvLoginProceed")).click();
//	     Thread.sleep(5000);
//	     }
//	     catch(Exception e) {
//	     driver.findElement(By.xpath("//*[@text = 'Password Login']")).click();
//	     Thread.sleep(5000);
//	     driver.findElement(By.id("com.licious:id/etPassword")).sendKeys("nilam_63");
//	     Thread.sleep(5000);
//	     driver.findElement(By.xpath("//*[@text = 'Login']")).click();
//	     Thread.sleep(5000);
	     
	    //}
	     Thread.sleep(5000);
         driver.findElement(By.id("com.licious:id/etEmail")).sendKeys("7903067480");
         Thread.sleep(5000);
         //driver.sendKeyEvent(AndroidKeyCode.ENTER);
         
         driver.findElement(By.id("com.licious:id/tvLoginProceed")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@text = 'Password Login']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.id("com.licious:id/etPassword")).sendKeys("Password@1");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'Login']")).click();
	     Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@text = 'Upload Money']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@text = 'Enter the Amount']")).sendKeys("10");
		 Thread.sleep(5000);
		 driver.findElement(By.id("com.licious:id/rdbNetBanking")).click();
		 Thread.sleep(5000);
		// scrollAndClick("Airtel Payments Bank");
		 driver.findElement(By.id("com.licious:id/tvSubmit")).click();
		 Thread.sleep(5000);
		 try {
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc = 'Success']")).click();
		 }catch(Exception e){
			 driver.findElement(By.xpath("//*[@text = 'Success']")).click(); 
		 }
	     //driver.findElement(By.xpath("//*[@text = 'Success']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.id("com.licious:id/tvOK")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc = 'Navigate up']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'Chicken']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'ADD TO CART']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.id("com.licious:id/rlGoToCart")).click();
	     Thread.sleep(5000);
	   //  driver.findElement(By.xpath("//*[@text = 'Checkout']")).click();
//	     try
//	     {
//	     driver.findElement(By.xpath("//*[@text = 'Allow']")).click();
//	     }catch(Exception e)
//	     {
//	   	  System.out.println(e);
//	     }
	     //Thread.sleep(5000);
//	     driver.findElement(By.id("com.licious:id/etEmail")).sendKeys("7903067480");
//	     Thread.sleep(5000);
//	     //driver.sendKeyEvent(AndroidKeyCode.ENTER);
//	     
//	     driver.findElement(By.id("com.licious:id/tvLoginProceed")).click();
//	     Thread.sleep(5000);
//	     driver.findElement(By.xpath("//*[@text = 'Password Login']")).click();
//	     Thread.sleep(5000);
//	     driver.findElement(By.id("com.licious:id/etPassword")).sendKeys("nilam_63");
//	     Thread.sleep(5000);
//	     driver.findElement(By.xpath("//*[@text = 'Login']")).click();
//	     Thread.sleep(5000);
//	     List<MobileElement> elements = driver.findElementByClassName("android.widget.TextView").findElements(By.id("com.licious:id/tvArea"));
//	     for(WebElement element : elements) {
//	         System.out.println(element.getText());
//	     }
	    // driver.findElement(By.xpath("//*[contains(@text,'Bangalore')]")).click();
	    // driver.findElement(By.id("com.licious:id/tvArea")).sendKeys("Indira");
	    // driver.findElement(By.xpath("//*[@text = 'Chicken']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'Proceed']")).click();
	     Thread.sleep(5000);
	     try {
	     driver.findElement(By.xpath("//*[@text = 'Select delivery slot']")).click();
	     Thread.sleep(5000);
	      slots=driver.findElements(By.id("com.licious:id/tvSlot"));
	     slots.get(1).click();
	     }catch(Exception e)
	     {
	    	 
	    
	     driver.findElement(By.xpath("//*[@text = 'Place Order']")).click();
	     Thread.sleep(5000);
	     //driver.findElement(By.id("com.licious:id/ckCard")).click();
	    // Thread.sleep(5000);
	     scrollAndClick("Netbanking");
	   //  driver.findElement(By.id("com.licious:id/rlNetBankingState")).click();
	     Thread.sleep(5000);
	     List<MobileElement> banks=driver.findElements(By.id("com.licious:id/ckPopularBank"));
	     banks.get(1).click();
//	     for(WebElement element : elements) {
//	    	 element.click();
////	       System.out.println(element.getText());
//	    	 
	//  }
//	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'Place Order']")).click();
	     Thread.sleep(5000);
	     driver.pressKeyCode(AndroidKeyCode.BACK);
	     Thread.sleep(5000);
	     driver.findElement(By.id("com.licious:id/tvYes")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'Back to Cart']")).click();
	     Thread.sleep(5000);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'Proceed']")).click();
	     Thread.sleep(5000);
	     try {
	     driver.findElement(By.xpath("//*[@text = 'Select delivery slot']")).click();
	     Thread.sleep(5000);
	  //   List<MobileElement> slots=driver.findElements(By.id("com.licious:id/tvSlot"));
	     slots.get(1).click();
	     }catch(Exception e1)
	     {
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@text = 'Place Order']")).click();
	     Thread.sleep(5000);
         driver.findElement(By.id("com.licious:id/ckCard")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@text = 'Enter CVV']")).sendKeys("123");
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@text = 'Place Order']")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@text = 'Success']")).click();
         
         driver.findElement(By.className("android.widget.ImageButton")).click();
	     }
	     }
	}  
	     public void scrollAndClick(String visibleText) {
	 	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
	 	       
	 	   }
	 	@BeforeMethod
	 	public void beforeMethod() throws MalformedURLException, InterruptedException {
	 	    //File classpathRoot = new File(System.getProperty("user.dir"));
	 	    //File appDir = new File(classpathRoot, "/Apps/Amazon/");
	 	    //File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");    
	 	    DesiredCapabilities capabilities = new DesiredCapabilities();
	 	    //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	 	    //DesiredCapabilities caps = DesiredCapabilities.android();
	 	 //   caps.setCapability("appiumVersion", "1.5.3");
	 	    capabilities.setCapability("platformName","android");
	 	    capabilities.setCapability("platformVersion","6.0.1");
	 	    capabilities.setCapability("deviceName","Galaxy On5");
	 	    capabilities.setCapability("device","4200e5454fbc441d");
	 	    capabilities.setCapability("autoGrantPermissions", true);
	 	    capabilities.setCapability("noReset","true");
	 	    capabilities.setCapability("automationName","uiautomater2");
	 	    
	 	    capabilities.setCapability("app","/Users/deepa/Downloads/342-104-dev-build.apk");
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
	 	   // WebDriverWait wait = new WebDriverWait(driver, 20);
//	 	    try {
//	 	        wait.until(ExpectedConditions.alertIsPresent());
//	 	        Thread.sleep(500);
//	 	        driver.switchTo().alert().accept();
//	 	        Thread.sleep(1000);
//	 	    } catch (Exception e) {
//	 	        System.err.println("   no alert visible after "+20+" sec.");
//	 	       
//	 	    }
//	 	    try {
//	 	        wait.until(ExpectedConditions.alertIsPresent());
//	 	        Thread.sleep(500);
//	 	        driver.switchTo().alert().dismiss();
//	 	        
//	 	    } catch (Exception e) {
//	 	        System.err.println("   no alert visible after "+20+" sec.");
//	 	       
//	 	    }
	 	    
	 	}
	 	@AfterMethod
	 	public void afterMethod() {
	 		driver.removeApp("com.licious");
	 	}
}
