import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllExample {

    public static void main(String[] args) throws Exception{


        System.setProperty("webdriver.chrome.driver","/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/drivers/chromedriver 4");
        WebDriver driver = new ChromeDriver();
        String Url = "http://seleniumpractise.blogspot.com/2016/";driver.get(Url);



        //driver.findElement(By.xpath("//input[@type='radio'][@value='maths']")).click();

//input[@type='file'][@name='fileupload']


        //driver.findElement(By.xpath("//input[@type='file'][@name='fileupload']")).sendKeys("/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/src/Files/Imgur image meenakshi.jpg");


        //‎file:///Users/abhishekdixit/Documents/Imgur%20image%20meenakshi.jpg

       // driver.switchTo().frame("google");

       // driver.findElement(By.xpath("//button[@id='genesis-mobile-nav-primary']")).click();


        //driver.findElement(By.xpath("//a[@href='http://learn-automation.com/']")).click();

        //button[text()='Try it']

       // driver.findElement(By.xpath("//button[text()='Try it']")).click();

      // Alert alt= driver.switchTo().alert();
        //System.out.println(alt);

        //Thread.sleep(3000);

//alt.accept();




//div[@class='tooltip']

        //span[@class='tooltiptext']


        Actions mouse=new Actions(driver);
        mouse.click();

       // mouse.moveToElement(driver.findElement(By.xpath("//div[@class='tooltip']"))).perform();

       // Thread.sleep(3000);

      //  String str=driver.findElement(By.xpath("//span[@class='tooltiptext']")).getText();

      //  System.out.println(str);

       // driver.findElement(By.xpath("//button[@type='submit'][@class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy']")).click();
      //  driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();


        //driver.switchTo().alert();

//Thread.sleep(3000);
     //   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Meenakshi");

//driver.findElement(By.xpath("//select[@id='day']")).click();
//driver.findElement(By.xpath("//select[@id='day']//child::option[13]")).click();
        //driver.findElement(By.xpath("//select[@id='month']")).click();

      //  driver.findElement(By.xpath("//select[@id='month']//child::option[7]")).click();


        //driver.findElement(By.xpath("//select[@id='year']")).click();

       // driver.findElement(By.xpath("//select[@id='year']//child::option[@value='2020']")).click();
        //a[text()=19][@class='ui-state-default']

//select[@id='month']//child::option[7]


        //input[@type='checkbox']

        List<WebElement> che=driver.findElements(By.xpath("//input[@type='checkbox']"));


        for (int i=0;i>=che.size();i++){
            WebElement check=che.get(i);


            String value = check.getAttribute("id");


            if(value.equalsIgnoreCase("Coding")){


                check.click();

            }


        }


        Select sel=new Select(driver.findElement(By.xpath("//select[@id='country']")));


        List ActualList=new ArrayList();

        List<WebElement> list= sel.getOptions();

        for(WebElement ele:list){

            String data=ele.getText();
            ActualList.add(data);
            System.out.println(ActualList);


        }

       List temp=new ArrayList();

        temp.addAll(ActualList);
        Collections.sort(temp,Collections.reverseOrder());
        System.out.println(temp);



       List<WebElement> x= driver.findElements(By.xpath("//input[@id='male']"));

     //  int y=driver.findElement(By.xpath("//input[@id='male']")).getLocation().getY();
        System.out.println(x.size());

        for(int i =0;i<x.size();i++){


            System.out.println(i);

            if(i==3){

                x.get(i).click();

            }
        }


    }


}