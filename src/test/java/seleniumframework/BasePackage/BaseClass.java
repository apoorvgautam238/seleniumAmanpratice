package seleniumframework.BasePackage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties config =new Properties();
	public static Properties webelement=new Properties();
	public static WebDriverWait wait;
	public static Logger log=Logger.getLogger(BaseClass.class);//first Step:-create a logger object.
	
	@BeforeSuite(groups ={"P0","P1"})
	public void setup() throws Exception {

		
		PropertyConfigurator.configure("C:\\Users\\apoorv gautam\\eclipse-workspace\\seleniumframework\\reports\\log4j");//Configure appender 
		FileInputStream conf=new FileInputStream("C:\\Users\\apoorv gautam\\eclipse-workspace\\seleniumframework\\src\\test\\resources\\properties\\configurationfile");
		FileInputStream webele=new FileInputStream("C:\\Users\\apoorv gautam\\eclipse-workspace\\seleniumframework\\src\\test\\resources\\properties\\webelementsfile");
		config.load(conf);
		webelement.load(webele);
		
	    log.info("Configuration Done");		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("imp_wait")),TimeUnit.SECONDS);
		driver.get(config.getProperty("url"));
		log.info("url:--"+config.getProperty("url"));
		wait=new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(config.getProperty("exp_wait"))));
	}

}
