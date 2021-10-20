package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_FirstTestChrome {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

        // 1) Url nin "https://www.trendyol.com/" oldugunu kontrol et.
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.trendyol.com/";

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test PASS");
        } else {
            System.out.println("Test FAILED");
        }

        // 2) title da "Trendyol" gectigini kontrol et
        String actualTitle=driver.getTitle();
        String expectedTitle="Trendyol";

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASS");
        } else {
            System.out.println("Test FAILED");
        }

    driver.close();
    }
}
