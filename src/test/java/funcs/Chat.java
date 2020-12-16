package funcs;

import com.google.gson.JsonObject;

import pages.PageChat;

public class Chat {

	public void sendMessage(JsonObject chat) {
		PageChat chatnew = new PageChat();
		chatnew.cliclChat();
		chatnew.fillName(chat.get("name").getAsString());
		chatnew.fillPhone(chat.get("phone").getAsString());
		chatnew.fillMessage(chat.get("message").getAsString());	
	}
}
