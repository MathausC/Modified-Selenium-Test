package selenium.test.keyword;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.List;

public class GoogleTest {

    WebDriver webDriver;
    List<String> languageList;
    @BeforeEach
    void setUp() {
        RemoteWebDriver.addLanguagePropertie("src/test/resources/portuguese-languange.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/english-languange.properties");
        //RemoteWebDriver.addLanguagePropertie("src/test/resources/hebreu-languange.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/italian-languange.properties");
        //RemoteWebDriver.addLanguagePropertie("src/test/resources/russian-languange.properties");
        RemoteWebDriver.addLanguagePropertie("src/test/resources/spanish-languange.properties");
        //RemoteWebDriver.addLanguagePropertie("src/test/resources/arabic-languange.properties");
        languageList = new ArrayList<String>();
        languageList.add("pt");
        languageList.add("es");
        languageList.add("en");
        languageList.add("it");
        //languageList.add("ru");
        //languageList.add("iw");
        //languageList.add("ar");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeoptions = new ChromeOptions();
        webDriver = new ChromeDriver(chromeoptions);
    }

    @AfterEach
    void tearDown() {
        webDriver.close();
    }

    @Test
    void TestGooglePage() {
        for(String languange : languageList) {
            webDriver.get("https://www.google.com/?hl=" + languange);
            By googleSearchInput = By.keyword("//*[@value=\"${google-search}\"]");
            By imFeelingLuckInput = By.keyword("//*[@value=\"${im-feeling-luck}\"]");
            By gmailButton = By.keyword("//*[text()=\"${gmail}\"]");
            By imagesButton= By.keyword("//*[text()=\"${images}\"]");
            isElementPresent(googleSearchInput);
            isElementPresent(imFeelingLuckInput);
            isElementPresent(gmailButton);
            isElementPresent(imagesButton);
        }
    }

    private void isElementPresent(By element) {
        boolean isPresent = webDriver.findElement(element).isEnabled();
        Assertions.assertTrue(isPresent);
    }
}
