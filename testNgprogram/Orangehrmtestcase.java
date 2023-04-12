package testNgprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtilityold;

public class Orangehrmtestcase extends SeleniumUtilityold {
  @Test
  public void create() {
	  System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		driver.findElementByCssSelector("ul[class='oxd-main-menu']>*:nth-child(2)").click();//click on pim
		driver.findElementByCssSelector("div[class='orangehrm-paper-container']>div>*:first-child").click();//click on Add
		driver.findElement(By.name("firstName")).sendKeys("abc");//add first name
		driver.findElement(By.name("lastName")).sendKeys("xyz");//add last name
		driver.findElementByCssSelector("button[type='submit']").click();//click on save button
  }
  @Test(dependsOnMethods= {"create"})
  public void Edit() {
	  driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();//click on pim
		driver.findElement(By.cssSelector("div[class='oxd-table-cell-actions']>*:last-child")).click();//
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys("wwwww");
		driver.findElement(By.cssSelector(".oxd-form-row>div>:nth-child(2)>div>:last-child>input")).sendKeys("0267");
		driver.findElement(By.cssSelector("button[type='submit']")).click();//click on save
	  
  }
  @Test(dependsOnMethods= {"Edit"})
  public void Delete() {
	  driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();//click on pim
		driver.findElement(By.cssSelector("input[placeholder='Search']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("abc");
		
		driver.findElement(By.cssSelector("div[class='oxd-table-body']>div")).click();
		driver.findElement(By.cssSelector("ul[class='oxd-main-menu']>*:nth-child(2)")).click();//click on pim
		driver.findElement(By.cssSelector("button[class='oxd-icon-button oxd-table-cell-action-space']")).click();
		driver.findElement(By.cssSelector("i[class='oxd-icon bi-trash oxd-button-icon']")).click();//click on delete
	
		
  }
}
