package AutomationClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Constants {

    By emailId = By.id("email");
    By passwordId = By.id("password");
    By login = By.linkText("Giriş Yap");
    By signId = By.id("loginButton");
    By searchId = By.id("searchData");
    By favButton = By.xpath("//div[2]/ul/li[3]/div/div[2]/span");
    By favList = By.xpath("//div[@id='myAccount']/div[3]/ul/li/div/a/h4");
    By myAccount = By.linkText("Hesabım");
    By myFavList = By.xpath("//a[contains(@href, 'https://www.n11.com/hesabim/istek-listelerim')]");
    By deleteProduct = By.xpath("//div[3]/span");
    By deleteOk = By.xpath("//div[5]/div/div/span");
    By quitButton = By.xpath("//header[@id='header']/div/div/div[2]/div[2]/div[2]/div[2]/div/a[8]");

    protected WebDriver driver;

    public Constants(WebDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void Hover(WebDriver driver, WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}