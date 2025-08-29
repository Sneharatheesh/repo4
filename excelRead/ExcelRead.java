package excelRead;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelRead {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDiver();
		
		
		FileInputStream file=new FileInputStream(new File("C:\\Users\\user\\Desktop\\datadrvn.xlsx"));
		WorkBook workbook=new XSSFWorkBook(file);
		Sheet sheet=workbook.getSheetAt(0);
	
		for(int i=0;i<=sheet.getLastRowNum();i++)
			
			Row row=sheet.getRow(i);

		{
			String username=row.getCell(0).getStringCellValue();
			String password=row.getCell(1).getStringCellValue();
			
			    driver.get("https://www.facebook.com/");
	            driver.manage().window().maximize();
			    driver.findElement(By.id("email")).sendKeys(username);
	            driver.findElement(By.id("pass")).sendKeys(password);
	            
	            
	           // driver.findElement(By.name("login")).click();
	            Thread.sleep(3000);

	            workbook.close();
	            file.close();

		}

	}

}
