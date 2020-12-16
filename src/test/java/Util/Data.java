package Util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Data {

	public JsonObject performData(String data) throws FileNotFoundException {
		final String dir = System.getProperty("user.dir");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(dir+"\\src\\test\\java\\data\\data.json"));
		Gson gson = new Gson();
		JsonObject js = gson.fromJson(bufferedReader, JsonObject.class);	
		JsonObject jsData = js.getAsJsonObject(data);
		return jsData;
	}
}