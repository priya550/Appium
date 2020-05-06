package appiumSimpleProject;

//import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
//import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.Setting;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args){
		
		try {
			OpenCalculator();
			
		} catch (Exception e) {
			
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}

}
	
	public static void OpenCalculator() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Moto E");
		cap.setCapability("udid", "TA0050BIZR");
		cap.setCapability("platformName", "android");
		cap.setCapability("platformVersion", "5.1");
		//cap.setCapability("browserName", "Chrome");
		cap.setCapability("noreset", "false");
		cap.setCapability("automationName", "UiAutomator2");

		cap.setCapability("newCommandTimeout", "30000");
	
		cap.setCapability("appLocation", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		
		//driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, Duration.ofSeconds(5));
		
		driver = new AppiumDriver<MobileElement>(url , cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Started Running....");
		
//		driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
//		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
//		driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
//		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
//		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
//		String res = result.getText();
//		System.out.println("Result" +res);
//		System.out.println("Completed....");

	}

}
