package QA_Sucend_Level;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sucend_Level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");

		String MyTitle = driver.getTitle();
		System.out.println(MyTitle);

		List <WebElement> myOptionList = driver.findElements(By.tagName("option"));
		for (int i=0 ;i<myOptionList.size();i++) {
		System.out.println(myOptionList.get(i).getText());
		}
	}

}
