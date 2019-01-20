package AutomationClass;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Logger;

public class Login extends Constants {

    public Login(WebDriver driver) {
        super(driver);
    }
    public void login() throws InterruptedException {

        Logger logger = Logger.getLogger("logfile");

        logger.info("Test başladı");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.n11.com/");
        driver.manage().window().maximize();

        driver.findElement(login).click();
        driver.findElement(emailId).sendKeys("mtatli09@hotmail.com");
        driver.findElement(passwordId).sendKeys("123456mt*");

        logger.info("Login başarılı");

        driver.findElement(signId).click();
        driver.findElement(searchId).sendKeys("Samsung");
        driver.findElement(searchId).sendKeys(Keys.ENTER);

        Assert.assertEquals("Samsung - n11.com", driver.getTitle());

        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 6200);");

        driver.findElement(By.linkText("2")).click();
        logger.info("2. sayfaya geçildi");

        Thread.sleep(1000);
        driver.findElement(favButton).click();

        Thread.sleep(1000);
        js.executeScript("scroll(0, 0);");
        //favorilerim listesine gir

        WebElement we = driver.findElement(myAccount);
        Hover(driver,we);
        WebElement clickElement= driver.findElement(myFavList);//xpath the child
        Hover(driver,clickElement);
        Thread.sleep(1000);
        clickElement.click();

        driver.findElement(favList).click();
        //ürünü sil
        driver.findElement(deleteProduct).click();

        Thread.sleep(2000);

        driver.findElement(deleteOk).click();
        //çıkış yap
        Thread.sleep(1200);
        WebElement wel = driver.findElement(myAccount);
        Hover(driver,wel);
        WebElement ele= driver.findElement(quitButton);//xpath the child
        Hover(driver,ele);
        Thread.sleep(4000);
        ele.click();
        Thread.sleep(4000);

        logger.info("Test tamamlandı.");
    }
}
