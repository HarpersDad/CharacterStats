import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class Save
{
    static JSONObject obj;
    static BufferedWriter writer;
    Save(){}
    static void saveStats(Player player, int position)
    {
        File myFile = new File("saveData.json");
        obj = new JSONObject();

        try
        {
            writer = new BufferedWriter(new FileWriter(myFile));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        // set player pos
        obj.put("pos", position);

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

        try {
            writer.write(obj.toJSONString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void loadStats() {
        File myFile = new File("saveData.json");

        Object ob;

        try {
            ob = new JSONParser().parse(new FileReader(myFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject jo = (JSONObject) ob;

        int pos = Integer.parseInt(jo.get("pos").toString());
        String name = (String) jo.get("name");
        String sex = (String) jo.get("sex");
        String status = (String) jo.get("status");
        String job = (String) jo.get("job");
        int level = Integer.parseInt(jo.get("level").toString());
        double xp = (double) jo.get("xp");
        double xpUp = (double) jo.get("xpToNextLevel");
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

        Main.characters[pos] = player;
    }
}
