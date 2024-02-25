package seleniumframework.ExtentReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentReports extents;
	
	
	protected static ExtentReports configuration(String filename) {
	
		ExtentSparkReporter html=new ExtentSparkReporter(filename);
        html.config().setTheme(Theme.DARK);
		html.config().setEncoding("utf-8");
		html.config().setDocumentTitle("Aman prepration selenium");
		html.config().setReportName("Automation");
		html.config().setReportName("Aman Mishra");
		
		extents =new ExtentReports();
		extents.attachReporter(html);
		extents.setSystemInfo("ModuleName", "Login");
		extents.setSystemInfo("Build version", "9.0.10");
		extents.setSystemInfo("PM", "Aman");
		
		return extents;
	}

}
