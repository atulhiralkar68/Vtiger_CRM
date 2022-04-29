package tataPlay;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static void baseclass(WebDriver driver) throws IOException {

		TakesScreenshot ts=(TakesScreenshot)driver; 
		File tempScreenshot =ts.getScreenshotAs(OutputType.FILE); 
		File screenshot = new File("C:\\Screenshots\\.png "+System.currentTimeMillis()); 
		FileUtils.copyFile(tempScreenshot, screenshot);
		// TODO Auto-generated method stub

	}

}
