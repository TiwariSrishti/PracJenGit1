package Launchingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class launchbrowser {
	
	 WebDriver driver=null;
	
   @BeforeTest
	public void launchbrowser1()
   {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Downloads/chromedriver/chromedriver.exe");
	driver=new ChromeDriver();
    }

    @Test
    public void launchurl()
    {
   driver.get("https://softwaretestingmaterial.com");
  
    }
   @AfterTest
   public void closewindow()
    {
	   driver.close();
     }
}
  
//Program for integration of JENKINS with GIT
//Program name in JENKINS is PJenGIT1 and in GIT will be PJenIntGIT1