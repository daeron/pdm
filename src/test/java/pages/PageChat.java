package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selectors.byCssSelector;

import org.openqa.selenium.By;

public class PageChat {

	public void cliclChat() {
		switchTo().frame(3);
		$(byCssSelector("polygon")).click();
		switchTo().defaultContent();
		switchTo().frame(2);
	}

	public void fillName(String name) {
		$(By.id("Name")).setValue(name);

	}

	public void fillPhone(String phone) {
		$(By.id("Mobile Phone")).setValue(phone);

	}

	public void fillMessage(String message) {
		$(By.id("Message")).setValue(message);

	}

}