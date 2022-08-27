import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestCucumber {

    public static void main(String[] args) throws Exception {



        Date currentdate=new Date();

        System.out.println(currentdate);
        String ScreenshotDate=currentdate.toString().replace(" ","-").replace(":","-");
        System.out.println(ScreenshotDate);

        System.setProperty("webdriver.chrome.driver","/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/drivers/chromedriver 4");
        WebDriver driver = new ChromeDriver();
        String Url = "https://www.shino.de/parkcalc/index.php?ParkingLot=Valet&StartingDate=7%2F19%2F2022&StartingTime=12%3A00&StartingTimeAMPM=AM&LeavingDate=7%2F19%2F2022&LeavingTime=04%3A00&LeavingTimeAMPM=AM&action=calculate&Submit=Calculate";driver.get(Url);


        driver.findElement(By.xpath("//input[@id='StartingDate']")).clear();
        driver.findElement(By.xpath("//input[@id='StartingDate']")).sendKeys("7/19/2022");


        driver.findElement(By.xpath("//input[@id='LeavingDate']")).clear();

        driver.findElement(By.xpath("//input[@id='LeavingDate']")).sendKeys("7/19/2022");


        driver.findElement(By.xpath("//input[@id='StartingTime']")).sendKeys("12:00");

        driver.findElement(By.xpath("//input[@id='LeavingTime']")).sendKeys("04:00");


        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        String str= driver.findElement(By.xpath("//b[text()='$ 12.00']")).getText();

        File Screenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);


        FileUtils.copyFile(Screenshot,new File("/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/drivers/"+ScreenshotDate+".png"));

       Assert.assertEquals("$ 12.00",str);

        System.out.println(str);
//driver.close();

driver.getTitle();





        //input[@id='StartingDate']

        //input[@id='LeavingDate']

        //input[@id='StartingTime']

        //input[@id='LeavingTime']


        //input[@name='Submit']



    }


}