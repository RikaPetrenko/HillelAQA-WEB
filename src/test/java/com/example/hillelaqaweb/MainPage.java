package com.example.hillelaqaweb;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public WebElement courses = $(By.xpath("//*[@id=\"menu-item-6922\"]")); //*[@id="menu-item-6922"]

    public WebElement registrationPageLoads = $(By.xpath("//li[@class='register']"));



}
