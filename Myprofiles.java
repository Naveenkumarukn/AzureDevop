package Hire;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Myprofiles {
	
	
	//label[text()='Profile Image ']
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse\\java-2021-09\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ezhireme.com/home");
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-tophome-layout/div[1]/app-home/section[1]/div[2]/div/div/div/div[2]/form/div/div[1]/input")).sendKeys("Testing");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("/html/body/app-root/app-tophome-layout/div[1]/app-home/section[1]/div[2]/div/div/div/div[2]/form/div/div[3]/a/span")).click();		
		driver.get("https://ezhireme.com/auth/login");
		driver.findElement(By.name("username")).sendKeys("naveenkumarcaptcha@gmail.com");
		driver.findElement(By.id("password-field")).sendKeys("manVSwild@1357");
		driver.findElement(By.name("log-in")).submit();
		Thread.sleep(2000);
		
		driver.get("https://ezhireme.com/account/profile");
	    driver.findElement(By.xpath("//label[@class='uploadButton-button text-center is-invalid']")).click();
		Runtime.getRuntime().exec("F:\\Autoit1.exe");
		
		driver.findElement(By.id("firstName")).sendKeys("Naveen");
		driver.findElement(By.id("lastName")).sendKeys("Uthayakumar");
		driver.findElement(By.id("middleName")).sendKeys("Kumar");
		driver.findElement(By.name("jobTitle")).sendKeys(".Net Developer");
		driver.findElement(By.name("phone")).sendKeys("8056330079");
		driver.findElement(By.name("emailAddress")).sendKeys("naveenkumarukn@gmail.com");
		driver.findElement(By.name("website")).sendKeys("https://nktesting.com");
		driver.findElement(By.name("currentSalary")).sendKeys("35$");
		driver.findElement(By.name("expectedSalary")).sendKeys("50$");
		driver.findElement(By.xpath("/html/body/app-root/app-account-layout/div/app-profile/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[5]/select/option[2]")).click();
		driver.findElement(By.name("experience")).sendKeys("1");
		//WebElement drive=driver.findElement(By.xpath("//*[@placeholder='Enter Date of Birth']"));
		//List<WebElement> columns=drive.findElements(By.tagName("input"));
		
		driver.findElement(By.xpath("//div//*[@placeholder='Enter Date of Birth']")).sendKeys("06091998");
		driver.findElement(By.name("educationLevels")).sendKeys("Bachelor of Engineering");
		driver.findElement(By.name("languages")).sendKeys("English, Hindi");
		driver.findElement(By.name("description")).sendKeys("To become a very successful professional in the field of Mechanical Engineering and to work in a more dynamic environment, providing the most innovative and the best of my outcome for the company.  ");
		driver.findElement(By.xpath("/html/body/app-root/app-account-layout/div/app-profile/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[12]/button")).click();
		driver.findElement(By.name("facebook")).sendKeys("https://naveen/facebook.com/");
		driver.findElement(By.name("twitter")).sendKeys("https://naveen/twitter.com/");
		driver.findElement(By.name("linkedIn")).sendKeys("https://naveen/linkedIn.com/");
		driver.findElement(By.name("Instagaram")).sendKeys("https://naveen/instagram.com/");
		driver.findElement(By.name("zip")).sendKeys("77002");
		driver.findElement(By.name("completeAddress")).sendKeys("329, Block-A. Main St. Houston, TX 77002, USA");
		driver.findElement(By.xpath("/html/body/app-root/app-account-layout/div/app-profile/section/div/div[2]/div/div[3]/div/div[2]/form/div/div[6]/button")).submit();
		driver.findElement(By.xpath("/html/body/app-root/app-account-layout/div/app-profile/section/div/div[2]/div/div[3]/div/div[2]/form/div/div[6]/button")).submit();

	}
	
}
