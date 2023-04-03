package org.example;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomePage {

    private final SelenideElement startButton = $(By.id("btnContinue"));
    private final SelenideElement title = $(By.linkText("BUILD YOUR PERFECT BODY"));
    private final SelenideElement policyData = $(By.id("tvTerms"));

    public void clickStartButton() {
        startButton.shouldBe(Condition.visible, Condition.enabled).click();
    }

    public void clickPrivacyPolicyLink() {
        startButton.shouldBe(Condition.visible, Condition.enabled).click();
    }

    public void clickTermsOfUseLink() {
        startButton.shouldBe(Condition.visible, Condition.enabled).click();
    }

    public boolean isScreenDisplayed() {
        return isTitleDisplayed() && isPolicyDisplayed() && isStartButtonDisplayed();
    }
    private boolean isPolicyDisplayed() {
        return policyData.isDisplayed();
    }
    private boolean isTitleDisplayed() {
        return title.isDisplayed();
    }

    private boolean isStartButtonDisplayed() {
        return startButton.isDisplayed();
    }
}
