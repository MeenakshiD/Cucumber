import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {


    //div[contains(@class ,'swiper-button-next custom-navigation swiper-nav')]

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/drivers/chromedriver 4");
        WebDriver driver = new ChromeDriver();
        String Url = "https://www.noon.com/uae-en/";driver.get(Url);


     WebElement str= driver.findElement(By.xpath("//div[contains(@class ,'swiper-button-next custom-navigation swiper-nav')]"));



    }


}