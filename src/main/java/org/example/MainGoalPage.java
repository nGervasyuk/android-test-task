package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class MainGoalPage {

    private final SelenideElement muscleGainOption = $(By.id("containerMuscleGain"));
    private final SelenideElement weightLossOption = $(By.id("containerWeightLoss"));

    public MainGoalPage selectOption(Goal optionName) {
        getOption(optionName).click();
        return this;
    }

    public boolean isOptionSelected(Goal optionName) {
        return getOption(optionName).isSelected();
    }

    private SelenideElement getOption(Goal optionName) {
        return optionName.equals(Goal.MUSCLE_GAIN) ? muscleGainOption : weightLossOption;
    }
}

