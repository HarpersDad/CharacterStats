public class Enemy
{
    String name;
    String type;
    int hp;
    int str;
    int def;
    int con;
    int wis;
    int spd;
    int lck;

    Enemy(String name, String type)
    {
        this.name = name;

        switch (type) {
            case ("flyer") -> {
                this.hp = 5;
                this.str = 3;
                this.def = 2;
                this.con = 4;
                this.wis = 2;
                this.spd = 6;
                this.lck = 3;
            }
            case ("attacker") -> {
                this.hp = 8;
                this.str = 6;
                this.def = 4;
                this.con = 2;
                this.wis = 2;
                this.spd = 3;
                this.lck = 3;
            }
            case ("magician") -> {
                this.hp = 4;
                this.str = 2;
                this.def = 2;
                this.con = 4;
                this.wis = 6;
                this.spd = 3;
                this.lck = 3;
            }
        }
    }
}
