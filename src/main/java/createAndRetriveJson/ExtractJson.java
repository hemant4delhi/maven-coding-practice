package createAndRetriveJson;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonObject;

public class ExtractJson {

	public static void main(String[] args) {
		String input = "{\r\n"
				+ "  \"page\": 2,\r\n"
				+ "  \"per_page\": 6,\r\n"
				+ "  \"total\": 12,\r\n"
				+ "  \"total_pages\": 2,\r\n"
				+ "  \"data\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 7,\r\n"
				+ "      \"email\": \"michael.lawson@reqres.in\",\r\n"
				+ "      \"first_name\": \"Michael\",\r\n"
				+ "      \"last_name\": \"Lawson\",\r\n"
				+ "      \"avatar\": \"https:reqres.inimgfaces7-image.jpg\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"id\": 8,\r\n"
				+ "      \"email\": \"lindsay.ferguson@reqres.in\",\r\n"
				+ "      \"first_name\": \"Lindsay\",\r\n"
				+ "      \"last_name\": \"Ferguson\",\r\n"
				+ "      \"avatar\": \"https:reqres.inimgfaces8-image.jpg\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"id\": 9,\r\n"
				+ "      \"email\": \"tobias.funke@reqres.in\",\r\n"
				+ "      \"first_name\": \"Tobias\",\r\n"
				+ "      \"last_name\": \"Funke\",\r\n"
				+ "      \"avatar\": \"https:reqres.inimgfaces9-image.jpg\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"id\": 10,\r\n"
				+ "      \"email\": \"byron.fields@reqres.in\",\r\n"
				+ "      \"first_name\": \"Byron\",\r\n"
				+ "      \"last_name\": \"Fields\",\r\n"
				+ "      \"avatar\": \"https:reqres.inimgfaces10-image.jpg\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"id\": 11,\r\n"
				+ "      \"email\": \"george.edwards@reqres.in\",\r\n"
				+ "      \"first_name\": \"George\",\r\n"
				+ "      \"last_name\": \"Edwards\",\r\n"
				+ "      \"avatar\": \"https:reqres.inimgfaces11-image.jpg\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"id\": 12,\r\n"
				+ "      \"email\": \"rachel.howell@reqres.in\",\r\n"
				+ "      \"first_name\": \"Rachel\",\r\n"
				+ "      \"last_name\": \"Howell\",\r\n"
				+ "      \"avatar\": \"https:reqres.inimgfaces12-image.jpg\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"support\": {\r\n"
				+ "    \"url\": \"https:reqres.in#support-heading\",\r\n"
				+ "    \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
				+ "  }\r\n"
				+ "}";
		
		
		JSONObject json = new JSONObject(input);
		
		JSONArray obj =json.getJSONArray("data");
	
		
		for(int i=0;i<obj.length();i++) {
			JSONObject inner = obj.getJSONObject(i);
			System.out.print(" email : "+inner.get("email"));
			System.out.print(" avatar : "+inner.get("avatar"));
			System.out.println();
		}
	

	}

}
