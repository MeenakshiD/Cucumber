import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    public WebDriver driver;


    @Given("user launch Chrome Browser")
    public void userLaunchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver","/Users/abhishekdixit/Documents/Cucumber/Cucumber/fisAutomation/drivers/chromedriver 4");
        WebDriver driver = new ChromeDriver();

    }

    @When("user opens URL {string}")
    public void userOpensURL(String url) {
        driver.get(url);
    }

    @And("user clicks Sign in button")
    public void userClicksSignInButton() {
        
    }

    @And("User enters email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String arg0, String arg1) {
        
    }

    @And("click on Sign in")
    public void clickOnSignIn() {
        
    }

    @Then("page title should be {string}")
    public void pageTitleShouldBe(String arg0) {
        
    }

    @Given("User on Home page")
    public void userOnHomePage() {
        
    }

    @And("user is able to view news headlines")
    public void userIsAbleToViewNewsHeadlines() {
        
    }

    @When("user open a news feed")
    public void userOpenANewsFeed() {
        
    }

    @Then("verify Comment box is disabled")
    public void verifyCommentBoxIsDisabled() {
        
    }

    @Then("verify Comment box is enabled")
    public void verifyCommentBoxIsEnabled() {
    }
}