package gittestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gittestproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stc first demo test by using main method");
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}

}
