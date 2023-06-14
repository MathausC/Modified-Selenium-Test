package selenium.test.keyword;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GoogleTestWithKeywords {

    private List<String> languages;
    private WebDriver webDriver;
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        RemoteWebDriver.addLanguagePropertie("src/test/resources/google/portuguese-language.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/google/english-language.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/google/italian-language.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/google/spanish-language.properties");
        languages = new ArrayList<>();
        languages.add("pt");
        languages.add("en");
        languages.add("es");
        //languages.add("it");
    }

    @AfterEach
    public void tearDown() {
        webDriver.close();
    }

    @Test
    public void googleTest2() {
        for(String language : languages) {
            webDriver.get("https://www.google.com/?hl=" + language);
            assertElementIfVisible("(//*[@aria-label=\"${google-search}\"])[2]");
            assertElementIfVisible("(//*[@aria-label=\"${im-feeling-luck}\"])[2]");
            assertElementIfVisible("//*[text()=\"${gmail}\"]");
            assertElementIfVisible("//*[text()=\"${images}\"]");
            assertElementIfVisible("//*[text()=\"${about}\"]");
        }
    }

    private void assertElementIfVisible(String keyword) {
        By by = By.keyword(keyword);
        WebElement element = webDriver.findElement(by);
        Assertions.assertTrue(element.isDisplayed());
    }
}
