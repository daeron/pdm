package testCases;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.close;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.function.ToDoubleBiFunction;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Apps.App;
import Util.Data;
import funcs.Chat;
import funcs.Login;
import funcs.Produt;
public class TestScanarios {
	
	/**
	 * Main test classes
	 * @author Daeron
	 * TODO implement overrride to for base test
	 */
	
	private String url = "https://www.podium.com/";

	/**
	 * Method responsible to call the chrome
	 * @throws MalformedURLException
	 */
	@BeforeClass
	public static void setup() throws MalformedURLException {
		App app = new App();
		app.startPodiumApp();
	}

	/**
	 * Method responsible clear and finish browser
	 */
	@AfterClass
	public static void finish() {
		App app = new App();
		app.finishExpenseApp();
	}

	/**
	 * Method responsible to test login page
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void CTest01() throws FileNotFoundException, InterruptedException {
		open(url);
		Login login = new Login();
		Data data = new Data();
		login.realizeLogin(data.performData("loginError"));
		close();
	}

	/**
	 * Method responsible to test chat page
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void CTest02() throws FileNotFoundException, InterruptedException {
		open(url);
		Chat chat = new Chat();
		Data data = new Data();
		chat.sendMessage(data.performData("chat"));	
		close();
	}
	
	/**
	 * Method responsible to test forms
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void CTest03() {
		open(url);
		Produt produt = new Produt();
		produt.platform();
		close();
	}
}