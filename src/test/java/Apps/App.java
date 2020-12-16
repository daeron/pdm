package Apps;

import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.codeborne.selenide.Selenide.open;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.WebDriverRunner;

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
