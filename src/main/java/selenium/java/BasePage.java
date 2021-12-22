package selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public WebDriver driver;

    // init driver;
    public void setUp(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\geckodriver.exe");
        }
    }
}
