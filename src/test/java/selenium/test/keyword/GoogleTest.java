package selenium.test.keyword;

import io.github.bonigarcia.wdm.WebDriverManager;
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
    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        webDriver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        webDriver.close();
    }

    @Test
    void TestEnglishGooglePage() {
        webDriver.get("https://www.google.com/?hl=en");
        webDriver.findElement(By.xpath("//*[contains(@value,'Google Search')]"));
        webDriver.findElement(By.xpath("//*[contains(@value,\"I'm Feeling Luck\")]"));
        webDriver.findElement(By.xpath("//*[text()='Gmail']"));
        webDriver.findElement(By.xpath("//*[text()='Images']"));
    }

    @Test
    void TestPortugueseGooglePage() {
        webDriver.get("https://www.google.com/?hl=pt");
        webDriver.findElement(By.xpath("//*[contains(@value,'Pesquisa Google')]"));
        webDriver.findElement(By.xpath("//*[contains(@value,'Estou com sorte')]"));
        webDriver.findElement(By.xpath("//*[text()='Gmail']"));
        webDriver.findElement(By.xpath("//*[text()='Imagens']"));
    }

    @Test
    void TestSpanishGooglePage() {
        webDriver.get("https://www.google.com/?hl=es");
        webDriver.findElement(By.xpath("//*[contains(@value,'Buscar con Google')]"));
        webDriver.findElement(By.xpath("//*[contains(@value,'Voy a tener suerte')]"));
        webDriver.findElement(By.xpath("//*[text()='Gmail']"));
        webDriver.findElement(By.xpath("//*[text()='Imágenes']"));
    }

    @Test
    void TestItalianGooglePage() {
        webDriver.get("https://www.google.com/?hl=it");
        webDriver.findElement(By.xpath("//*[contains(@value,'Cerca con Google')]"));
        webDriver.findElement(By.xpath("//*[contains(@value,'Mi sento fortunato')]"));
        webDriver.findElement(By.xpath("//*[text()='Gmail']"));
        webDriver.findElement(By.xpath("//*[text()='Immagini']"));
    }
}
