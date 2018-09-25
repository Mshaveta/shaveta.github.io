import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptDemo {

	public static void main(String[] args) {
		String url = System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
		//System.out.println(url);
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String xlsSheetPath = System.getProperty("user.dir")+"\\src\\TestData\\testData.xlsx";
		Xls_Reader xlr = new Xls_Reader(xlsSheetPath);
		
		int rowCount = xlr.getRowCount("Login");
		System.out.println(rowCount);
		/*for(int i=1;i<=rowCount;i++) {
			String vRun = xlr.getCellData("Login", "RUN", i);
			System.out.println(vRun);
			
		}*/
		
	}

}
