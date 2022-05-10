package DemoDataDriven;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginToExcel {
	String[][] data=null;
	
	
	@DataProvider(name="Logindata")
	public String[][] loginProvider()throws Exception{
		data= ExcelData();
		return data;
		}
	
	
	public String[][] ExcelData() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("E:\\Facebook2.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		
		Sheet Sheet1 = wb.getSheet(0);
		int rowcount = Sheet1.getRows();
		int columncount = Sheet1.getColumns();
		
		String TestData[][] = new String[rowcount-1][columncount];
		
		for(int i=1; i<rowcount; i++) {
			for(int j=0; j<columncount; j++) {
				TestData[i-1][j]=Sheet1.getCell(j, i).getContents();
				
			}
		}
		return TestData;
	}
	
	
		@BeforeTest	    
		public void BeforeTest() {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\eclipse\\\\java-2021-09\\\\eclipse\\\\chromedriver_win32\\\\chromeDriver.exe");
			WebDriver driver=new ChromeDriver();
		}
				
		@AfterTest
		public void afterTest() {
		}
	
	
	@Test(dataProvider="Logindata")
	public void login(String Uname, String Pwrd) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse\\java-2021-09\\eclipse\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com/");
	WebElement UserName=driver.findElement(By.id("email"));
	UserName.sendKeys(Uname);
	WebElement Password=driver.findElement(By.id("pass"));
	Password.sendKeys(Pwrd);
	Thread.sleep(1000);
	WebElement LoginButton=driver.findElement(By.name("login"));
	LoginButton.click();
	//driver.quit();
	}

}
