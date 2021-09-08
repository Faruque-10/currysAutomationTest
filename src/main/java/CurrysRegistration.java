
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
        By signin = By.xpath("//*[@id=\"header\"]/div/div/div/div[3]/a[4]/span[2]");
        By emailAddress = By.xpath("//*[@id=\"input-sEmail\"]");
        //By iDontHaveAnAccount = By.xpath("//*[@id=\"content\"]/div[2]/div/div/form/div[1]/div[1]/label/div");
        By iAlreadyHaveAnAccount = By.xpath("//*[@id=\"content\"]/div[2]/div/div/form/div[1]/div[2]/label/div");
        By password = By.xpath("//*[@id=\"input-sPassword\"]");
        By SignIn = By.xpath("//*[@id=\"content\"]/div[2]/div/div/form/div[3]/button");
        //By firstNameField =  By.xpath("//*[@id=\"js-cookie-modal-level-one\"]/div/main/div/button[2]");
        try {
            // launch chrome and go to url
            driver.get("https://www.currys.ie");
            driver.findElement(acceptCookies).click();
            driver.findElement(signin).click();
            driver.findElement(emailAddress).sendKeys("faruque_10@yahoo.com");
            driver.findElement(iAlreadyHaveAnAccount).click();
            driver.findElement(password).sendKeys("MD@_obaidur78");
            driver.findElement(SignIn).click();
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
