package org.learn.gson;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JSONMapConverter 
{
    public static void main( String[] args )
    {
    	Gson objGson = new GsonBuilder().setPrettyPrinting().create();
    	    
    	Map<String,Person>mapIdPerson  = new HashMap<>();
    	mapIdPerson.put("10101001", new Person("Mike", "harvey", 34, "001894536"));
    	mapIdPerson.put("20202002", new Person("Nick", "young", 75,  "005425676"));
    	mapIdPerson.put("30303003", new Person("gary", "hudson", 21 ,"009654153"));
    	mapIdPerson.put("40404004", new Person("gary", "hudson", 55,"00564536"));
    	    	
    	Type listType = new TypeToken<Map<String,Person>>() {}.getType();
    	String mapToJson = objGson.toJson(mapIdPerson);
    	System.out.println("1. Map to JSON conversion is : \n");
    	System.out.println(mapToJson);
    	
    	//JSON to Map
    	Map<String,Person> jsonToMap = objGson.fromJson(mapToJson, listType);
    	System.out.println("2. JSON to Map conversion is :\n");
    	jsonToMap.forEach((k, v) -> 
        System.out.println(k + "=" + v));
    }
}
