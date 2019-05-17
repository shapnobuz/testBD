package artifactidddd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Logincheck {
	@Test
	public void logincheck(){
		WebDriver driver = new FirefoxDriver();
//sfdhy
		driver.get("http://118.67.220.50/unifiedeagro");
		driver.findElement(By.id("userName")).sendKeys("GISB_SQA@GRAMEEN-INTEL.COM");
		driver.findElement(By.id("password")).sendKeys("AusTin4#");
//		driver.findElement(By.id("frmUserLogin")).click();
		driver.findElement(By.cssSelector("div.form-row:nth-child(4) > button:nth-child(1)")).click();

//		div.form-row:nth-child(4) > button:nth-child(1)
//		*[@id="frmUserLogin"]/div/div[4]/button
//		driver.findElement(By.id("email_container")).sendKeys("mahfuzur");
//		driver.findElement(By.id("pass")).sendKeys("01911445116F");
//		driver.findElement(By.id("u_0_3")).click();
//		
//		driver.findElement(By.id("email")).sendKeys("shapnodotbuz");
//		driver.findElement(By.id("pass")).sendKeys("6398734");
//		driver.findElement(By.id("u_0_3")).click();
//		
//		driver.findElement(By.id("email")).sendKeys("shapnodotbuz");
//		driver.findElement(By.id("pass")).sendKeys("01911445116F");
//		driver.findElement(By.id("u_0_3")).click();
		
	}
}
