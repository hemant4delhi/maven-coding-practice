package createAndRetriveJson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;

public class createAndRetriveJsonUsingHashMap {
	
public Map<String,Object> createJsonPayload() {
	Map<String,Object> finalPayload= new LinkedHashMap<>();
	finalPayload.put("name", "Chris");
	finalPayload.put("age", 23);
	
	Map<String , String> address = new LinkedHashMap<String, String>();
	address.put("city", "New York");
	address.put("country", "America");
	finalPayload.put("address",address );
	
	List< Map <String,Object >> friendsList = new ArrayList<>();
	
	Map<String, Object>  firstFriendMap = new LinkedHashMap<String, Object>();
	firstFriendMap.put("name", "Emily");
	List<String> firstFriendHoppiesList =Arrays.asList("biking","music","gaming");
	firstFriendMap.put("hobbies",firstFriendHoppiesList );
	friendsList.add(firstFriendMap);
	finalPayload.put("friends",friendsList );
	
	//2nd friend list
	Map<String, Object>  secondFriendMap = new LinkedHashMap<String, Object>();
	secondFriendMap.put("name", "John");
	
	List<String> secondFriendHoppiesList = Arrays.asList("soccer","gaming");
	secondFriendMap.put("hobbies", secondFriendHoppiesList);
	friendsList.add(secondFriendMap);
	
	
	return finalPayload;
	
	
	
	//RestAssured.given().log().all().body(finalPayload).post();
	
	
}

public void retriveJson(Map input) {
	JSONObject inputJSONObjet= new JSONObject(input);
	JSONArray friends = inputJSONObjet.getJSONArray("friends");
	int size = friends.length();
	for(int i=0;i<size;i++) {
		JSONObject friendsJson = friends.getJSONObject(i);
		System.out.println("name "+friendsJson.getString("name"));
		JSONArray hobbies = friendsJson.getJSONArray("hobbies");
	for(int j=0;j<hobbies.length();j++) {
		
		System.out.print(hobbies.get(j)+" ");
	}
		
		
	System.out.println();	
		
	}
	
	
	
	
}

	public static void main(String[] args) {
		createAndRetriveJsonUsingHashMap obj = new createAndRetriveJsonUsingHashMap();
		obj.retriveJson(obj.createJsonPayload());

	}

}
