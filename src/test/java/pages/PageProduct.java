package pages;

import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;
import com.codeborne.selenide.conditions.Visible;

public class PageProduct {

	public void messagePlatform() {
		$(By.linkText("Messaging Platform")).click();
	}

	public void validateVisibleFields() {
		$(By.id("LblFirstName")).shouldBe(Visible.enabled);
		$(By.id("LblLastName")).shouldBe(Visible.enabled);
		$(By.id("LblEmail")).shouldBe(Visible.enabled);
		$(By.id("LblCompany")).shouldBe(Visible.enabled);
		$(By.id("LblMobilePhone")).shouldBe(Visible.enabled);

	}
}
