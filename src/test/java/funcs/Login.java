package funcs;

import com.google.gson.JsonObject;
import pages.PageLogin;
public class Login {

	public void realizeLogin(JsonObject loginData) {
		PageLogin login = new PageLogin();
		login.clickLogin();
		login.fillLogin(loginData.get("user").getAsString());
		login.clickNext();
		login.fillPass(loginData.get("pass").getAsString());
		login.submitLogin();
	}
}
