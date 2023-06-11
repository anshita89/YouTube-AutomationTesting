
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class YouTubeAppTest {

	public static void main(String[] args) {
		// launch_Browser
		WebDriver driver=new ChromeDriver();
						
		//maximize the window
		driver.manage().window().maximize();
						
		//navigate to myntar page
		driver.get("https://www.Youtube.com/");
						
		// page title
		String actual_title=driver.getTitle();
		String expected_title=("YouTube");
		Assert.assertEquals(expected_title, actual_title);
		
		// locate to serach bar
		WebElement search_bar=driver.findElement(By.cssSelector("input#search"));
		
		// create actions obj
		Actions act=new Actions(driver);
		
		// click ans sendkeys search bar
		act.click(search_bar).sendKeys("koi jane naa",Keys.ENTER).build().perform();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// locate and click
		driver.findElement(By.cssSelector("img[src=\"https://i.ytimg.com/vi/0pv3jn1P4Gc/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCbQh16Z7rYzM92ljIEYSZX58V6Dw\"]")).click();

	}

}

