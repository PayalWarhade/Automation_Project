
package practo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class BasicCode 
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium_files\\driver\\chromedriver_win32\\chromedriver.exe"); //path for the chromedriver
 		 WebDriver driver = new ChromeDriver();
		 driver.get("https://accounts.practo.com");                                           //launching a browser page 
			 
		 WebElement uname = driver.findElement(By.id ("username"));                           
		 uname.sendKeys("8788995861");                                    // get the username 
		 driver.findElement(By.id("password")).sendKeys("#Payal98");          //get the password 
		 driver.findElement(By.id("login")).click();                        //for the click on login

}
}
