import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractTest {
    @BeforeEach
    void setUp() {
        closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = BaseTest.class.getName();
    }
}
