import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prctical {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Toshiba-com\\Desktop\\udemyfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://127.0.0.1:5500/index.html");
		System.out.println(driver.getTitle());
		
                List <WebElement> myListOfOPtions = driver.findElements(By.tagName("option"));

                for(int i=0; i< myListOfOPtions.size();i++) {
	
                	System.out.println(myListOfOPtions.get(i).getText());
}

	}

}
