package Excerises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locate_with_tagname {
	public static void main(String[] args) {
		
		//open a browser
		WebDriver driver =  new FirefoxDriver();
		
		//type url www.google.com
		driver.get("http://google");
		//find all the text which has a link using Tagname
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int size = elements.size();
		for (int i=0; i <size;i++)
		{
		//System.out.println(elements.get(i).getText());
		
		String text = elements.get(i).getText();		
		if (text.equals("About"))
		{
			System.out.println("TC Pass");
			break;
		}
		}
			
			
		// to match your result with the expected text= 'About'
		
		
	}

}
