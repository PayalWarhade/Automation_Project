
package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import test.ExcelData;

 public class PractoTest 
 {
	public static WebDriver driver;
	public static Properties prop;
	public static String sAppURL;
	public static String uname;
	public static String password;
	public static String readXL1;

	@Test(priority = 1)
	public void run() throws InterruptedException, IOException 
	{
		System.out.println("Enter the test Method name: ");
		int i;
		Thread.sleep(3000);
		String[] data = ExcelData.readXL1();

		for (i = 1; i <=3; i++) 
		{
			// For location
			System.out.println(data[i]);
			WebElement search = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));
			search.clear();
			search.sendKeys(data[i]);
			//Thread.sleep(3000);
			WebElement sea = driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input"));
			sea.sendKeys("Hospital");     

			//sea.clear();

			sea.sendKeys(Keys.ENTER);

			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// Thread.sleep(3000);

			// For Accredited Button
			driver.findElement(
					By.xpath("//*[@id=\"container\"]/div[3]/div/div[1]/div/div/header/div[1]/div/div[2]/label/div"))
					.click();
			// for 24*7 button
			// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//Thread.sleep(3000);
			if (i == 1) {
				// IMax Multispeciality Hospital
				String S1 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S1);
				// Umarji Mother & Child Care
				String S2 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S2);
				// Kedarnath General Hospital, Laparoscopy & Diabetic Foot Management
				String S3 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S3);
				//
				String S4 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[5]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S4);
				// Aditya Birla Memorial Hospital
				String S5 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[6]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S5);

			}

			else if (i == 2) {
				Thread.sleep(5000);
				// Motherhood Hospital
				String S1 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S1);
				// Manipal Hospital Varthur Road
				String S2 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S2);
				// Koshys Hospital
				String S3 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S3);
				// Smiles Institute of Gastroenterology
				String S4 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[5]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S4);
				//
				String S5 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[6]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S5);

			} else if (i == 3) {
				Thread.sleep(5000);

				// Gleneagles Global Health City
				String S = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S);

				// Bharathirajaa Hospital
				String S1 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S1);
				// Parvathy Ortho Hospital
				String S2 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S2);
				// Sakthi Hospital & Research Center
				String S3 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[5]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S3);
				// Right Hospitals
				String S4 = driver.findElement(By.xpath(
						"//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div/div[2]/div[6]/div/div[1]/div[1]/div/div[2]/div/a/h2"))
						.getText();
				System.out.println('\n' + S4);
				break;

			}

		}

	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium_files\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		try {
			prop = new Properties();
		} catch (Exception e) {
			e.printStackTrace();
		}
		prop.load(new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\practo_Maven\\Configuration\\login.properties"));
		sAppURL = prop.getProperty("sAppURL");
		uname = prop.getProperty("uname");
		password = prop.getProperty("password");
		System.out.println(sAppURL);
		System.out.println(uname);
		System.out.println(password);
		driver.get(sAppURL);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();

	}
}