package realJSONPojo.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.restassured.RestAssured;

public class createJson {
	
	public List<MainPojoClass> prepareJson(){

		Topping better1 = new Topping();
		better1.setId("1001");
		better1.setType("Regular");
		
		Topping better2 = new Topping();
		better2.setId("1002");
		better2.setType("Chocolate");
		
		Topping better3 = new Topping();
		better3.setId("1003");
		better3.setType("Blueberry");
		
		Topping better4 = new Topping();
		better4.setId("1004");
		better4.setType("Devil's Food");
		
		List<Topping> betterList = new ArrayList<Topping>();
		betterList.add(better1);
		betterList.add(better2);
		betterList.add(better3);
		betterList.add(better4);
		
		Betters betters = new Betters();
		betters.setBatter(betterList);
		
		Topping topping1 = new Topping();
		topping1.setId("5001");
		topping1.setType("None");
		
		Topping topping2 = new Topping();
		topping2.setId("5002");
		topping2.setType("Glazed");
		
		Topping topping3 = new Topping();
		topping3.setId("5005");
		topping3.setType("Sugar");
		
		Topping topping4 = new Topping();
		topping4.setId("5007");
		topping4.setType("Powdered Sugar");
		
		Topping topping5 = new Topping();
		topping5.setId("5006");
		topping5.setType("Chocolate with Sprinkles");
		
		Topping topping6 = new Topping();
		topping6.setId("5003");
		topping6.setType("Chocolate");
		
		Topping topping7 = new Topping();
		topping7.setId("5004");
		topping7.setType("Maple");
		
		List<Topping> toppingList = new ArrayList<>();
		toppingList.add(topping1);
		toppingList.add(topping2);
		toppingList.add(topping3);
		toppingList.add(topping4);
		toppingList.add(topping5);
		toppingList.add(topping6);
		toppingList.add(topping7);
	
		
		MainPojoClass obj1 = new MainPojoClass();
		obj1.setId("0001");
		obj1.setType("donut");
		obj1.setName("Cake");
		obj1.setPpu(0.55);
		obj1.setBatters(betters);
		obj1.setTopping(toppingList);
		
		MainPojoClass obj2 = new MainPojoClass();
		obj2.setId("0002");
		obj2.setType("dinner");
		obj2.setName("chicken");
		obj2.setPpu(1.00);
		obj2.setBatters(betters);
		obj2.setTopping(toppingList);
		
		List<MainPojoClass> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		
	
		  //RestAssured.given().log().all() .body(list) .when().post();
		
		return list;
	}

	

}
