package realJSONPojo.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import pojo.example.AccessEmployee;

public class retriveJson {

	public static void main(String[] args) throws JsonProcessingException {
		
		createJson createson = new createJson();
		ObjectMapper obj = new ObjectMapper();
		String json =obj.writeValueAsString(createson.prepareJson());
		System.out.println(json);
		
		
		JSONObject jsonobject= new JSONObject();
		JSONArray array = new JSONArray(json);
		int length =array.length();
		System.out.println(length);
		
		for(int i=0;i<length;i++) {
		jsonobject= array.getJSONObject(i);
		
		JSONObject jsonBetters = jsonobject.getJSONObject("batters");
		JSONArray better = jsonBetters.getJSONArray("batter");
		
		for(int j=0;j<better.length();j++ ) {	
			JSONObject betterJson = better.getJSONObject(j);
			System.out.println("id="+betterJson.get("id")+", type="+betterJson.getString("type"));
			
		}
		
		
		
		}
		
		
		

	}

}
