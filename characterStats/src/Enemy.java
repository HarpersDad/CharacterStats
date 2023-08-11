// Enemy Class
public class Enemy
{
    // Sets up the enemy stats by initializing the fields we want the enemies to have
    String name;
    String type;
    int hp;
    int str;
    int def;
    int con;
    int wis;
    int spd;
    int lck;
    int givenXP;
    // we can later create a method that checks what players were in the battle, scale the xp to their levels and divide it amongst those players

    // Enemy constructor
    Enemy(String name, String type)
    {
        // sets the enemies name and type based on what is passed to the method
        this.name = name;
        this.type = type;

        // sets stats based on what type is passed into the method
        switch (type)
        {
            case ("flyer")
                    -> {
                this.hp = 5;
                this.str = 3;
                this.def = 2;
                this.con = 4;
                this.wis = 2;
                this.spd = 6;
                this.lck = 3;
                this.givenXP = 10;
            }
            case ("attacker")
                    -> {
                this.hp = 8;
                this.str = 6;
                this.def = 4;
                this.con = 2;
                this.wis = 2;
                this.spd = 3;
                this.lck = 3;
                this.givenXP = 10;
            }
            case ("magician")
                    -> {
                this.hp = 4;
                this.str = 2;
                this.def = 2;
                this.con = 4;
                this.wis = 6;
                this.spd = 3;
                this.lck = 3;
                this.givenXP = 10;
            }
        }
    }
}
