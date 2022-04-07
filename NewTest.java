
package testNg;

import org.testng.annotations.Test;

//import automation.WebElement;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class  NewTest  {
	public static WebDriver driver;
	public static Properties prop;
	public static String sAppURL;
	public static String uname;
	public static String password;
	
	//This function is used to read data from specified cell of Excel sheet once you give Excelsheet name and path
	
	/*public static String HA_GF_readXL (int row, String column, String strFilePath) throws IOException 
	{
		
		File file =    new File("E:\Capita\Excelfile");
		FileInputStream inputStream = new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
		HSSFSheet sheet=wb.getSheet("location");
		HSSFRow row1=sheet.getRow(1);
				
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        System.out.println(rowCount);
        //iterate over all the row to print the data present in each cell.
        for(int i=0;i<=rowCount;i++){
            
            //get cell count in a row
            int cellcount=sheet.getRow(i).getLastCellNum();
            System.out.println(cellcount);
            //iterate over each cell to print its value
            System.out.println("Row"+ i+" data is :");
            
            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            }
            System.out.println();
        }
    
	//System.out.println("NO MATCH FOUND IN GIVEN FILE: PROBLEM IS COMING FROM DATA FILE");
	
	return null;
	}*/

	
	
  @Test
  public void f() throws InterruptedException {
	  System.out.println("Entered Test Method");
	  Thread.sleep(3000);
	  WebElement search = driver.findElement(By.xpath ("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input"));
	  System.out.println(search.toString());
		 search.clear();
		 search.sendKeys("Pune");
		 WebElement sea = driver.findElement(By.xpath ("//[@id=\'c-omni-container\']/div/div[2]/div[1]/input"));//[@id="c-omni-container"]/div/div[2]/div[1]/input
		 sea.sendKeys("Hospital");
		 sea.sendKeys(Keys.RETURN);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div/header/div[1]/div/div[2]/label/span/span")).click();
	
  }
  @BeforeTest
  public void beforeTest()throws FileNotFoundException, IOException {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium_files\\driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		 try {
				prop = new Properties();
			} catch (Exception e) {
				e.printStackTrace();
			}
			  
			  prop.load(new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\practo_Maven\\Configuration\\User_Details.properties"));
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
  public void afterTest()
  {
	  driver.close();  
  }
}

