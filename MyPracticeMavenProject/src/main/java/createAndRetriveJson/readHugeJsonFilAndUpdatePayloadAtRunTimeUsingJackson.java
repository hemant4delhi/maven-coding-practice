package createAndRetriveJson;


import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



public class readHugeJsonFilAndUpdatePayloadAtRunTimeUsingJackson {

	public static void main(String[] args) throws JsonProcessingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		//Object array = mapper.readValue(new File(".\\src\\main\\resources\\test.json"), Object.class);
		JsonNode node =mapper.readTree(new File(".\\src\\main\\resources\\test.json"));

		System.out.println(node.get("name").asText());
		

	}

}
