package githubexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Giiteg {
	public static void main(String[] args)
	{		
	System.out.println("Hi...Web page is launching with chrome");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.in");
	System.out.println("facebook page launched");
		}

}
