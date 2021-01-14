package lab1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
//inspire de:
//source: https://github.com/google/gson/blob/master/extras/src/main/java/com/
//           google/gson/extras/examples/rawcollections/RawCollectionsExample.java

public class Main {

	public static void main(String[] args) {
		List<DescriptionEtudiant> collection  = deserialize();
		trier(collection);
	    collection.forEach((o) -> System.out.println(o.getScore()));
	}

	private static void trier(List<DescriptionEtudiant>  collection) {
		//sort score
		 Collections.sort(collection, (o1, o2) -> {
			 return o1.getScore() < o2.getScore() ? 1 : -1;});
	}

	private static List<DescriptionEtudiant>  deserialize() {
		//to save student description
		List<DescriptionEtudiant>  collection = new ArrayList<DescriptionEtudiant>();
		 //use for deserialization
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    Path fileName = Path.of("C:\\Users\\jules\\eclipse-workspace\\lab1\\src\\main\\resources\\students_grade_mock_data.json");
	    String descriptions = null;
		try {
			descriptions = Files.readString(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	    @SuppressWarnings("deprecation")
		JsonParser parser = new JsonParser();
	    @SuppressWarnings("deprecation")
		JsonArray array = parser.parse(descriptions).getAsJsonArray();
	    
	    for (JsonElement jsonElement : array) {
	    	int id = gson.fromJson(jsonElement.getAsJsonObject().get("id"), int.class);
	    	int score =  gson.fromJson(jsonElement.getAsJsonObject().get("score"), int.class);
	    	Student student =  gson.fromJson(jsonElement.getAsJsonObject().get("student"), Student.class);
	    	collection.add(new DescriptionEtudiant(id, score, student));
		}
	    
	    return collection;
		
	}

}
