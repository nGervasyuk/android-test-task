package org.example;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

import java.time.Duration;

public class WelcomePage {

    private final SelenideElement startButton = $(By.id("btnContinue"));
    private final SelenideElement title = $(By.xpath("//android.widget.TextView[1]"));
    private final SelenideElement policyData = $(By.id("tvTerms"));

    public void clickStartButton() {
        startButton.shouldBe(Condition.visible, Condition.enabled).click();
    }

    public void clickPrivacyPolicyLink() {
        policyData.shouldBe(Condition.visible, Condition.enabled).click();
    }

    public boolean isScreenDisplayed() {
        return isTitleDisplayed() && isPolicyDisplayed() && isStartButtonDisplayed();
    }

    private boolean isPolicyDisplayed() {
        return policyData.isDisplayed();
    }

    private boolean isTitleDisplayed() {
        return title.shouldBe(Condition.visible, Duration.ofSeconds(20)).isDisplayed();
    }

    private boolean isStartButtonDisplayed() {
        return startButton.isDisplayed();
    }
}
