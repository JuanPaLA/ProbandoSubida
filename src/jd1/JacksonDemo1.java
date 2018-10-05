package jd1;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;



public class JacksonDemo1 {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		File file = new File("C:\\Users\\juanp\\Google Drive\\probando.txt");
		
		System.out.println("existe " + file.exists());
		
//		String carJson ="{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
//
//		try {
//		    Car car = objectMapper.readValue(carJson, Car.class);
//
//		    System.out.println("car brand = " + car.getBrand());
//		    System.out.println("car doors = " + car.getDoors());
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
		
	}

}
