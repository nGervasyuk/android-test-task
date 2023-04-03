import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractTest {
    @BeforeEach
    void setUp() {
        closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = BaseTest.class.getName();
        open();
    }
}
