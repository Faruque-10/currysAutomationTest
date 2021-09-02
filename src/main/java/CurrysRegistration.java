
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CurrysRegistration {
    public static void main(String[] args) {
        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // don't touch the code above this line.
        // Locators
        By acceptCookies =  By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
        By Signin = By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/a[4]/span[2]");
        //By firstNameField =  By.xpath("//*[@id=\"js-cookie-modal-level-one\"]/div/main/div/button[2]");
        try {
            // launch chrome and go to url
            driver.get("https://www.currys.ie");
            driver.findElement(acceptCookies).click();
            driver.findElement(Signin).click();
            //driver.findElement(firstNameField).sendKeys("First name");
            // Don't touch the code below this line
            System.out.println("Your Test Passed");
            // sleeping the execution for 4000 milly sec
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            System.out.println("Your Test Failed");
        }
        //close chrome
        //driver.close();
    }
}
