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
    static Gson gson;
    static JSONObject obj;
    static JSONObject obj2;
    static BufferedWriter writer;
    Save(){}
    static void saveStats(Player player, int position)
    {
        File myFile = new File("saveData.json");
        obj = new JSONObject();
        obj2 = new JSONObject();

        try
        {
            writer = new BufferedWriter(new FileWriter(myFile));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        // set player name
        obj.put("name", player.name);

        // set player sex
        obj.put("sex", player.sex);

        // set player job
        obj.put("job", player.job);

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

        obj2.put(position, obj);

        try
        {
            writer.write(obj2.toJSONString());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        try
        {
            writer.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static void loadStats(int position)
    {
        File myFile = new File("saveData.json");

        Object ob;
        Object ob2;

        try
        {
            ob = new JSONParser().parse(new FileReader(myFile));
        }
        catch (IOException | ParseException e)
        {
            throw new RuntimeException(e);
        }

        JSONObject outerJO = (JSONObject) ob;
        JSONObject json = (JSONObject) outerJO.get(Integer.toString(position));

        JsonParser parser = new JsonParser();
        JsonObject jo = (JsonObject) parser.parse(String.valueOf(json));
        System.out.println(jo);

        String name = (String) jo.get("name").toString();
        String sex = (String) jo.get("sex").toString();
        String status = (String) jo.get("status").toString();
        String job = (String) jo.get("job").toString();
        int level = Integer.parseInt(jo.get("level").toString());
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

        Player player = new Player(name,job, sex);

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

        Main.characters[position] = player;
    }
}
