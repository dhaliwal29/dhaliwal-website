package Dhaliwal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
public class Dhaliwal1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//I am PritiXYX
driver.get("https://www.amazon.ca/gp/bestsellers/");
Actions act=new Actions(driver);
Thread.sleep(3000);
act.click(driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"))).perform();
Thread.sleep(4000);
act.click(driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]/following-sibling::a[2]"))).click().perform();
Thread.sleep(4000);
//System.out.println(driver.getPageSource());
/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");
Thread.sleep(3000);
driver.findElement(By.id("twotabsearchtextbox")).clear();
WebDriverWait wait= new WebDriverWait(driver,20);
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
Select sel=new Select(driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]")));
Thread.sleep(3000);
sel.selectByIndex(3);
List<WebElement> list=sel.getOptions();
for(WebElement w:list) {
	System.out.println(w.getText());
}
System.out.println(sel.isMultiple());
*/
/*System.out.println(driver.findElement(By.xpath("//span[normalize-space(text())=\"Warehouse Deals\"]")).getText());
System.out.println(driver.findElement(By.xpath("//span[normalize-space(text())=\"Warehouse Deals\"]")).getLocation().getX());
System.out.println(driver.findElement(By.xpath("//span[normalize-space(text())=\"Warehouse Deals\"]")).getTagName());
System.out.println(driver.findElement(By.xpath("//span[normalize-space(text())=\"Warehouse Deals\"]")).getCssValue("color"));
System.out.println(driver.findElement(By.xpath("//span[normalize-space(text())=\"Warehouse Deals\"]")).isDisplayed());
System.out.println(driver.findElement(By.xpath("//span[normalize-space(text())=\"Warehouse Deals\"]")).isEnabled());
driver.close();
driver.findElement(By.xpath("//a[text()='Home']")).click();
//driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Television");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
Thread.sleep(4000);
driver.close();
driver.navigate().back();
Thread.sleep(4000);
driver.navigate().forward();
Thread.sleep(4000);
driver.navigate().refresh();
Thread.sleep(4000);*/
	}
	

}
