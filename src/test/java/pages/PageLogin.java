package pages;

import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

public class PageLogin {

	public void clickLogin() {
		$(By.linkText("Login")).click();
	}
	
	public void fillLogin(String login) {
		$(By.id("emailOrPhoneInput")).setValue(login);
	}
	public void clickNext() {
		$(By.id("signInButton")).click();
	}
	public void fillPass(String pass) {
		$(By.id("passwordInput")).setValue(pass);
	}

	public void submitLogin() {
		$(By.id("signInButton")).click();
		$(By.name("Incorrect email or password. Please try again.")).exists();
	}
}