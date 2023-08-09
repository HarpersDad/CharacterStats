import java.sql.SQLOutput;
import java.math.*;

public class Player
{
    String name;
    String job;
    String sex;
    int level;
    int hp;
    int str;
    int def;
    int con;
    int wis;
    int spd;
    int lck;
    double xp;
    int xpToLevel = 2;

    Player(String name, String job, String sex)
    {
        this.name = name;
        this.job = job;
        this.sex = sex;
        this.level = 1;
        this.xp = 0;

        switch (job) {
            case "ranger" -> {
                this.hp = 10;
                this.str = 2;
                this.def = 2;
                this.con = 1;
                this.wis = 3;
                this.spd = 3;
                this.lck = 1;
            }
            case "fighter" -> {
                this.hp = 13;
                this.str = 3;
                this.def = 2;
                this.con = 1;
                this.wis = 1;
                this.spd = 3;
                this.lck = 2;
            }
            case "mage" -> {
                this.hp = 6;
                this.str = 1;
                this.def = 2;
                this.con = 3;
                this.wis = 3;
                this.spd = 2;
                this.lck = 1;
            }
            case "thief" -> {
                this.hp = 8;
                this.str = 1;
                this.def = 1;
                this.con = 3;
                this.wis = 2;
                this.spd = 3;
                this.lck = 2;
            }
        }

        switch (sex){
            case("male"):
                this.hp+=3;
                this.str+=2;
                this.def+=2;
                this.con+=2;
                this.wis+=1;
                this.spd+=1;
                this.lck+=1;

            case("female"):
                this.hp+=2;
                this.str+=1;
                this.def+=1;
                this.con+=1;
                this.wis+=2;
                this.spd+=2;
                this.lck+=2;
        }
    }

    void checkLevelUp()
    {
        if (this.xp >= Math.pow(xpToLevel, this.level))
        {
            this.xp = this.xp - Math.pow(xpToLevel, this.level);
            this.level++;

            switch (this.job){
                case("ranger"):
                    this.hp+= (this.hp % this.level) + 3;
                    this.str+=2;
                    this.def+=2;
                    this.con+=1;
                    this.wis+=3;
                    this.spd+=3;
                    this.lck+=1;
                    break;

                case("fighter"):
                    this.hp+= (this.hp % this.level) + 4;
                    this.str+=3;
                    this.def+=3;
                    this.con+=2;
                    this.wis+=1;
                    this.spd+=2;
                    this.lck+=1;
                    break;

                case("mage"):
                    this.hp+= (this.hp % this.level) + 1;
                    this.str+=1;
                    this.def+=2;
                    this.con+=3;
                    this.wis+=3;
                    this.spd+=2;
                    this.lck+=1;
                    break;

                case("thief"):this.hp+= (this.hp % this.level) + 2;
                    this.str+=1;
                    this.def+=1;
                    this.con+=3;
                    this.wis+=2;
                    this.spd+=3;
                    this.lck+=2;
                    break;
            }

            System.out.println(this.name + " Leveled Up!");
            System.out.println(this.name + " is now level " + this.level);
        }
    }
}
