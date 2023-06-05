package selenium.test.keyword;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.List;

public class ExampleTest {

    private List<String> languages;
    private WebDriver webDriver;
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        RemoteWebDriver.addLanguagePropertie("src/test/resources/google/english-language.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/google/portuguese-language.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/google/italian-language.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/google/spanish-language.properties");
        languages = new ArrayList<>();
        languages.add("en");
        languages.add("pt");
        languages.add("es");
        languages.add("it");
    }

    @AfterEach
    public void tearDown() {
        webDriver.close();
    }

    @Test
    public void googleTest() {
        for(String language : languages) {
            webDriver.get("https://www.google.com/?hl=" + language);
            assertElementVisible("(//*[@aria-label=\"${google-search}\"])[2]");
            assertElementVisible("(//*[@aria-label=\"${im-feeling-luck}\"])[2]");
            assertElementVisible("//*[text()=\"${gmail}\"]");
            assertElementVisible("//*[text()=\"${images}\"]");
        }
    }

    private void assertElementVisible(String keyword) {
        By by = By.keyword(keyword);
        WebElement element = webDriver.findElement(by);
        Assertions.assertTrue(element.isDisplayed());
    }
}
