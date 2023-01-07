package webservices;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class MyParser {
    private static final String JSON = "src/test/resources/markups/recipe.json";

    public void parseGSON() throws IOException {

        Gson gson = new Gson();

        Recipe recipe = gson.fromJson(new JsonReader(new FileReader(JSON)), Recipe.class);

        System.out.println(recipe.getIngredlist());
        System.out.println(recipe.getPreptime());
        System.out.println(recipe.getRecipename());
    }
}
