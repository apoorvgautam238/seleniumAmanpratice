package seleniumframework.testcases;



import static org.testng.Assert.assertThrows;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import seleniumframework.BasePackage.BaseClass;
import seleniumframework.screenshotscode.Screenshotsfile;

public class Logintestcases extends BaseClass {

	
	@Test(groups= "P0",priority = 0)
	public void validcredentialTestcaseOne(Method m) {
		
		
		
       driver.findElement(By.xpath(webelement.getProperty("usertype_x`"))).click();
       log.info("usertype click");
		driver.findElement(By.xpath(webelement.getProperty("username_x"))).sendKeys("Apoorv");
		driver.findElement(By.xpath("//*[@id=\"ubimobile1\"]")).sendKeys("6264321345");
		driver.findElement(By.xpath("//*[@id=\"signUp\"]/div/div[11]/button")).click();
		String ele=driver.findElement(By.xpath("//*[@id=\"signUp\"]/div/div[11]/button")).getText();
		Assert.assertEquals(ele, "fcvbjkufagaghaug");
	}

//	@Parameters({"name","mobile"}) 
    @Test(groups="P1",priority = 1)
    
//	public void validcredentialTestcasetwo(String name,String mobile)---using fir parameter
	public void validcredentialTestcasetwo() throws Exception{
		
		driver.findElement(By.xpath(webelement.getProperty("usertype_x"))).click();
		driver.findElement(By.xpath(webelement.getProperty("username_x"))).sendKeys("Apoorv");
		driver.findElement(By.xpath("//*[@id=\"ubimobile1\"]")).sendKeys("6264321345");
		driver.findElement(By.xpath("//*[@id=\"signUp\"]/div/div[11]/button")).click();		
		
	}

    @Test(groups="P0",priority = 0)
     public void validcredentialTestcasethree() {
		
		driver.findElement(By.xpath(webelement.getProperty("usertype_x"))).click();
		driver.findElement(By.xpath(webelement.getProperty("username_x"))).sendKeys("Ankit");
		driver.findElement(By.xpath("//*[@id=\"ubimobile1\"]")).sendKeys("6261345");
		driver.findElement(By.xpath("//*[@id=\"signUp\"]/div/div[11]/button")).click();		
	}

}
