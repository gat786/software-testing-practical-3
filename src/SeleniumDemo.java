import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.*;

public class SeleniumDemo 
{
	static String driverPath="E:\\projects\\practicals\\Stqa\\gecko\\geckodriver.exe";
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) 
	{	
		int a=10;
		int b=20;
		
		System.out.println("Hii..");
		System.out.println(a+b);
		
		System.out.println("Selenium Demo");
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		driver=new FirefoxDriver(capabilities);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.quit();
	}

}
