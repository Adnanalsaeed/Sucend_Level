import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriver Adnan = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/Test.Html");
//		Adnan.get("https://www.facebook.com");
//		driver.get("https://www.linkedin.com");
//		driver.navigate().back();
		driver.findElement(By.id("Email-input")).sendKeys("alsaeedadnan53@gmail.com");
		driver.findElement(By.id("Pasword-inpout")).sendKeys("Admin");
		driver.findElement(By.id("date-input")).sendKeys("19-9-1998");
		driver.findElement(By.id("Mobile-input")).sendKeys("962797204960");
		driver.findElement(By.tagName("button")).click();
		//		driver.findElement(By.tagName(null)))

	}

}
