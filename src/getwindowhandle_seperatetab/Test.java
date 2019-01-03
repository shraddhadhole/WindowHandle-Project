package getwindowhandle_seperatetab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//keys.chord is applicalble for different situation
//it will return the key
		

public class Test {

	public static void main(String[] args) {
		System.out.println("in local repository");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium data\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String opentab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		WebElement youramzonin=driver.findElement(By.id("nav-your-amazon"));
		youramzonin.sendKeys(opentab);
		
		System.out.println("changes in eclipse code");
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String>itr=abc.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			
			String Title=driver.getTitle();
			System.out.println(Title);
		
			System.out.println("changes in eclipse code");
		if(Title.equalsIgnoreCase("Your Amazon.in"))
		{
			boolean flag=driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
			System.out.println(flag);
		
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sdhole1994@gmail.com");
			//driver.findElement(By.xpath("//input[@id='continue']")).click();
			
		}
		}

	}

}
