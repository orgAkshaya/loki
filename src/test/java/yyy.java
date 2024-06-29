

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yyy {

	public static  void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.letskodeit.com/practice");
		List<WebElement> k=d.findElements(By.xpath("//table[@class='dataTable']/thead/tr"));
	
	
	
		
		
		

	}

}
