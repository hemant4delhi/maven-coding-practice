package createAndRetriveJson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;





public class readJsonFromJsonFileAndUpdatedRequiredUsingJSONParser {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(new File(".\\\\src\\\\main\\\\resources\\\\test.json"));
		Object json =parser.parse(reader );
		System.out.println(json);
		// to convert this java object to jsonobject need to create pojo class so not recommended
		// for huge json files.
		
		
		

		
		

	}

}
