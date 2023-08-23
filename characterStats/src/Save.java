import com.google.gson.*;
import org.json.*;
import org.json.JSONArray;
import org.json.JSONString;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;

public class Save
{
    static JSONObject obj;
    static JSONObject obj2;
    static BufferedWriter writer;
    static File myFile = new File("saveData.json");

    static JSONObject[] jsonArray = new JSONObject[12];

    Save(){}

    // saves character data to array
    static void saveStats(Player player, int position)
    {
        // json objects used to store save data
        obj = new JSONObject();

        // set player name
        obj.put("name", player.name);

        // set player sex
        obj.put("sex", player.sex);

        // set player job
        obj.put("job", player.job);

        // set player gear
        // will need to list out each slot for gear and inventory
        obj.put("gear", player.equipment[0].type);

        // set player status
        obj.put("status", player.status);

        // set player level
        obj.put("level", player.level);

        // set player hp
        obj.put("hp", player.hp);

        // set player currHP
        obj.put("MaxHP", player.MaxHP);

        // set player str
        obj.put("str", player.str);

        // set player def
        obj.put("def", player.def);

        // set player con
        obj.put("con", player.con);

        // set player wis
        obj.put("wis", player.wis);

        // set player spd
        obj.put("spd", player.spd);

        // set player lck
        obj.put("lck", player.lck);

        // set player xp
        obj.put("xp", player.xp);

        // set player str
        obj.put("xpToNextLevel", player.xpToNextLevel);

        // add save data to array at the pre-defined position
        jsonArray[position] = obj;
    }

    // method that loads the character data into the program
    static void loadStats(int position)
    {
        // object used to parse the file
        Object ob = null;

        // try / catch that parses the json data
        try
        {
            if (myFile.exists())
            {
                ob = new JSONParser().parse(new FileReader(myFile));
            }
        }
        catch (IOException | ParseException e)
        {
            throw new RuntimeException(e);
        }

        // sets the main json and depending on the position the inner json being read
        JSONObject outerJO = (JSONObject) ob;

        if ((JSONObject) outerJO.get(Integer.toString(position)) != null)
        {
            JSONObject innerJO = (JSONObject) outerJO.get(Integer.toString(position));

            // creates a parser for the inner json so that the data can be referenced
            JsonParser parser = new JsonParser();
            JsonObject jo = (JsonObject) parser.parse(String.valueOf(innerJO));

            // using the key values in the json, set the cooresponding variables for the character data
            String name = (String) jo.get("name").getAsString();
            String sex = (String) jo.get("sex").getAsString();
            String status = (String) jo.get("status").getAsString();
            String job = (String) jo.get("job").getAsString();
            String equip = (String) jo.get("gear").getAsString();
            int level = Integer.parseInt(jo.get("level").getAsString());
            double xp = (double) jo.get("xp").getAsDouble();
            double xpUp = (double) jo.get("xpToNextLevel").getAsDouble();
            int hp = Integer.parseInt(jo.get("hp").toString());
            int MaxHP = Integer.parseInt(jo.get("MaxHP").toString());
            int str = Integer.parseInt(jo.get("str").toString());
            int def = Integer.parseInt(jo.get("def").toString());
            int con = Integer.parseInt(jo.get("con").toString());
            int wis = Integer.parseInt(jo.get("wis").toString());
            int spd = Integer.parseInt(jo.get("spd").toString());
            int lck = Integer.parseInt(jo.get("lck").toString());

            // re-create the player using the saved data
            Player player = new Player(name, job, sex, equip);

            // set the player stats using the saved data
            player.MaxHP = MaxHP;
            player.xp = xp;
            player.status = status;
            player.level = level;
            player.xpToNextLevel = xpUp;
            player.hp = hp;
            player.str = str;
            player.def = def;
            player.con = con;
            player.wis = wis;
            player.spd = spd;
            player.lck = lck;

            // place the character in the character array using the position that was passed to the method
            Main.characters[position] = player;
            Main.characters[position].gearEquipped();
            StatUI.characterBox.setEnabled(true);
        }
    }

    // writes character's data to json file
    static void saveAsJson()
    {
        // initialize obj2
        obj2 = new JSONObject();

        // for loop that takes the data from the array and adds it to the json object
        for (int i = 0; i < jsonArray.length; i++)
        {
            obj2.put(i, jsonArray[i]);
        }

        // creates the writer that uses the json file
        try
        {
            writer = new BufferedWriter(new FileWriter(myFile));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        // try / catch that writes the nested json to the save file
        try
        {
            writer.write(obj2.toJSONString());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        // try catch that closes the file writer
        try
        {
            writer.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}