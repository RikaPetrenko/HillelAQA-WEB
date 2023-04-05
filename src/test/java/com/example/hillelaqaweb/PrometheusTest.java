package com.example.hillelaqaweb;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;


public class PrometheusTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prometheus.org.ua/");
    }


    @Test
    @DisplayName("Каталог курсів")
    public void courses() {

        String expected =  "Каталог курсів від Prometheus: безкоштовні, платні, з сертифікатом і без";

        driver.navigate().to("https://prometheus.org.ua/");
        driver.findElement(By.xpath("//*[@id=\"menu-item-6922\"]")).click();

        Assertions.assertTrue(driver.getCurrentUrl().contains("courses-catalog"));
        Assertions.assertEquals(driver.getTitle(), expected, "Courses opened successfully");
    }



    @Test
    @DisplayName("Сторінка реєстрації")
    public void registrationPageLoads() {
        String expected =  "Sign in or Register | Prometheus";

        driver.navigate().to("https://prometheus.org.ua/");
        driver.findElement(By.xpath("//li[@class='register']")).click();

        Assertions.assertTrue(driver.getCurrentUrl().contains("register"));
        Assertions.assertEquals(driver.getTitle(), expected, "Sign in or Register | Prometheus");



    }


    @AfterAll
    public static void tearDown() {

        driver.quit();
    }
}





