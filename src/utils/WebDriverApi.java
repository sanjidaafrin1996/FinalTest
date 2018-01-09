package utils;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

	public class WebDriverApi  {
		public WebDriver driver;
		public static Logger APPLICATION_LOGS = Logger.getLogger("myLogs");
		
		
		public void typeByXpath(String Locator,String Value){
			//driver.findElement(By.xpath(Locator)).clear();
			
			driver.findElement(By.xpath(Locator)).clear();
			driver.findElement(By.xpath(Locator)).sendKeys(Value);
			
		}
		public void typeById(String Locator,String Value){
			driver.findElement(By.id(Locator)).sendKeys(Value);
		}
		public void clickByCss(String Locator,String value){
			driver.findElement(By.cssSelector(Locator)).sendKeys(value);
			
		}
		public void DropdownByXpath(String Locator,String Test){
			WebElement dropdownListBox=driver.findElement(By.xpath(Locator));
			Select ClickThis=new Select(dropdownListBox);
			ClickThis.selectByIndex(0);
		}
		//to deal with click
		public void clickbyxpath(String locator){
			driver.findElement(By.xpath(locator)).click();
		}
		public void clickbycss(String locator){
			driver.findElement(By.cssSelector(locator)).click();
		}
		public void clickbyId(String locator){
			driver.findElement(By.id(locator)).click();
		}
		//dropdown
		public void dropdownxpath(String locator,String value){
			List<WebElement> dropdownList=driver.findElements(By.xpath(locator));
		}
		
			
		}



		
		

		


