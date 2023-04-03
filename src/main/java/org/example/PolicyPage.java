package org.example;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class PolicyPage {

    private final SelenideElement title = $(By.id("tvTitle"));

    private final SelenideElement backButton = $(By.className("android.widget.ImageButton"));

    public boolean isTitleDisplayed() {
        return title.isDisplayed();
    }

    public void clickBackButton() {
        backButton.shouldBe(Condition.visible).click();
    }
}
