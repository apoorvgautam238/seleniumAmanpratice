package seleniumframework.ExtentReporter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import seleniumframework.screenshotscode.Screenshotsfile;

public class GenrateExtentreports implements ITestListener {
	
	
	 public void onTestStart(ITestResult result) {
	 
	 }
	
	  public  void onTestSuccess(ITestResult result) {
	    
	  }

	  public  void onTestFailure(ITestResult result) {
  try {
		 Screenshotsfile.Screenshot();
		 }catch (Exception e) {
			System.out.println(e);
		}
	  }

	  public  void onTestSkipped(ITestResult result) {
	   
	  }

	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
	  }

	  
	  public  void onTestFailedWithTimeout(ITestResult result) {
	    
	  }
     
	  public  void onStart(ITestContext context) {
	  
	  }

	  public  void onFinish(ITestContext context) {

	  }
	
	

}
