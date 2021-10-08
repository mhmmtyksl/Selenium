package z_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_0610_AmazonArama {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // amazon.com a gidip "JAVA" kelimesini aratin
        driver.get("https://amazon.com");

        WebElement such=driver.findElement(By.xpath("//input[@type='text']"));
        such.sendKeys("JAVA"+ Keys.ENTER);

        // kac sonuc geldigini ve gelen sonuclardan 4.ve 7.nin isimlerini yazdirin

        System.out.println("Yapilan arama sonucu : " + driver.findElement(By.xpath("(//span[@dir='auto'])[1]")).getText());

        System.out.println("Cikan sonuclardan 4. urunun adi : " + driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]")).getText());

        System.out.println("Cikan sonuclardan 7. urunun adi : "+ driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[7]")).getText());





    }

}
