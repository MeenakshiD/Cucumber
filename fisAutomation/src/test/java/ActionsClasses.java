import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClasses {

    public static void main(String[] args) {


        //a[@href='http://www.facebook.com']



        System.setProperty("webdriver.chrome.driver","/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/drivers/chromedriver 4");
        WebDriver driver = new ChromeDriver();
        String Url = "https://login.yahoo.com/?.lang=en-GB&src=homepage&.done=https%3A%2F%2Fuk.yahoo.com%2F%3Fp%3Dus%26guccounter%3D1&pspid=2023392312&activity=ybar-signin";driver.get(Url);

        driver.findElement(By.xpath("//label[text()='Stay signed in']")).click();
        //Actions act=new Actions(driver);

        //act.moveToElement(driver.findElement(By.xpath("//label[text()='Stay signed in']"))).click()

        //act.contextClick(driver.findElement(By.xpath("//a[@href='http://www.facebook.com']"))).perform();





       // JavascriptExecutor js= (JavascriptExecutor)driver;

        //js.executeScript("alert('Hello Meenakshi')");


       // WebElement ele= driver.findElement(By.xpath("//*[@id=\"mCSB_11_container\"]/p[3]"));

       //js.executeScript("arguments[0].scrollIntoView(true);",ele);


       // System.out.println(ele.getText());

       // driver.findElement(By.xpath("//a[@href='http://www.facebook.com']"));



    }
}