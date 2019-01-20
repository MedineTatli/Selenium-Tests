package Tests;
import AutomationClass.Login;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AutomationTest extends ChromeSetup {

        private static WebDriver driver;

        @BeforeClass
        public static void setUp() throws Exception {

            prepareToConnectChrome();
        }

        @AfterClass
        public static void tearDown() throws Exception {
            driver.quit();
        }
        @Test
        public  void n11TestSenarios() throws InterruptedException {

            new Login(driver).login();

    }
}


