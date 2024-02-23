package mounisoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LOGIN {
WebDriver driver;
private Object does;

@Test(priority=2)
void Setup() {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/v4");
}
@Test(priority=3)
void Login() {
	driver.findElement(By.name("uid")).sendKeys("mngr550902");
	driver.findElement(By.name("password")).sendKeys("deqUsam");
	driver.findElement(By.name("btnLogin")).click();
	
	driver.switchTo().alert().accept();
	
	boolean manager=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).isSelected();
	Assert.assertTrue(manager);
    String Text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
    Assert.assertEquals(Text, "welcome To Manager's Page of Guru99 Bank","does not match");
}
    
	@Test(dependsOnMethods= {"Login"})
     void Search() {
    	 System.out.println("to become a team leader in a reputed company");
    	 
     }
    @Test(priority=4,dependsOnMethods= {"Setup"})
void TearDown() {
 driver.close();
}
}

	
	
	
	

