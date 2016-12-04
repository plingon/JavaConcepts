package BasicTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by pling on 01/12/2016.
 */



public class Page {

    @Test
    public void Page()
    {
        WebDriver driver = null;
        //System.setProperty("Webdriver.chrome.driver","c:\\ChromeDriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\pling\\Downloads\\DevTools\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        //driver= new ChromeDriver();
        driver.get("http://www.google.co.uk");

    }}

     /*System.setProperty("Webdriver.chrome.driver","C:\\Users\\pling\\chromedriver.exe");
       // System.setProperty("webdriver.gecko.driver", "C:\\Users\\pling\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-firefox-driver\\3.0.1\\selenium-firefox-driver-3.0.1-sources.jar");
       // driver =
         driver = new ChromeDriver();


*/