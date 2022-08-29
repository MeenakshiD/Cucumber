package MySteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class MyStepdefs {

    public static WebDriver driver;


    @Given("browser is open")
    public void browserIsOpen() {

        System.setProperty("webdriver.chrome.driver", "/Users/abhishekdixit/Documents/Cucumber/Cucumber/bbcnewsFeedcomments/drivers/chromedriver 6");
        driver = new ChromeDriver();
        String Url = "https://www.bbc.co.uk";
        driver.get(Url);


    }

    @And("user is on Home page")
    public void userIsOnHomePage() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ssrcss-684v2a-NavItemHoverState e1gviwgp18']")));
        driver.findElement(By.xpath("//span[@class='ssrcss-684v2a-NavItemHoverState e1gviwgp18']")).click();


        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='gs-o-list-ui__item--flush gel-long-primer gs-u-display-block gs-u-float-left nw-c-nav__wide-menuitem-container']//span[contains(text(),'Cost of Living')]")));
        driver.findElement(By.xpath("//li[@class='gs-o-list-ui__item--flush gel-long-primer gs-u-display-block gs-u-float-left nw-c-nav__wide-menuitem-container']//span[contains(text(),'Cost of Living')]")).click();

    }

    @When("user clicks on news feed")
    public void userClicksOnNewsFeed() {

        driver.findElement(By.xpath("//a[@class='ssrcss-de08c6-PromoLink e1f5wbog0']")).click();

    }

    @And("user clicks on comment button on top")
    public void userClicksOnCommentButtonOnTop() {


        driver.findElement(By.xpath("//span[contains(text(),'Comments')]")).click();

    }

    @And("user is navigated to the bottom of news")
    public void userIsNavigatedToTheBottomOfNews() {

        driver.findElement(By.xpath("//button[normalize-space()='View comments']")).click();

    }

    @And("user clicks on view Comments button")
    public void userClicksOnViewCommentsButton() {

        driver.findElement(By.xpath("//button[normalize-space()='View comments']")).click();

    }

    @Then("user is able to view comments")
    public void userIsAbleToViewComments() throws Exception {

        driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@title='Comments']")));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='farz']")));

        String comment = driver.findElement(By.xpath("//span[@title='farz']")).getText();
        Assert.assertEquals("farz", comment);

    }

    @Given("user is on comment section")
    public void userIsOnCommentSection() throws Exception {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String txt = driver.findElement(By.xpath("//span[text()='Join the conversation']")).getText();
        Assert.assertEquals("Join the conversation", txt);


    }

    @When("user can sort comments using show filter dropdown")
    public void userCanSortCommentsUsingShowFilterDropdown() throws Exception {

        Select show = new Select(driver.findElement(By.id("sort-select")));
        show.selectByVisibleText("Latest");


    }

    @Then("comments are fitered by selected option")
    public void commentsAreFiteredBySelectedOption() throws Exception {

        Date currentdate = new Date();

        System.out.println(currentdate);
        String ScreenshotDate = currentdate.toString().replace(" ", "-").replace(":", "-");
        Thread.sleep(3000);

        File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);


        FileUtils.copyFile(Screenshot, new File("/Users/abhishekdixit/Documents/Cucumber/Cucumber/bbcnewsFeedcomments/Screenshots/" + ScreenshotDate + ".png"));

        driver.quit();
    }
}