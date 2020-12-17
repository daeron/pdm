package Apps;

import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;

import com.codeborne.selenide.Configuration;

public class App {

	public void startPodiumApp() throws MalformedURLException {

		Configuration.remote = "http://localhost:4444/wd/hub";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setVersion("87.0");
		capabilities.setCapability("enableVNC", true);
		capabilities.setCapability("enableVideo", true);
		capabilities.setCapability("enableLog", true);
		Configuration.browserCapabilities = capabilities;
		LoggingPreferences logPrefs = new LoggingPreferences();
	}

	public void finishExpenseApp() {
		//WebDriverRunner.closeWebDriver();
	}
}
