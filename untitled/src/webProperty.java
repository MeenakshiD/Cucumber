
import



public class webProperty {
    public WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        driver = new ChromeDriver();


    }
}