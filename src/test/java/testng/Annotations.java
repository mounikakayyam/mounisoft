package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Annotations {
WebDriver driver;
	
	@Test
	void Setup() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/v4");
	}
	
	@Test(priority=2)
	void Login() {
		driver.findElement(By.name("uid")).sendKeys("mngr532503");
		driver.findElement(By.name("password")).sendKeys("EjAtAqU");
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Test(priority=3)
	void TearDown() {
		driver.close();
	}



	
	
	
}
