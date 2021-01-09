package listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BasePage;


public class ExtentManager {

	private static ExtentReports extent;
	
	
	

	    public static ExtentReports createInstance(String fileName) {
	        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
	       
	        
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Automation Tester", "Sujan Manandhar");
	        extent.setSystemInfo("Organization", "Chase Bank");
	        extent.setSystemInfo("Build no", "Ch-1234");
	        
	        
	        return extent;
	    }
	    
	    public static String fileName;
		public static  void captureScreenshot() throws IOException {

			Date d = new Date();
			fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

			File screenshotFile = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("./reports/" + fileName));

		}
	 


	}
