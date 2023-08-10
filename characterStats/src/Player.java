// Player Class
public class Player
{

    // sets up the player stats by initializing each field that we want them to have
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

    // inventory array
    Items[] items = new Items[25];

    // Player constructor
    Player(String name, String job, String sex)
    {
        // creates the player by using the passed information
        this.name = name;
        this.job = job;
        this.sex = sex;
        this.level = 1;
        this.xp = 0;

        // adds stats to the player based on the job chosen
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

        // adds stats to the player based on the sex chosen
        switch (sex) {
            case "male" -> {
                this.hp += 3;
                this.str += 2;
                this.def += 2;
                this.con += 2;
                this.wis += 1;
                this.spd += 1;
                this.lck += 1;
            }

            case "female" -> {
                this.hp += 2;
                this.str += 1;
                this.def += 1;
                this.con += 1;
                this.wis += 2;
                this.spd += 2;
                this.lck += 2;
            }
        }
    }

    // method that levels the player up
    void checkLevelUp()
    {
        // if statement to check if the xp threshold has been reached for the next level
        if (this.xp >= Math.pow(xpToLevel, this.level))
        {
            // sets the remaining xp as current xp
            this.xp = this.xp - Math.pow(xpToLevel, this.level);

            // adds a level to the player level
            this.level++;

            // increases stats based on job chosen
            switch (this.job) {
                case "ranger" -> {
                    this.hp += (this.hp % this.level) + 3;
                    this.str += 2;
                    this.def += 2;
                    this.con += 1;
                    this.wis += 3;
                    this.spd += 3;
                    this.lck += 1;
                }

                case "fighter" -> {
                    this.hp += (this.hp % this.level) + 4;
                    this.str += 3;
                    this.def += 3;
                    this.con += 2;
                    this.wis += 1;
                    this.spd += 2;
                    this.lck += 1;
                }

                case "mage" -> {
                    this.hp += (this.hp % this.level) + 1;
                    this.str += 1;
                    this.def += 2;
                    this.con += 3;
                    this.wis += 3;
                    this.spd += 2;
                    this.lck += 1;
                }

                case "thief" -> {
                    this.hp += (this.hp % this.level) + 2;
                    this.str += 1;
                    this.def += 1;
                    this.con += 3;
                    this.wis += 2;
                    this.spd += 3;
                    this.lck += 2;
                }
            }

            // print message that tells the user that the player has leveled up and the player's current level
            System.out.println(this.name + " Leveled Up!");
            System.out.println(this.name + " is now level " + this.level);
        }
    }
}
