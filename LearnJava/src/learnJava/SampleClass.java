package learnJava;

import java.util.List;
//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {
	public static void main(String args[]) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[contains(@id,'depart')]")).click();
		//List <WebElement> dates2 = driver.findElements(By.xpath("//div[contains(@class,'group-last')]/table/tbody/tr/td/a"));
		//List <WebElement> dates = driver.findElements(By.xpath("//div[contains(@class,'group-first')]/table/tbody/tr/td/a"));
		
		//List <WebElement> month = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-title')]/span[1]"));
		List <WebElement> month = driver.findElements(By.xpath("//div[contains(@id,'dp1543660032282')]/div/div"));
		
		System.out.println(month.size());
		/*for (int i = 0; i < 7; i++) {
			WebElement next = driver.findElement(
					By.xpath("//div[contains(@class,'group-last')]/div/a//span"));
			next.click();				
		}*/
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement frame = driver.findElement(By.id("_we_wk_data_store"));
		driver.switchTo().frame(frame);
		
		boolean status = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@id,'content-expand-collapse')]/div"))) != null;		
		
		if(status) {
			driver.switchTo().defaultContent();
		}*/
		
		/*int count = dates.size();
		for(int i = 0; i<count; i++) {
			WebElement element = dates.get(i);
			String text = element.getText();
			if(text.equalsIgnoreCase("29")) {
				element.click();
				System.out.println("Date clicked: "+text);
				break;
			}
		}*/
		
		/*for(WebElement date:dates2) {
			String text = date.getText();
			if(text.equalsIgnoreCase("29")) {
				date.click();
				System.out.println("Date clicked: "+text);
				break;
			}
		}*/
		
		Thread.sleep(5000);
		driver.close();
	}
}
