import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@ParametersAreNonnullByDefault
public class BaseTest implements WebDriverProvider {
    @Nonnull
    public WebDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Mobile");
        options.setAvd("Nexus_5X_API_28");
        options.setPlatformVersion("9.0");
        options.setPlatformName("Android");
        options.setApp(System.getProperty("user.dir") + "/Test.apk");
        options.setNewCommandTimeout(Duration.ofSeconds(10));

        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
