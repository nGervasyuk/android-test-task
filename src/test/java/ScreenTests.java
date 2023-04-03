import static java.lang.String.format;
import static org.example.Goal.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.MainGoalPage;
import org.example.WelcomePage;
import org.junit.jupiter.api.Test;

public class ScreenTests extends AbstractTest {

    private final WelcomePage welcomePage = new WelcomePage();
    private final MainGoalPage mainGoalPage = new MainGoalPage();

    @Test
    void example() {
        assertTrue(welcomePage.isScreenDisplayed(), "Screen is not displayed");
        welcomePage.clickPrivacyPolicyLink();
    }

    @Test
    void verifyCanSelectMainGoal() {
        welcomePage.clickStartButton();

        assertTrue(mainGoalPage.selectOption(MUSCLE_GAIN)
                .isOptionSelected(MUSCLE_GAIN), format("%s is not selected", MUSCLE_GAIN));
        assertFalse(mainGoalPage.isOptionSelected(WEIGHT_LOSS));

        assertTrue(mainGoalPage.selectOption(WEIGHT_LOSS)
                .isOptionSelected(WEIGHT_LOSS), format("%s should not be selected", WEIGHT_LOSS));
        assertFalse(mainGoalPage.isOptionSelected(MUSCLE_GAIN));
    }
}
