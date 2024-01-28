package seleniumframework.testcases;



import static org.testng.Assert.assertThrows;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import seleniumframework.BasePackage.BaseClass;

public class Logintestcases extends BaseClass {

	
	@Test(groups= "P0",priority = 0)
	public void validcredentialTestcaseOne(Method m) {
		
		
		try {
       driver.findElement(By.xpath(webelement.getProperty("usertype_x`"))).click();
       log.info("usertype click");
		driver.findElement(By.xpath(webelement.getProperty("username_x"))).sendKeys("Apoorv");
		driver.findElement(By.xpath("//*[@id=\"ubimobile1\"]")).sendKeys("6264321345");
		driver.findElement(By.xpath("//*[@id=\"signUp\"]/div/div[11]/button")).click();
		throw new FileNotFoundException();
		}catch (Exception e) {
          log.error(e);
          log.info(m.getName());
          
		}
	}

//	@Parameters({"name","mobile"}) 
    @Test(groups="P1",priority = 1)
    
//	public void validcredentialTestcasetwo(String name,String mobile)---using fir parameter
	public void validcredentialTestcasetwo(){
		
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
