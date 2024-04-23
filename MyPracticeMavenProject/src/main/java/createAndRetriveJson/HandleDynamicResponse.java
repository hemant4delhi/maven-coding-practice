package createAndRetriveJson;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HandleDynamicResponse {
	
	public void postRequest() {
	//List	
	//RestAssured.baseURI = "https://run.mocky.io/v3/d41dfed1-56e0-4bda-acb5-59b2ffe06bcd"; 
	
	//Map
	RestAssured.baseURI = "https://run.mocky.io/v3/3b30d119-6be5-4781-b68b-79c943e30e40";
	RequestSpecification request = RestAssured.given();
	Response response = request.post();
	
	Object obj = response.as(Object.class);
	
	if(obj instanceof Map) {
		Map responseofMap = (Map)obj;
		System.out.println(responseofMap);
		
	} else if (obj instanceof List) {
		List responseofList = (List) obj;
		System.out.println(responseofList.size());
	}
	

	
	}

	public static void main(String[] args) {
		HandleDynamicResponse obj = new HandleDynamicResponse();
		obj.postRequest();

	}

}
