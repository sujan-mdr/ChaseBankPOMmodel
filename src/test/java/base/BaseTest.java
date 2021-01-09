package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelReader;
import utilities.MonitoringMail;

public class BaseTest {
	
	public  WebDriver driver;
	public Properties Config = new Properties();
	public FileInputStream fis;
	public ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
	public Logger log = Logger.getLogger(BaseTest.class);
	public MonitoringMail mail = new MonitoringMail();
	public WebDriverWait wait;
	
	public void setUp(String browserName) {
		
		PropertyConfigurator.configure(".\\src\\test\\resources\\properties\\log4j.properties");
		log.info("Test Execution has been started!!");		
		
		try {
			fis = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Config.load(fis);
			log.info("Config files has been loaded!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Chrome has launched!!");

		} else if (browserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("Firefox has launched");

		}
		
		
		
		driver.get(Config.getProperty("testsiteurl"));
		log.info("Navigated to Chase Bank!!!");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver, Integer.parseInt(Config.getProperty("explicit.wait")));
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		log.info("Test Execution Completed!!");
	}
	
	

}
