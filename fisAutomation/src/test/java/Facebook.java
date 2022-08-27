import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/drivers/chromedriver 4");
        WebDriver driver = new ChromeDriver();
        String Url = "https://www.facebook.com";driver.get(Url);


         driver.findElement(By.xpath("//button[@type='submit'][@class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" ");


driver.findElement(By.xpath("//button[@type='submit']")).click();

String str= driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
        System.out.println(str);

String ExpectedString="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";

       if(str.equalsIgnoreCase(ExpectedString)){
           System.out.println("This error displayed");
       }

       else{

           System.out.println("Error is not availble");
       }

    }
}