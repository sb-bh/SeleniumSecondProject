package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class FirstPrg {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strExpected = "Selenium WebDriver";
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.co.in");
		//driver.get("https://www.facebook.com");
		driver.get("https://www.gmail.com");
		
		
		
		driver.findElement(By.name("identifier")).click();
		//driver.findElement(By.className("YZrg6 HnRr5d iiFyne cd29Sd")).click();
		
		driver.findElement(By.className("YZrg6 HnRr5d iiFyne cd29Sd")).sendKeys("bshweta36@gmail.com",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement a =  driver.findElement(By.name("login"));
		//String abc = a.getText();
		//System.out.println(abc);
		
		/*String strExpectedValue = "Facebook - Log In or Sign Upr";
		 String strActualValue = driver.getTitle();
		 	System.out.println( strActualValue);
		if (strExpectedValue.equals( strActualValue)) 
		{
			System.out.println("Strings are equal");
		} else
		{
			System.out.println("Strings are not equal");
		}
		*/
		
		/*
		 * driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		 * //driver.findElement(By.className("gLFyf")).click();
		 * 
		 * List <WebElement> list = driver.findElements(By.tagName("a"));
		 * 
		 * System.out.println("Number of links : "+list.size()); for(int i = 0; i <
		 * list.size(); i++) { String a = list.get(i).getText();
		 * if(a.contains(strExpected)) { list.get(i).click(); }
		 * 
		 * // System.out.println(list.get(i).getText());
		 * 
		 * }
		 */
			/*
			 * WebElement strValue = driver.findElement(By.id("search")); String strExpected
			 * = "Selenium WebDriver"; String strActual = strValue.getText();
			 	System.out.println(strActual);
			if (strExpected.equals(strActual)) 
			{
				System.out.println("Strings are equal");
			} else
			{
				System.out.println("Strings are not equal");
			}
		 */
		
		
		
		
		
		 
		
		
		
	}

}

