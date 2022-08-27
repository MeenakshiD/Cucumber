
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FISLogin {



        public static void main (String[] args) throws Exception{


            System.setProperty("webdriver.chrome.driver","/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/drivers/chromedriver 4");
            WebDriver driver = new ChromeDriver();
            String Url = "https://www.salesforce.com/uk/form/signup/freetrial-sales-pe/";driver.get(Url);


             driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();

           WebElement firstname= driver.findElement(By.xpath("//input[starts-with(@id,'UserFirstName')]"));
firstname.sendKeys("Meenakshi");


WebElement jobTitle =driver.findElement(By.xpath("//input[contains(@id,'UserTitle')]"));

jobTitle.sendKeys("Software Engineer");

//driver.findElement(By.xpath("//select[@id='CompanyCountry-EdEj']")).click();
//WebElement emp= driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));

            WebElement emp= driver.findElement(By.xpath("//select[starts-with(@id,'CompanyEmployees')]"));

Select sel=new Select(emp);
Thread.sleep(2000);
sel.selectByVisibleText("11 - 20 employees");



WebElement drop = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));

            Select select = new Select(drop);

            select.selectByVisibleText("Argentina");
            Thread.sleep(3000);
            select.selectByValue("AG");

            Thread.sleep(2000);


select.selectByIndex(5);

//select[@id='CompanyEmployees-hlxD']//following-sibling::option[@value='15']

//input[@id='CompanyName-Dy4G']//ancestor-or-self::input

//div[@class='container-fluid content-container']//descendant-or-self::div[@class='visible-lg']
//WebElement link= driver.findElement(By.xpath("//a[(text()='Main Services Agreement')]"));
//link.click();

        }


    }


