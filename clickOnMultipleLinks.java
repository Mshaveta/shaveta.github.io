import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOnMultipleLinks 
{
	public static void main(String[] args) 
	{
		String url = System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
		//System.out.println(url);
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		int size = driver.findElements
				(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li/a"))
				.size();
			 
		for(int i=1;i<=size;i++) 
		{
			String linkUrl =  driver.findElements
							  (By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li/a"))
							  .get(i).getAttribute("href");
			driver.get(linkUrl);
			driver.navigate().back();
		}
	
	}

}
