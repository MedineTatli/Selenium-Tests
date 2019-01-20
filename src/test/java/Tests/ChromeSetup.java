package Tests;

public class ChromeSetup {

    public static void prepareToConnectChrome()
    {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver/chromedriver.exe");
    }
}
