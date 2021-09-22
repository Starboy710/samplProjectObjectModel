package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonFunctions {
	public static Properties properties = null;
	public static WebDriver driver = null;

	public Properties loadProperty() throws IOException {

		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);

		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadProperty();

		String url = properties.getProperty("url");
		String browser = properties.getProperty("browser");
		String browserLocation = properties.getProperty("browserLocation");

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", browserLocation);
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", browserLocation);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

		@AfterSuite
		public void closeBrowser() {
//			driver.quit();
		}
	}
