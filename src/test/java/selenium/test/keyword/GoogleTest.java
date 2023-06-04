package selenium.test.keyword;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.List;

public class GoogleTest {

    WebDriver webDriver;
    List<String> languageList;
    @Before
    void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        webDriver = new ChromeDriver(options);
    }

    @After
    void tearDown() {
        webDriver.close();
    }

    @Test
    void TestEnglishGooglePage() {

    }

    @Test
    void TestPortugueseGooglePage() {

    }

    @Test
    void TestSpanishGooglePage() {
        
    }

    @Test
    void TestItalianGooglePage() {
        
    }
}
