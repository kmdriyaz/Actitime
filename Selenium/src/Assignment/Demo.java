package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
static {
	System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new EdgeDriver();
	driver.get("https://google.com/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
