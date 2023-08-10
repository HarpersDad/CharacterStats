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
    Items[] inventory = new Items[25];

    // equipped items array
    Items[] equipment = new Items[10];

    // equipment slots
    Items mainWeapon; // 0
    Items offHand; // 1
    Items head; // 2
    Items neck; // 3
    Items chest; // 4
    Items hands; // 5
    Items ring; // 6
    Items belt; // 7
    Items legs; // 8
    Items feet; // 9

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

    void itemEquipped()
    {
        if (this.mainWeapon != null) {
            switch (this.mainWeapon.buff) {
                case "hp" -> {
                    this.hp += this.mainWeapon.buffAmount;
                }

                case "str" -> {
                    this.str += this.mainWeapon.buffAmount;
                }
                case "def" -> {
                    this.def += this.mainWeapon.buffAmount;
                }

                case "con" -> {
                    this.con += this.mainWeapon.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.mainWeapon.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.mainWeapon.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.mainWeapon.buffAmount;
                }
            }
        }

        if (this.offHand != null) {
            switch (this.offHand.buff) {
                case "hp" -> {
                    this.hp += this.offHand.buffAmount;
                }

                case "str" -> {
                    this.str += this.offHand.buffAmount;
                }
                case "def" -> {
                    this.def += this.offHand.buffAmount;
                }

                case "con" -> {
                    this.con += this.offHand.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.offHand.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.offHand.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.offHand.buffAmount;
                }
            }
        }

        if (this.head != null) {
            switch (this.head.buff) {
                case "hp" -> {
                    this.hp += this.head.buffAmount;
                }

                case "str" -> {
                    this.str += this.head.buffAmount;
                }
                case "def" -> {
                    this.def += this.head.buffAmount;
                }

                case "con" -> {
                    this.con += this.head.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.head.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.head.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.head.buffAmount;
                }
            }
        }

        if (this.neck != null) {
            switch (this.neck.buff) {
                case "hp" -> {
                    this.hp += this.neck.buffAmount;
                }

                case "str" -> {
                    this.str += this.neck.buffAmount;
                }
                case "def" -> {
                    this.def += this.neck.buffAmount;
                }

                case "con" -> {
                    this.con += this.neck.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.neck.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.neck.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.neck.buffAmount;
                }
            }
        }

        if (this.chest != null) {
            switch (this.chest.buff) {
                case "hp" -> {
                    this.hp += this.chest.buffAmount;
                }

                case "str" -> {
                    this.str += this.chest.buffAmount;
                }
                case "def" -> {
                    this.def += this.chest.buffAmount;
                }

                case "con" -> {
                    this.con += this.chest.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.chest.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.chest.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.chest.buffAmount;
                }
            }
        }

        if (this.hands != null) {
            switch (this.hands.buff) {
                case "hp" -> {
                    this.hp += this.hands.buffAmount;
                }

                case "str" -> {
                    this.str += this.hands.buffAmount;
                }
                case "def" -> {
                    this.def += this.hands.buffAmount;
                }

                case "con" -> {
                    this.con += this.hands.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.hands.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.hands.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.hands.buffAmount;
                }
            }
        }

        if (this.ring != null) {
            switch (this.ring.buff) {
                case "hp" -> {
                    this.hp += this.ring.buffAmount;
                }

                case "str" -> {
                    this.str += this.ring.buffAmount;
                }
                case "def" -> {
                    this.def += this.ring.buffAmount;
                }

                case "con" -> {
                    this.con += this.ring.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.ring.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.ring.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.ring.buffAmount;
                }
            }
        }

        if (this.belt != null) {
            switch (this.belt.buff) {
                case "hp" -> {
                    this.hp += this.belt.buffAmount;
                }

                case "str" -> {
                    this.str += this.belt.buffAmount;
                }
                case "def" -> {
                    this.def += this.belt.buffAmount;
                }

                case "con" -> {
                    this.con += this.belt.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.belt.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.belt.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.belt.buffAmount;
                }
            }
        }

        if (this.legs != null) {
            switch (this.legs.buff) {
                case "hp" -> {
                    this.hp += this.legs.buffAmount;
                }

                case "str" -> {
                    this.str += this.legs.buffAmount;
                }
                case "def" -> {
                    this.def += this.legs.buffAmount;
                }

                case "con" -> {
                    this.con += this.legs.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.legs.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.legs.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.legs.buffAmount;
                }
            }
        }

        if (this.feet != null) {
            switch (this.feet.buff) {
                case "hp" -> {
                    this.hp += this.feet.buffAmount;
                }

                case "str" -> {
                    this.str += this.feet.buffAmount;
                }
                case "def" -> {
                    this.def += this.feet.buffAmount;
                }

                case "con" -> {
                    this.con += this.feet.buffAmount;
                }

                case "wis" -> {
                    this.wis += this.feet.buffAmount;
                }

                case "spd" -> {
                    this.spd += this.feet.buffAmount;
                }

                case "lck" -> {
                    this.lck += this.feet.buffAmount;
                }
            }

        }
    }
}
