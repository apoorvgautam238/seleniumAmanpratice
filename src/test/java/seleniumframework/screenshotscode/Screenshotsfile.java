package seleniumframework.screenshotscode;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import seleniumframework.BasePackage.BaseClass;

public class Screenshotsfile extends BaseClass{//oops concept

	
	public static void Screenshot() throws Exception {//Static method Java
		Date date=new Date();
		String filename=date.toString().replace(" ", "_").replace(":", "_")+"ScreenShot.jpeg";
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\apoorv gautam\\eclipse-workspace\\seleniumframework\\Screenshotsfolder\\"+filename));
						
	}
	
}
